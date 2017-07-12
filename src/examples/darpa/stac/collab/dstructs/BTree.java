package darpa.stac.collab.dstructs;

import java.util.ArrayList;
import java.util.List;

import darpa.stac.collab.*;

public class BTree
{
    private static int T;
    private Node mRootNode;
    private static final int LEFT_CHILD_NODE = 0;
    private static final int RIGHT_CHILD_NODE = 1;
    public boolean calledmerge;
    static EventResultSet ers;
    
    BTree(final int t) {
        this.calledmerge = false;
        BTree.T = t;
        this.mRootNode = new Node();
        this.mRootNode.mIsLeafNode = true;
    }
    
    public BTree() {
        this.calledmerge = false;
        this.mRootNode = new Node();
        this.mRootNode.mIsLeafNode = true;
    }
    
    public boolean add(final long key, final Object object, final boolean log) {
        final Node rootNode = this.mRootNode;
        if (!this.update(this.mRootNode, key, object)) {
            if (rootNode.mNumKeys == 2 * BTree.T - 1) {
                final Node newRootNode = new Node();
                this.mRootNode = newRootNode;
                newRootNode.mIsLeafNode = false;
                this.splitChildNode(newRootNode, 0, this.mRootNode.mChildNodes[0] = rootNode);
                this.insertIntoNonFullNode(newRootNode, key, object);
            }
            else {
                this.insertIntoNonFullNode(rootNode, key, object);
            }
        }
        return true;
    }
    
    void splitChildNode(final Node parentNode, final int i, final Node node) {
        final Node newNode = new Node();
        newNode.mIsLeafNode = node.mIsLeafNode;
        newNode.mNumKeys = BTree.T - 1;
        for (int j = 0; j < BTree.T - 1; ++j) {
            newNode.mKeys[j] = node.mKeys[j + BTree.T];
            newNode.mObjects[j] = node.mObjects[j + BTree.T];
        }
        if (!newNode.mIsLeafNode) {
            for (int j = 0; j < BTree.T; ++j) {
                newNode.mChildNodes[j] = node.mChildNodes[j + BTree.T];
            }
            for (int j = BTree.T; j <= node.mNumKeys; ++j) {
                node.mChildNodes[j] = null;
            }
        }
        for (int j = BTree.T; j < node.mNumKeys; ++j) {
            node.mKeys[j] = 0L;
            node.mObjects[j] = null;
        }
        node.mNumKeys = BTree.T - 1;
        for (int j = parentNode.mNumKeys; j >= i + 1; --j) {
            parentNode.mChildNodes[j + 1] = parentNode.mChildNodes[j];
        }
        parentNode.mChildNodes[i + 1] = newNode;
        for (int j = parentNode.mNumKeys - 1; j >= i; --j) {
            parentNode.mKeys[j + 1] = parentNode.mKeys[j];
            parentNode.mObjects[j + 1] = parentNode.mObjects[j];
        }
        parentNode.mKeys[i] = node.mKeys[BTree.T - 1];
        parentNode.mObjects[i] = node.mObjects[BTree.T - 1];
        node.mKeys[BTree.T - 1] = 0L;
        node.mObjects[BTree.T - 1] = null;
        ++parentNode.mNumKeys;
    }
    
    void insertIntoNonFullNode(final Node node, final long key, final Object object) {
        int i = node.mNumKeys - 1;
        if (node.mIsLeafNode) {
            while (i >= 0 && key < node.mKeys[i]) {
                node.mKeys[i + 1] = node.mKeys[i];
                node.mObjects[i + 1] = node.mObjects[i];
                --i;
            }
            ++i;
            node.mKeys[i] = key;
            node.mObjects[i] = object;
            ++node.mNumKeys;
        }
        else {
            while (i >= 0 && key < node.mKeys[i]) {
                --i;
            }
            ++i;
            if (node.mChildNodes[i].mNumKeys == 2 * BTree.T - 1) {
                this.splitChildNode(node, i, node.mChildNodes[i]);
                if (key > node.mKeys[i]) {
                    ++i;
                }
            }
            this.insertIntoNonFullNode(node.mChildNodes[i], key, object);
        }
    }
    
    public long delete(final long key) {
        final long start = System.nanoTime();
        this.delete(this.mRootNode, key);
        return System.nanoTime() - start;
    }
    
