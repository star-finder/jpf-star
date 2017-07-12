package darpa.stac.lawdb;

import java.util.concurrent.*;
import java.util.*;

public class BTree
{
    private static int T;
    private Node mRootNode;
    private static final int LEFT_CHILD_NODE = 0;
    private static final int RIGHT_CHILD_NODE = 1;
    public boolean optimizedinserts;
    TransactionStack trans;
    private Object clist;
    public boolean calledmerge;
    
    public BTree(final int t) {
        this.optimizedinserts = false;
        this.calledmerge = false;
        BTree.T = t;
        this.mRootNode = new Node();
        this.mRootNode.mIsLeafNode = true;
        this.trans = new TransactionStack(this);
    }
    
    public void beginTransaction() {
        this.trans.begin();
    }
    
    public void commit() {
        this.trans.commit();
    }
    
    public void rollback() {
        this.trans.rollback();
    }
    
    public static void printNode(final Node n) {
        System.out.println(new StringBuilder().append("isleaf:").append(n.mIsLeafNode).toString());
        for (int i = 0; i < n.mKeys.length; ++i) {
            System.out.print(new StringBuilder().append(n.mKeys[i]).append(" : ").toString());
        }
        System.out.println("");
    }
    
    public BTree() {
        this.optimizedinserts = false;
        this.calledmerge = false;
        this.mRootNode = new Node();
        this.mRootNode.mIsLeafNode = true;
    }
    
    public boolean add(final int key, final Object object, final boolean log) {
        final Node rootNode = this.mRootNode;
        if (!this.update(this.mRootNode, key, object)) {
            if (rootNode.mNumKeys == 2 * BTree.T - 1) {
                final Node newRootNode = new Node();
                this.mRootNode = newRootNode;
                newRootNode.mIsLeafNode = false;
                this.splitChildNode(newRootNode, 0, this.mRootNode.mChildNodes[0] = rootNode);
                this.insertIntoNonFullNode(newRootNode, key, object, null);
            }
            else {
                this.insertIntoNonFullNode(rootNode, key, object, null);
            }
        }
        return true;
    }
    
