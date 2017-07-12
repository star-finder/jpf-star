package darpa.stac.snapbuddy_1.hashmap;

import java.util.*;

public class HashMap<K, V> extends AbstractMap<K, V>
{
    transient Node<K, V>[] table;
    static final transient int DEFAULT_INITIAL_CAPACITY = 16;
    static final float DEFAULT_LOAD_FACTOR = 0.75f;
    static final int MAXIMUM_CAPACITY = 1073741824;
    static final int MIN_TREEIFY_CAPACITY = 64;
    static final int TREEIFY_THRESHOLD = 8;
    float loadFactor;
    transient int capacity;
    int threshold;
    transient Set<Map.Entry<K, V>> entrySet;
    transient int size;
    
    public HashMap() {
        this(16, 0.75f);
    }
    
    public HashMap(final Map<? extends K, ? extends V> m) {
        this();
        this.putAll((Map)m);
    }
    
    public HashMap(final int capacity) {
        this(capacity, 0.75f);
    }
    
    public HashMap(final int capacity, final float loadFactor) {
        this.loadFactor = 0.75f;
        this.capacity = 16;
        this.threshold = 0;
        this.entrySet = (Set<Map.Entry<K, V>>)new TreeSet((Comparator)new NodeComparator());
        this.size = 0;
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        final Node<K, V>[] newTable = (Node<K, V>[])new Node[capacity];
        this.table = newTable;
    }
    
    public Set<Map.Entry<K, V>> entrySet() {
        return this.entrySet;
    }
    
    public V put(final K key, final V value) {
        V e = null;
        final int h = this.hash(key);
        Node<K, V> node = this.table[h];
        if (node == null) {
            node = new Node<K, V>(this.hash(key), key, value, null);
            this.table[h] = node;
            this.entrySet.add((Object)node);
            ++this.size;
        }
        else if (node instanceof TreeNode) {
            final TreeNode<K, V> treeNode = (TreeNode<K, V>)(TreeNode)node;
            final TreeNode<K, V> result = treeNode.putTreeVal(this.table, this.hash(key), key, value);
            if (result == null) {
                this.entrySet.add((Object)new AbstractMap.SimpleEntry((Object)key, (Object)value));
                ++this.size;
                return null;
            }
            if (result.value != value) {
                this.entrySet.remove((Object)result);
                e = result.value;
                result.setValue(value);
                this.entrySet.add((Object)result);
            }
        }
        else {
            int bincount;
            for (bincount = 0; node.next != null && !node.key.equals(key); node = node.next, ++bincount) {}
            if (node.key.equals(key)) {
                e = node.value;
                node.value = value;
            }
            else {
                node.next = (Node<K, V>)new Node<Object, Object>(this.hash(key), (K)key, (V)value, null);
                this.entrySet.add((Object)node.next);
                if (bincount > 8) {
                    this.treeify(this.table, h);
                }
                ++this.size;
            }
        }
        if (this.size > this.capacity * 0.75f && this.size < 1073741824) {
            this.resize();
        }
        return e;
    }
    
    public V get(final Object key) {
        final int h = this.hash(key);
        Node<K, V> node = this.table[h];
        if (node == null) {
            return null;
        }
        if (node instanceof TreeNode) {
            TreeNode<K, V> n = (TreeNode<K, V>)(TreeNode)node;
            n = n.getTreeNode(h, key);
            if (n == null) {
                return null;
            }
            return n.getValue();
        }
        else {
            while (node.next != null && !node.key.equals(key)) {
                node = node.next;
            }
            if (node.key.equals(key)) {
                return node.value;
            }
            return null;
        }
    }
    
    public boolean containsKey(final Object key) {
        final V val = this.get(key);
        return val != null;
    }
    