    public void delete(final Node node, final long key) {
        if (node.mIsLeafNode) {
            final int i;
            if ((i = node.binarySearch(key)) != -1) {
                node.remove(i, 0);
            }
        }
        else {
            int i;
            if ((i = node.binarySearch(key)) != -1) {
                final Node leftChildNode = node.mChildNodes[i];
                final Node rightChildNode = node.mChildNodes[i + 1];
                if (leftChildNode.mNumKeys >= BTree.T) {
                    Node erasureNode;
                    Node predecessorNode;
                    for (predecessorNode = (erasureNode = leftChildNode); !predecessorNode.mIsLeafNode; predecessorNode = predecessorNode.mChildNodes[node.mNumKeys - 1]) {
                        erasureNode = predecessorNode;
                    }
                    node.mKeys[i] = predecessorNode.mKeys[predecessorNode.mNumKeys - 1];
                    node.mObjects[i] = predecessorNode.mObjects[predecessorNode.mNumKeys - 1];
                    this.delete(erasureNode, node.mKeys[i]);
                }
                else if (rightChildNode.mNumKeys >= BTree.T) {
                    Node erasureNode;
                    Node successorNode;
                    for (successorNode = (erasureNode = rightChildNode); !successorNode.mIsLeafNode; successorNode = successorNode.mChildNodes[0]) {
                        erasureNode = successorNode;
                    }
                    node.mKeys[i] = successorNode.mKeys[0];
                    node.mObjects[i] = successorNode.mObjects[0];
                    this.delete(erasureNode, node.mKeys[i]);
                }
                else {
                    final int medianKeyIndex = this.mergeNodes(leftChildNode, rightChildNode);
                    this.moveKey(node, i, 1, leftChildNode, medianKeyIndex);
                    this.delete(leftChildNode, key);
                }
            }
            else {
                i = node.subtreeRootNodeIndex(key);
                final Node childNode = node.mChildNodes[i];
                if (childNode.mNumKeys == BTree.T - 1) {
                    final Node leftChildSibling = (i - 1 >= 0) ? node.mChildNodes[i - 1] : null;
                    final Node rightChildSibling = (i + 1 <= node.mNumKeys) ? node.mChildNodes[i + 1] : null;
                    if (leftChildSibling != null && leftChildSibling.mNumKeys >= BTree.T) {
                        childNode.shiftRightByOne();
                        childNode.mKeys[0] = node.mKeys[i - 1];
                        childNode.mObjects[0] = node.mObjects[i - 1];
                        if (!childNode.mIsLeafNode) {
                            childNode.mChildNodes[0] = leftChildSibling.mChildNodes[leftChildSibling.mNumKeys];
                        }
                        final Node node2 = childNode;
                        ++node2.mNumKeys;
                        node.mKeys[i - 1] = leftChildSibling.mKeys[leftChildSibling.mNumKeys - 1];
                        node.mObjects[i - 1] = leftChildSibling.mObjects[leftChildSibling.mNumKeys - 1];
                        leftChildSibling.remove(leftChildSibling.mNumKeys - 1, 1);
                    }
                    else if (rightChildSibling != null && rightChildSibling.mNumKeys >= BTree.T) {
                        childNode.mKeys[childNode.mNumKeys] = node.mKeys[i];
                        childNode.mObjects[childNode.mNumKeys] = node.mObjects[i];
                        if (!childNode.mIsLeafNode) {
                            childNode.mChildNodes[childNode.mNumKeys + 1] = rightChildSibling.mChildNodes[0];
                        }
                        final Node node3 = childNode;
                        ++node3.mNumKeys;
                        node.mKeys[i] = rightChildSibling.mKeys[0];
                        node.mObjects[i] = rightChildSibling.mObjects[0];
                        rightChildSibling.remove(0, 0);
                    }
                    else if (leftChildSibling != null) {
                        final int medianKeyIndex2 = this.mergeNodes(childNode, leftChildSibling);
                        this.moveKey(node, i - 1, 0, childNode, medianKeyIndex2);
                    }
                    else if (rightChildSibling != null) {
                        final int medianKeyIndex2 = this.mergeNodes(childNode, rightChildSibling);
                        this.moveKey(node, i, 1, childNode, medianKeyIndex2);
                    }
                }
                this.delete(childNode, key);
            }
        }
    }
    