    void splitPotentialRemoteNode(final Node parentNode, final int newsize, final int itertions) {
        if (parentNode.mNumKeys == itertions * newsize) {
            final Node newTempPNode = new Node(itertions);
            newTempPNode.fastSearch = new Vector<Integer>();
            newTempPNode.mNumKeys = itertions;
            for (int x = 0; x < itertions * newsize; x += newsize) {
                final Node newNode = new Node(newsize - (BTree.T * 2 - 1));
                newTempPNode.mChildNodes[x / newsize] = newNode;
                for (int y = 0; y < newsize; ++y) {
                    newNode.mKeys[y] = parentNode.mKeys[x + y];
                    if (y == newsize - 1) {
                        newTempPNode.fastSearch.ensureCapacity(x / newsize);
                        newTempPNode.fastSearch.add(x / newsize, parentNode.mKeys[x + y]);
                        newTempPNode.mKeys[x / newsize] = parentNode.mKeys[x + y];
                    }
                    newNode.mObjects[y] = parentNode.mObjects[x + y];
                    newNode.mNumKeys = y + 1;
                    newNode.mChildNodes[y] = parentNode.mChildNodes[x + y];
                    if (x + y == itertions * newsize - 1 && parentNode.mChildNodes[x + y + 1] != null) {
                        newNode.mChildNodes[y + 1] = parentNode.mChildNodes[x + y + 1];
                    }
                }
            }
            parentNode.mNumKeys = newTempPNode.mNumKeys;
            parentNode.fastSearch = new Vector<Integer>();
            for (int i = 0; i < parentNode.mChildNodes.length; ++i) {
                parentNode.mChildNodes[i] = null;
            }
            for (int i = 0; i < parentNode.mKeys.length; ++i) {
                parentNode.mKeys[i] = 0;
            }
            parentNode.mObjects = null;
            parentNode.isremotenode = true;
            for (int x = 0; x < newTempPNode.mNumKeys; ++x) {
                parentNode.mChildNodes[x] = newTempPNode.mChildNodes[x];
                parentNode.fastSearch.ensureCapacity(x + 1);
                parentNode.fastSearch.add(x, newTempPNode.fastSearch.get(x));
                parentNode.mKeys[x] = newTempPNode.mKeys[x];
            }
        }
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
            node.mKeys[j] = 0;
            node.mObjects[j] = null;
        }
        node.mNumKeys = BTree.T - 1;
        try {
            this.setupMedian(newNode, parentNode, i, node);
        }
        catch (ArrayIndexOutOfBoundsException aex) {
            parentNode.increaseCapacity(parentNode.xtrasize + 1);
            this.setupMedian(newNode, parentNode, i, node);
        }
    }
    
    void setupMedian(final Node newNode, final Node parentNode, final int i, final Node node) {
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
        node.mKeys[BTree.T - 1] = 0;
        node.mObjects[BTree.T - 1] = null;
        ++parentNode.mNumKeys;
        if (this.optimizedinserts) {
            if (this.optimizedinserts) {
                parentNode.fastSearch = new Vector<Integer>(1, 1);
                parentNode.instantSearch = new ConcurrentHashMap<Integer, Object>(1);
            }
            for (int k = 0; k < parentNode.mKeys.length; ++k) {
                if (parentNode.mKeys[k] > 0 && this.optimizedinserts) {
                    parentNode.fastSearch.ensureCapacity(k + 1);
                    parentNode.fastSearch.add(parentNode.mKeys[k]);
                    String valstr = null;
                    if (parentNode.mObjects[k] != null) {
                        valstr = parentNode.mObjects[k].toString();
                        final int indexOf = valstr.indexOf(":");
                        if (indexOf > 0) {
                            valstr = valstr.substring(indexOf, valstr.length());
                        }
                        else {
                            valstr = "null";
                        }
                    }
                    else {
                        valstr = "null";
                    }
                    parentNode.instantSearch.put(parentNode.mKeys[k], (Integer.toString(k) + ":" + valstr));
                }
            }
            if (parentNode.fastSearch != null) {
                Collections.sort(parentNode.fastSearch);
                final Integer[] toArray = (Integer[])parentNode.fastSearch.toArray((Object[])new Integer[parentNode.fastSearch.size()]);
                parentNode.fastSearchArray = (Integer[])parentNode.fastSearch.toArray((Object[])toArray);
            }
        }
    }
    
    void insertIntoNonFullNode(final Node node, int key, Object object, final Node parent) {
        int i = node.mNumKeys - 1;
        if (node.mIsLeafNode) {
            this.trans.addInsert(null, null, key);
            while (i >= 0 && key < node.mKeys[i]) {
                node.mKeys[i + 1] = node.mKeys[i];
                node.mObjects[i + 1] = node.mObjects[i];
                --i;
            }
            ++i;
            node.mKeys[i] = key;
            if (object != null) {
                node.mObjects[i] = object;
            }
            ++node.mNumKeys;
            if (parent != null && this.optimizedinserts && !parent.mIsLeafNode) {
                final int newsize = 200;
                final int itertions = 2;
                if (parent.mNumKeys == newsize * itertions) {
                    this.splitPotentialRemoteNode(parent, newsize, itertions);
                }
            }
        }
        else {
            if (node.fastSearch == null) {
                while (i >= 0 && key < node.mKeys[i]) {
                    --i;
                }
                ++i;
            }
            else if (node.fastSearch != null) {
                if (node.mNumKeys < 20) {
                    while (i >= 0 && key < node.mKeys[i]) {
                        --i;
                    }
                    ++i;
                }
                else {
                    int retVal = 0;
                    retVal = Arrays.binarySearch((Object[])node.fastSearchArray, key);
                    retVal = (i = retVal * -1 - 1);
                }
            }
            if (node.isremotenode && node.mChildNodes[i] == null) {
                this.insertIntoNonFullNode(node.mChildNodes[i - 1], key, object, node);
                return;
            }
            if (node.mChildNodes[i].mNumKeys == 2 * BTree.T - 1) {
                if (this.optimizedinserts) {
                    if (node.mChildNodes[i].mIsLeafNode) {
                        final Node cNode = node.mChildNodes[i];
                        this.trans.addInsert(cNode, node, key);
                        final Node tempNode = new Node(cNode.xtrasize + 10);
                        for (int x = 0; x < cNode.mNumKeys; ++x) {
                            tempNode.mChildNodes[x] = cNode.mChildNodes[x];
                            tempNode.mKeys[x] = cNode.mKeys[x];
                            tempNode.mObjects[x] = cNode.mObjects[x];
                            final Node node2 = tempNode;
                            ++node2.mNumKeys;
                        }
                        tempNode.mKeys[cNode.mNumKeys] = key;
                        if (object != null) {
                            tempNode.mObjects[cNode.mNumKeys] = object;
                        }
                        final Node node3 = tempNode;
                        ++node3.mNumKeys;
                        for (int sortTheNumbers = tempNode.mNumKeys - 1, a = 0; a < sortTheNumbers; ++a) {
                            for (int b = 0; b < sortTheNumbers; ++b) {
                                if (tempNode.mKeys[b] > tempNode.mKeys[b + 1]) {
                                    final int temp = tempNode.mKeys[b];
                                    final Object tempobj = tempNode.mObjects[b];
                                    tempNode.mKeys[b] = tempNode.mKeys[b + 1];
                                    tempNode.mKeys[b + 1] = temp;
                                    tempNode.mObjects[b] = tempNode.mObjects[b + 1];
                                    tempNode.mObjects[b + 1] = tempobj;
                                }
                            }
                        }
                        for (int x2 = 0; x2 < tempNode.mNumKeys - 1; ++x2) {
                            cNode.mKeys[x2] = tempNode.mKeys[x2];
                            cNode.mObjects[x2] = tempNode.mObjects[x2];
                        }
                        key = tempNode.mKeys[tempNode.mNumKeys - 1];
                        object = tempNode.mObjects[tempNode.mNumKeys - 1];
                        this.trans.addInsert(cNode, node, key);
                        this.splitChildNode(node, i, node.mChildNodes[i]);
                        if (key > node.mKeys[i]) {
                            ++i;
                        }
                    }
                }
                else {
                    this.trans.addInsert(node.mChildNodes[i], node, key);
                    this.splitChildNode(node, i, node.mChildNodes[i]);
                    if (key > node.mKeys[i]) {
                        ++i;
                    }
                }
            }
            this.insertIntoNonFullNode(node.mChildNodes[i], key, object, node);
        }
    }
    
    public boolean delete(final int key) {
        if (!this.optimizedinserts) {
            this.delete(this.mRootNode, key);
        }
        else {
            final Node n = this.searchForNode(key);
            this.fastDelete(n, key);
        }
        return true;
    }
    
    public void delete(final Node node, final int key) {
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
            dstNode.mKeys[medianKeyIndex] = 0;
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
            dstNode.mKeys[medianKeyIndex] = 0;
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
    
    public Object searchRange(final int key1, final int key2) {
        return this.search(this.mRootNode, key1);
    }
    
    public Object search(final int key) {
        return this.search(this.mRootNode, key);
    }
    
    public Object search(final Node node, final int key) {
        int i;
        for (i = 0; i < node.mNumKeys && key > node.mKeys[i]; ++i) {}
        if (i < node.mNumKeys && key == node.mKeys[i]) {
            if (node.isfastDeleted[i]) {
                return null;
            }
            return node.mObjects[i];
        }
        else {
            if (node.mIsLeafNode) {
                return null;
            }
            return this.search(node.mChildNodes[i], key);
        }
    }
    
    public Node searchForNode(final int key) {
        return this.searchForNode(this.mRootNode, key);
    }
    
    public Node searchForNode(final Node node, final int key) {
        int i;
        for (i = node.mNumKeys - 1; i >= 0 && key < node.mKeys[i]; --i) {}
        if (i >= 0 && node.mKeys[i] == key && !node.isremotenode) {
            return node;
        }
        if (!node.isremotenode) {
            ++i;
        }
        if (i < node.mNumKeys && key == node.mKeys[i] && !node.isremotenode) {
            return node;
        }
        if (node.mIsLeafNode) {
            return node;
        }
        Node n = null;
        n = this.searchForNode(node.mChildNodes[i], key);
        return n;
    }
    
    public Object search2(final int key) {
        return this.search2(this.mRootNode, key);
    }
    
    public Object search2(Node node, final int key) {
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
    
    public void fastDelete(final Node node, final int key) {
        int i;
        for (i = 0; i < node.mNumKeys && key > node.mKeys[i]; ++i) {}
        if (i < node.mNumKeys && key == node.mKeys[i]) {
            if (node.mIsLeafNode) {
                node.remove(i, 0);
            }
            else {
                node.isfastDeleted[i] = true;
            }
        }
    }
    
    public void printOutWholetree(final int key) {
        this.printOutWholetree(this.mRootNode, 1, key);
    }
    
    public void printOutWholetree(final Node node, final int level, int key) {
        int foundindex = -3;
        if (key == -1) {
            foundindex = -1;
        }
        if (node != null) {
            for (int i = 0; i < node.mKeys.length; ++i) {
                if (i < node.mNumKeys + 1 && node.mKeys[i] == key && key != -2) {
                    key = -1;
                    foundindex = i;
                }
            }
            if (key == -1) {
                System.out.println("n:" + node.toString() + " level:" + level);
                for (int i = 0; i < node.mKeys.length; ++i) {
                    if (i < node.mNumKeys + 1 && key == -1) {
                        System.out.println(new StringBuilder().append(i).append(":").append(node.mKeys[i]).toString());
                    }
                }
                System.out.println("*************************");
            }
            if (!node.mIsLeafNode) {
                for (int c = 0; c < node.mChildNodes.length; ++c) {
                    if (c < node.mNumKeys + 1) {
                        final Node cnode = node.mChildNodes[c];
                        if (c == foundindex || c == foundindex + 1) {}
                        if (key == -1) {
                            this.printOutWholetree(cnode, level + 1, key);
                        }
                    }
                }
            }
        }
    }
    
    public ArrayList<Integer> getRange(final int min, final int max) {
        final ArrayList<Integer> results = new ArrayList<Integer>();
        this.getRange(this.mRootNode, 1, min, max, results);
        return results;
    }
    
    public void getRange(final Node node, final int level, final int min, final int max, final ArrayList<Integer> results) {
        if (node != null) {
            for (int i = 0; i < node.mNumKeys; ++i) {
                if (!node.mIsLeafNode && i < node.mChildNodes.length) {
                    final Node cnode = node.mChildNodes[i];
                    this.getRange(cnode, level + 1, min, max, results);
                }
                if (node.mKeys[i] >= min && node.mKeys[i] <= max && !node.isremotenode) {
                    results.add(node.mKeys[i]);
                }
                if (node.mKeys[i] >= max && !node.isremotenode) {
                    return;
                }
                if (!node.mIsLeafNode && i == node.mNumKeys && node.mChildNodes[i + 1] != null) {
                    final Node cnode = node.mChildNodes[i + 1];
                    this.getRange(cnode, level + 1, min, max, results);
                }
            }
        }
    }
    
    private boolean update(Node node, final int key, final Object object) {
        while (node != null) {
            int i;
            for (i = 0; i < node.mNumKeys && key > node.mKeys[i]; ++i) {}
            if (i < node.mNumKeys && key == node.mKeys[i]) {
                if (node.mObjects == null) {
                    return false;
                }
                node.mObjects[i] = object;
                return true;
            }
            else {
                if (node.mIsLeafNode) {
                    return false;
                }
                node = node.mChildNodes[i];
            }
        }
        return false;
    }
    
    void recurseBTree(final List<Integer> res, final int min, final int max, final Node node, final int order) {
        if (node != null) {
            if (node.mIsLeafNode) {
                for (int i = 0; i < node.mNumKeys; ++i) {
                    if (node.mKeys[i] >= min && node.mKeys[i] <= max) {
                        res.add(node.mKeys[i]);
                    }
                }
            }
            else {
                int i;
                for (i = 0; i < node.mNumKeys; ++i) {
                    if (node.mKeys[i] >= min && node.mKeys[i] <= max) {
                        res.add(node.mKeys[i]);
                    }
                    this.recurseBTree(res, min, max, node.mChildNodes[i], order + 1);
                }
                this.recurseBTree(res, min, max, node.mChildNodes[i], order + 1);
            }
        }
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
    
    String printBTreeX(final Node node, final int order) {
        String string = "";
        if (node != null) {
            if (!node.mIsLeafNode) {
                int i;
                for (i = 0; i < node.mNumKeys; ++i) {
                    string += this.printBTree(node.mChildNodes[i], order + 1);
                    string = string + order + ", ";
                }
                string += this.printBTree(node.mChildNodes[i], order + 1);
            }
        }
        return string;
    }
    
    public String toString() {
        return this.printBTree(this.mRootNode, 0);
    }
    
    public List<Integer> toList(final int min, final int max) {
        final List<Integer> res = new ArrayList<Integer>();
        this.recurseBTree(res, min, max, this.mRootNode, 0);
        Collections.sort(res);
        return res;
    }
    
    void validate() throws Exception {
        final List<Integer> array = this.getKeys(this.mRootNode);
        for (int i = 0; i < array.size() - 1; ++i) {
            if ((int)array.get(i) >= (int)array.get(i + 1)) {
                throw new Exception(new StringBuilder().append("B-Tree invalid: ").append(array.get(i)).append(" greater than ").append(array.get(i + 1)).toString());
            }
        }
    }
    
    List<Integer> getKeys(final Node node) {
        final List<Integer> array = new ArrayList<Integer>();
        if (node != null) {
            if (node.mIsLeafNode) {
                for (int i = 0; i < node.mNumKeys; ++i) {
                    array.add(node.mKeys[i]);
                }
            }
            else {
                int i;
                for (i = 0; i < node.mNumKeys; ++i) {
                    array.addAll(getKeys(node.mChildNodes[i]));
                    array.add(node.mKeys[i]);
                }
                array.addAll(getKeys(node.mChildNodes[i]));
            }
        }
        return array;
    }
    
    static {
        BTree.T = 10;
    }
    
    class IntHolderV
    {
        Integer[] objects;
        Vector<Integer> objs;
        
        public IntHolderV(final int size) {
            this.objects = null;
            this.objs = new Vector<Integer>(1);
        }
        
        public int get(final int index) {
            try {
                return (int)this.objs.get(index);
            }
            catch (IndexOutOfBoundsException e) {
                return new Integer(0);
            }
        }
        
        public void put(final int index, final int i) {
            final Integer integer = new Integer(i);
            while (true) {
                if (this.objs.size() < index) {
                    try {
                        this.objs.add(index, integer);
                    }
                    catch (IndexOutOfBoundsException e) {
                        this.objs.add(null);
                        this.objs.ensureCapacity(index);
                        this.put(index, integer);
                    }
                    return;
                }
                continue;
            }
        }
    }
    
    public class Node
    {
        public int xtrasize;
        public int mNumKeys;
        public int[] mKeys;
        public Object[] mObjects;
        public Node[] mChildNodes;
        public boolean mIsLeafNode;
        public boolean[] isfastDeleted;
        public int[] permissions;
        public Vector<Integer> fastSearch;
        Node parent;
        public ConcurrentHashMap<Integer, Object> instantSearch;
        private Integer[] fastSearchArray;
        private boolean isremotenode;
        
        public Node(){
        	this(0);
        }

        
        public Node(final int size) {
            this.xtrasize = 0;
            this.mNumKeys = 0;
            this.isremotenode = false;
            this.xtrasize = size;
            this.mKeys = new int[2 * BTree.T - 1 + this.xtrasize];
            this.mObjects = new Object[2 * BTree.T - 1 + this.xtrasize];
            this.mChildNodes = new Node[2 * BTree.T + this.xtrasize];
            this.isfastDeleted = new boolean[2 * BTree.T - 1 + this.xtrasize];
            this.permissions = new int[2 * BTree.T - 1 + this.xtrasize];
        }
        
        public void increaseCapacity(final int s) {
            final Node copy = this.copy(s);
            this.copyin(copy);
        }
        
        public Node copy(final int s) {
            this.xtrasize += s;
            return this.copy(null);
        }
        
        public Node copy(Node newnode) {
            if (newnode == null) {
                newnode = new Node(this.xtrasize);
            }
            try {
                newnode.mNumKeys = this.mNumKeys;
                for (int i = 0; i < this.mKeys.length; ++i) {
                    newnode.mKeys[i] = this.mKeys[i];
                }
                for (int i = 0; i < this.mObjects.length; ++i) {
                    newnode.mObjects[i] = this.mObjects[i];
                }
                for (int i = 0; i < this.mChildNodes.length; ++i) {
                    newnode.mChildNodes[i] = this.mChildNodes[i];
                }
                for (int i = 0; i < this.isfastDeleted.length; ++i) {
                    newnode.isfastDeleted[i] = this.isfastDeleted[i];
                }
                for (int i = 0; i < this.permissions.length; ++i) {
                    newnode.permissions[i] = this.permissions[i];
                }
            }
            catch (ArrayIndexOutOfBoundsException e) {
                return this.copy(new Node(this.xtrasize + 1));
            }
            newnode.mIsLeafNode = this.mIsLeafNode;
            return newnode;
        }
        
        public void copyin(final Node innode) {
            this.mNumKeys = innode.mNumKeys;
            this.mKeys = innode.mKeys;
            this.mObjects = innode.mObjects;
            this.mChildNodes = innode.mChildNodes;
            this.isfastDeleted = innode.isfastDeleted;
            this.permissions = innode.permissions;
            this.mIsLeafNode = innode.mIsLeafNode;
            this.isfastDeleted = innode.isfastDeleted;
        }
        
        int binarySearch(final int key) {
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
        
        boolean contains(final int key) {
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
                this.mKeys[i] = 0;
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
        
        int subtreeRootNodeIndex(final int key) {
            for (int i = 0; i < this.mNumKeys; ++i) {
                if (key < this.mKeys[i]) {
                    return i;
                }
            }
            return this.mNumKeys;
        }
    }
}