    public V remove(final Object key) {
        final int h = this.hash(key);
        Node<K, V> node = this.table[h];
        Node<K, V> prev = null;
        if (node == null) {
            return null;
        }
        if (node instanceof TreeNode) {
            final TreeNode<K, V> treenode = (TreeNode<K, V>)(TreeNode)node;
            final TreeNode<K, V> nodeToRemove = treenode.getTreeNode(h, key);
            if (nodeToRemove == null) {
                return null;
            }
            nodeToRemove.removeTreeNode(this.table, true);
            --this.size;
            this.entrySet.remove((Object)new AbstractMap.SimpleEntry(key, (Object)nodeToRemove.value));
            return treenode.value;
        }
        else {
            while (node.next != null && !node.key.equals(key)) {
                prev = node;
                node = node.next;
            }
            if (node.key.equals(key)) {
                if (prev == null) {
                    this.table[h] = node.next;
                }
                else {
                    this.removeHelper(node, prev);
                }
                this.entrySet.remove((Object)node);
                --this.size;
                return node.value;
            }
            return null;
        }
    }
    
    private int hash(final K key) {
        return Node.hash(key, this.capacity);
    }
    
    final Node<K, V>[] resize() {
        final Node<K, V>[] oldTab = this.table;
        final int oldCap = (oldTab == null) ? 0 : oldTab.length;
        final int oldThr = this.threshold;
        int newThr = 0;
        final int conditionObj0 = 0;
        final int conditionObj2 = 0;
        int newCap;
        if (oldCap > conditionObj0) {
            if (oldCap >= 1073741824) {
                this.threshold = Integer.MAX_VALUE;
                return oldTab;
            }
            if ((newCap = oldCap << 1) < 1073741824 && oldCap >= 16) {
                newThr = oldThr << 1;
            }
        }
        else if (oldThr > conditionObj2) {
            newCap = oldThr;
        }
        else {
            newCap = 16;
            newThr = 12;
        }
        final int conditionObj3 = 0;
        if (newThr == conditionObj3) {
            final float ft = newCap * this.loadFactor;
            newThr = ((newCap < 1073741824 && ft < 1.07374182E9f) ? ((int)ft) : Integer.MAX_VALUE);
        }
        this.threshold = newThr;
        final Node<K, V>[] newTab = (Node<K, V>[])new Node[newCap];
        this.capacity = newCap;
        this.table = newTab;
        if (oldTab != null) {
            final Set<Map.Entry<K, V>> oldEntries = this.entrySet();
            this.entrySet = (Set<Map.Entry<K, V>>)new TreeSet((Comparator)new NodeComparator());
            for (final Map.Entry<K, V> entry : oldEntries) {
                this.put(entry.getKey(), entry.getValue());
            }
        }
        return newTab;
    }
    
    private void treeify(final Node<K, V>[] tab, final int index) {
        final int n;
        if (tab == null || (n = tab.length) < 64) {
            this.resize();
        }
        else {
            Node<K, V> e;
            if ((e = tab[index]) != null) {
                TreeNode<K, V> hd = null;
                TreeNode<K, V> tl = null;
                do {
                    final TreeNode<K, V> p = new TreeNode<K, V>(e.hash, e.key, e.value, null);
                    if (tl == null) {
                        hd = p;
                    }
                    else {
                        p.prev = tl;
                        tl.next = p;
                    }
                    tl = p;
                } while ((e = e.next) != null);
                if ((tab[index] = hd) != null) {
                    hd.treeify(tab);
                }
            }
        }
    }
    
    private void removeHelper(final Node<K, V> node, final Node<K, V> prev) {
        prev.next = node.next;
    }
    
    class NodeComparator implements Comparator
    {
        public int compare(final Object a, final Object b) {
            if (!(a instanceof Map.Entry) || !(b instanceof Map.Entry)) {
                return Integer.compare(a.hashCode(), b.hashCode());
            }
            final Map.Entry ae = (Map.Entry)a;
            final Map.Entry be = (Map.Entry)b;
            final Object ak = ae.getKey();
            final Object av = ae.getValue();
            final Object bk = be.getKey();
            final Object bv = be.getValue();
            if (ak.equals(bk) && ((av == null && bv == null) || av.equals(bv))) {
                return 0;
            }
            int avHash = 0;
            int bvHash = 0;
            if (av != null) {
                avHash = av.hashCode();
            }
            if (bv != null) {
                bvHash = bv.hashCode();
            }
            if (ak.hashCode() < bk.hashCode() || (ak.hashCode() == bk.hashCode() && avHash < bvHash)) {
                return -1;
            }
            return 1;
        }
    }
}