    int mergeNodes(final Node dstNode, final Node srcNode) {
        this.calledmerge = true;
        int medianKeyIndex;
        if (srcNode.mKeys[0] < dstNode.mKeys[dstNode.mNumKeys - 1]) {
            if (!dstNode.mIsLeafNode) {
                dstNode.mChildNodes[srcNode.mNumKeys + dstNode.mNumKeys + 1] = dstNode.mChildNodes[dstNode.mNumKeys];
            }
            for (int i = dstNode.mNumKeys; i > 0; --i) {
                dstNode.mKeys[srcNode.mNumKeys + i] = dstNode.mKeys[i - 1];
                dstNode.mObjects[srcNode.mNumKeys + i] = dstNode.mObjects[i - 1];
                if (!dstNode.mIsLeafNode) {
                    dstNode.mChildNodes[srcNode.mNumKeys + i] = dstNode.mChildNodes[i - 1];
                }
            }
            medianKeyIndex = srcNode.mNumKeys;
            dstNode.mKeys[medianKeyIndex] = 0L;
            dstNode.mObjects[medianKeyIndex] = null;
            int i;
            for (i = 0; i < srcNode.mNumKeys; ++i) {
                dstNode.mKeys[i] = srcNode.mKeys[i];
                dstNode.mObjects[i] = srcNode.mObjects[i];
                if (!srcNode.mIsLeafNode) {
                    dstNode.mChildNodes[i] = srcNode.mChildNodes[i];
                }
            }
            if (!srcNode.mIsLeafNode) {
                dstNode.mChildNodes[i] = srcNode.mChildNodes[i];
            }
        }
        else {
            medianKeyIndex = dstNode.mNumKeys;
            dstNode.mKeys[medianKeyIndex] = 0L;
            dstNode.mObjects[medianKeyIndex] = null;
            final int offset = medianKeyIndex + 1;
            int j;
            for (j = 0; j < srcNode.mNumKeys; ++j) {
                dstNode.mKeys[offset + j] = srcNode.mKeys[j];
                dstNode.mObjects[offset + j] = srcNode.mObjects[j];
                if (!srcNode.mIsLeafNode) {
                    dstNode.mChildNodes[offset + j] = srcNode.mChildNodes[j];
                }
            }
            if (!srcNode.mIsLeafNode) {
                dstNode.mChildNodes[offset + j] = srcNode.mChildNodes[j];
            }
        }
        dstNode.mNumKeys += srcNode.mNumKeys;
        return medianKeyIndex;
    }
    
    void moveKey(final Node srcNode, final int srcKeyIndex, final int childIndex, final Node dstNode, final int medianKeyIndex) {
        dstNode.mKeys[medianKeyIndex] = srcNode.mKeys[srcKeyIndex];
        dstNode.mObjects[medianKeyIndex] = srcNode.mObjects[srcKeyIndex];
        ++dstNode.mNumKeys;
        srcNode.remove(srcKeyIndex, childIndex);
        if (srcNode == this.mRootNode && srcNode.mNumKeys == 0) {
            this.mRootNode = dstNode;
        }
    }
    
    public EventResultSet getRange(final long id, final long min, final long max) {
        final ArrayList<Integer> results = new ArrayList<Integer>();
        this.getRange(this.mRootNode, id, 1, min, max, results);
        final EventResultSet ers = new EventResultSet(results);
        return ers;
    }
    
    public void getRange(final Node node, final long id, final int level, final long min, final long max, final ArrayList<Integer> results) {
        if (node != null) {
            for (int i = 0; i < node.mNumKeys; ++i) {
                if (!node.mIsLeafNode && i < node.mChildNodes.length) {
                    final Node cnode = node.mChildNodes[i];
                    this.getRange(cnode, id, level + 1, min, max, results);
                }
                if (node.mKeys[i] >= min && node.mKeys[i] <= max) {
                    final long k = node.mKeys[i] - id;
                    final int res = (int)k;
                    results.add(res);
                }
                if (node.mKeys[i] >= max) {
                    return;
                }
                if (!node.mIsLeafNode && i == node.mNumKeys && node.mChildNodes[i + 1] != null) {
                    final Node cnode = node.mChildNodes[i + 1];
                    this.getRange(cnode, id, level + 1, min, max, results);
                }
            }
        }
    }
    
    public EventResultSet searchR(final long base, final long min, final long max) {
        BTree.ers = new EventResultSet(base, min, max);
        this.searchR(this.mRootNode);
        return BTree.ers;
    }
    
    public void searchR(final Node node) {
        for (int i = 0; i < node.mNumKeys; ++i) {
            BTree.ers.add(node.mKeys[i]);
            if (node.mIsLeafNode) {}
        }
        if (!node.mIsLeafNode) {
            for (int j = 0; j < node.mChildNodes.length; ++j) {
                if (node.mChildNodes[j] != null) {
                    this.searchR(node.mChildNodes[j]);
                }
            }
        }
    }
    
    public Object search(final long key) {
        return this.search(this.mRootNode, key);
    }
    
    public Object search(final Node node, final long key) {
        int i;
        for (i = 0; i < node.mNumKeys && key > node.mKeys[i]; ++i) {}
        if (i < node.mNumKeys && key == node.mKeys[i]) {
            return node.mObjects[i];
        }
        if (node.mIsLeafNode) {
            return null;
        }
        return this.search(node.mChildNodes[i], key);
    }
    
    public Object search2(final long key) {
        return this.search2(this.mRootNode, key);
    }
    
    public Object search2(Node node, final long key) {
        while (node != null) {
            int i;
            for (i = 0; i < node.mNumKeys && key > node.mKeys[i]; ++i) {}
            if (i < node.mNumKeys && key == node.mKeys[i]) {
                return node.mObjects[i];
            }
            if (node.mIsLeafNode) {
                return null;
            }
            node = node.mChildNodes[i];
        }
        return null;
    }
    
    private boolean update(Node node, final long key, final Object object) {
        while (node != null) {
            int i;
            for (i = 0; i < node.mNumKeys && key > node.mKeys[i]; ++i) {}
            if (i < node.mNumKeys && key == node.mKeys[i]) {
                node.mObjects[i] = object;
                return true;
            }
            if (node.mIsLeafNode) {
                return false;
            }
            node = node.mChildNodes[i];
        }
        return false;
    }
    
    String printBTree(final Node node, final int order) {
        String string = "";
        if (node != null) {
            if (node.mIsLeafNode) {
                for (int i = 0; i < node.mNumKeys; ++i) {
                    string = string + node.mObjects[i] + ", ";
                }
                string += "\n";
            }
            else {
                int i;
                for (i = 0; i < node.mNumKeys; ++i) {
                    string = string + node.mObjects[i] + "order:" + order + ", \n";
                    string += this.printBTree(node.mChildNodes[i], order + 1);
                }
                string += this.printBTree(node.mChildNodes[i], order + 1);
            }
        }
        return string;
    }
    
    @Override
    public String toString() {
        return this.printBTree(this.mRootNode, 0);
    }
    
    void validate() throws Exception {
        final List<Long> array = this.getKeys(this.mRootNode);
        for (int i = 0; i < array.size() - 1; ++i) {
            if (array.get(i) >= array.get(i + 1)) {
                throw new Exception("B-Tree invalid: " + array.get(i) + " greater than " + array.get(i + 1));
            }
        }
    }
    
    List<Long> getKeys(final Node node) {
        final List<Long> array = new ArrayList<Long>();
        if (node != null) {
            if (node.mIsLeafNode) {
                for (int i = 0; i < node.mNumKeys; ++i) {
                    array.add(node.mKeys[i]);
                }
            }
            else {
                int i;
                for (i = 0; i < node.mNumKeys; ++i) {
                    array.addAll(this.getKeys(node.mChildNodes[i]));
                    array.add(node.mKeys[i]);
                }
                array.addAll(this.getKeys(node.mChildNodes[i]));
            }
        }
        return array;
    }
    
    static {
        BTree.T = 10;
    }
    
    public class Node
    {
        public int mNumKeys;
        public long[] mKeys;
        public Object[] mObjects;
        public Node[] mChildNodes;
        public boolean mIsLeafNode;
        Node parent;
        
        public Node() {
            this.mNumKeys = 0;
            this.mKeys = new long[2 * BTree.T - 1];
            this.mObjects = new Object[2 * BTree.T - 1];
            this.mChildNodes = new Node[2 * BTree.T];
        }
        
        int binarySearch(final long key) {
            int leftIndex = 0;
            int rightIndex = this.mNumKeys - 1;
            while (leftIndex <= rightIndex) {
                final int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;
                if (this.mKeys[middleIndex] < key) {
                    leftIndex = middleIndex + 1;
                }
                else {
                    if (this.mKeys[middleIndex] <= key) {
                        return middleIndex;
                    }
                    rightIndex = middleIndex - 1;
                }
            }
            return -1;
        }
        
        boolean contains(final long key) {
            return this.binarySearch(key) != -1;
        }
        
        void remove(final int index, final int leftOrRightChild) {
            if (index >= 0) {
                int i;
                for (i = index; i < this.mNumKeys - 1; ++i) {
                    this.mKeys[i] = this.mKeys[i + 1];
                    this.mObjects[i] = this.mObjects[i + 1];
                    if (!this.mIsLeafNode && i >= index + leftOrRightChild) {
                        this.mChildNodes[i] = this.mChildNodes[i + 1];
                    }
                }
                this.mKeys[i] = 0L;
                this.mObjects[i] = null;
                if (!this.mIsLeafNode) {
                    if (i >= index + leftOrRightChild) {
                        this.mChildNodes[i] = this.mChildNodes[i + 1];
                    }
                    this.mChildNodes[i + 1] = null;
                }
                --this.mNumKeys;
            }
        }
        
        void shiftRightByOne() {
            if (!this.mIsLeafNode) {
                this.mChildNodes[this.mNumKeys + 1] = this.mChildNodes[this.mNumKeys];
            }
            for (int i = this.mNumKeys - 1; i >= 0; --i) {
                this.mKeys[i + 1] = this.mKeys[i];
                this.mObjects[i + 1] = this.mObjects[i];
                if (!this.mIsLeafNode) {
                    this.mChildNodes[i + 1] = this.mChildNodes[i];
                }
            }
        }
        
        int subtreeRootNodeIndex(final long key) {
            for (int i = 0; i < this.mNumKeys; ++i) {
                if (key < this.mKeys[i]) {
                    return i;
                }
            }
            return this.mNumKeys;
        }
    }
}
