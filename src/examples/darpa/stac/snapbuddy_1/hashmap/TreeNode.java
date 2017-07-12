package darpa.stac.snapbuddy_1.hashmap;

import java.lang.reflect.*;

final class TreeNode<K, V> extends Node<K, V>
{
    final int UNTREEIFY_THRESHOLD = 6;
    TreeNode<K, V> parent;
    TreeNode<K, V> left;
    TreeNode<K, V> right;
    TreeNode<K, V> prev;
    boolean red;
    
    TreeNode(final int hash, final K key, final V val, final Node<K, V> next) {
        super(hash, key, val, next);
    }
    
    final TreeNode<K, V> root() {
        TreeNode<K, V> r;
        TreeNode<K, V> p;
        for (r = this; (p = r.parent) != null; r = p) {}
        return r;
    }
    
    static <K, V> void moveRootToFront(final Node<K, V>[] tab, final TreeNode<K, V> root) {
        moveRootToFrontHelper(root, tab);
    }
    
    final TreeNode<K, V> find(final int h, final Object k, Class<?> kc) {
        TreeNode<K, V> p = this;
        final int conditionObj1 = 0;
        final int conditionObj2 = 0;
        do {
            final TreeNode<K, V> pl = p.left;
            final TreeNode<K, V> pr = p.right;
            final int ph;
            if ((ph = p.hash) > h) {
                p = pl;
            }
            else if (ph < h) {
                p = pr;
            }
            else {
                final K pk;
                if ((pk = p.key) == k || (k != null && k.equals(pk))) {
                    return p;
                }
                if (pl == null) {
                    p = pr;
                }
                else if (pr == null) {
                    p = pl;
                }
                else {
                    final int dir;
                    if ((kc != null || (kc = this.comparableClassFor(k)) != null) && (dir = this.compareComparables(kc, k, pk)) != conditionObj2) {
                        p = ((dir < conditionObj1) ? pl : pr);
                    }
                    else {
                        final TreeNode<K, V> q;
                        if ((q = pr.find(h, k, kc)) != null) {
                            return q;
                        }
                        p = pl;
                    }
                }
            }
        } while (p != null);
        return null;
    }
    
    final TreeNode<K, V> getTreeNode(final int h, final Object k) {
        return ((this.parent != null) ? this.root() : this).find(h, k, null);
    }
    
    static int tieBreakOrder(final Object a, final Object b) {
        final int conditionObj3 = 0;
        int d;
        if (a == null || b == null || (d = a.getClass().getName().compareTo(b.getClass().getName())) == conditionObj3) {
            d = ((System.identityHashCode(a) <= System.identityHashCode(b)) ? -1 : 1);
        }
        return d;
    }
    
    final void treeify(final Node<K, V>[] tab) {
        TreeNode<K, V> root = null;
        final int conditionObj4 = 0;
        final int conditionObj5 = 0;
        TreeNode<K, V> next;
        for (TreeNode<K, V> x = this; x != null; x = next) {
            next = (TreeNode)x.next;
            final TreeNode<K, V> treeNode = x;
            final TreeNode<K, V> treeNode2 = x;
            final TreeNode<K, V> treeNode3 = null;
            treeNode2.right = treeNode3;
            treeNode.left = treeNode3;
            if (root == null) {
                x.parent = null;
                x.red = false;
                root = x;
            }
            else {
                final K k = x.key;
                final int h = x.hash;
                Class<?> kc = null;
                TreeNode<K, V> p = root;
                int dir;
                TreeNode<K, V> xp;
                do {
                    final K pk = p.key;
                    final int ph;
                    if ((ph = p.hash) > h) {
                        dir = -1;
                    }
                    else if (ph < h) {
                        dir = 1;
                    }
                    else if ((kc == null && (kc = this.comparableClassFor(k)) == null) || (dir = this.compareComparables(kc, k, pk)) == conditionObj5) {
                        dir = tieBreakOrder(k, pk);
                    }
                    xp = p;
                } while ((p = ((dir <= conditionObj4) ? p.left : p.right)) != null);
                x.parent = xp;
                if (dir <= 0) {
                    xp.left = x;
                }
                else {
                    xp.right = x;
                }
                root = balanceInsertion(root, x);
            }
        }
        moveRootToFront(tab, root);
    }
    
    final Node<K, V> untreeify() {
        Node<K, V> hd = null;
        Node<K, V> tl = null;
        for (Node<K, V> q = this; q != null; q = q.next) {
            final Node<K, V> p = new Node<K, V>(q.hash, q.key, q.value, null);
            if (tl == null) {
                hd = p;
            }
            else {
                tl.next = p;
            }
            tl = p;
        }
        return hd;
    }
    
    final TreeNode<K, V> putTreeVal(final Node<K, V>[] tab, final int h, final K k, final V v) {
        Class<?> kc = null;
        boolean searched = false;
        final TreeNode<K, V> root = (this.parent != null) ? this.root() : this;
        final int conditionObj6 = 0;
        final int conditionObj7 = 0;
        final int conditionObj8 = 0;
        TreeNode<K, V> p = root;
        while (true) {
            final int ph;
            int dir;
            if ((ph = p.hash) > h) {
                dir = -1;
            }
            else if (ph < h) {
                dir = 1;
            }
            else {
                final K pk;
                if ((pk = p.key) == k || (pk != null && k.equals(pk))) {
                    return p;
                }
                if ((kc == null && (kc = this.comparableClassFor(k)) == null) || (dir = this.compareComparables(kc, k, pk)) == conditionObj8) {
                    if (!searched) {
                        searched = true;
                        TreeNode<K, V> ch;
                        TreeNode<K, V> q;
                        if (((ch = p.left) != null && (q = ch.find(h, k, kc)) != null) || ((ch = p.right) != null && (q = ch.find(h, k, kc)) != null)) {
                            return q;
                        }
                    }
                    dir = tieBreakOrder(k, pk);
                }
            }
            final TreeNode<K, V> xp = p;
            if ((p = ((dir <= conditionObj7) ? p.left : p.right)) == null) {
                final Node<K, V> xpn = xp.next;
                final TreeNode<K, V> x = new TreeNode<K, V>(h, k, v, xpn);
                if (dir <= conditionObj6) {
                    xp.left = x;
                }
                else {
                    xp.right = x;
                }
                xp.next = x;
                final TreeNode<K, V> treeNode = x;
                final TreeNode<K, V> treeNode2 = x;
                final TreeNode<K, V> treeNode3 = xp;
                treeNode2.prev = treeNode3;
                treeNode.parent = treeNode3;
                if (xpn != null) {
                    ((TreeNode)xpn).prev = x;
                }
                moveRootToFront(tab, (TreeNode<K, V>)balanceInsertion((TreeNode<K, V>)root, (TreeNode<K, V>)x));
                return null;
            }
        }
    }
    
    final void removeTreeNode(final Node<K, V>[] tab, final boolean movable) {
        final int conditionObj9 = 0;
        final int n;
        if (tab == null || (n = tab.length) == conditionObj9) {
            return;
        }
        final int index = n - 1 & this.hash;
        TreeNode<K, V> root;
        TreeNode<K, V> first = root = (TreeNode)tab[index];
        final TreeNode<K, V> succ = (TreeNode)this.next;
        final TreeNode<K, V> pred = this.prev;
        if (pred == null) {
            first = (TreeNode<K, V>)(tab[index] = succ);
        }
        else {
            pred.next = succ;
        }
        if (succ != null) {
            succ.prev = pred;
        }
        if (first == null) {
            return;
        }
        if (root.parent != null) {
            root = root.root();
        }
        final TreeNode<K, V> rl;
        if (root == null || root.right == null || (rl = root.left) == null || rl.left == null) {
            tab[index] = first.untreeify();
            return;
        }
        final TreeNode<K, V> pl = this.left;
        final TreeNode<K, V> pr = this.right;
        TreeNode<K, V> replacement;
        if (pl != null && pr != null) {
            TreeNode<K, V> s;
            TreeNode<K, V> sl;
            for (s = pr; (sl = s.left) != null; s = sl) {}
            final boolean c = s.red;
            s.red = this.red;
            this.red = c;
            final TreeNode<K, V> sr = s.right;
            final TreeNode<K, V> pp = this.parent;
            if (s == pr) {
                this.parent = s;
                s.right = this;
            }
            else {
                final TreeNode<K, V> sp = s.parent;
                if ((this.parent = sp) != null) {
                    if (s == sp.left) {
                        sp.left = this;
                    }
                    else {
                        sp.right = this;
                    }
                }
                if ((s.right = pr) != null) {
                    pr.parent = s;
                }
            }
            this.left = null;
            if ((this.right = sr) != null) {
                sr.parent = this;
            }
            if ((s.left = pl) != null) {
                pl.parent = s;
            }
            if ((s.parent = pp) == null) {
                root = s;
            }
            else if (this == pp.left) {
                pp.left = s;
            }
            else {
                pp.right = s;
            }
            if (sr != null) {
                replacement = sr;
            }
            else {
                replacement = this;
            }
        }
        else if (pl != null) {
            replacement = pl;
        }
        else if (pr != null) {
            replacement = pr;
        }
        else {
            replacement = this;
        }
        if (replacement != this) {
            final TreeNode<K, V> treeNode = replacement;
            final TreeNode<K, V> parent = this.parent;
            treeNode.parent = parent;
            final TreeNode<K, V> pp2 = parent;
            if (pp2 == null) {
                root = replacement;
            }
            else if (this == pp2.left) {
                pp2.left = replacement;
            }
            else {
                pp2.right = replacement;
            }
            final TreeNode<K, V> left = null;
            this.parent = left;
            this.right = left;
            this.left = left;
        }
        final TreeNode<K, V> r = this.red ? root : balanceDeletion(root, replacement);
        if (replacement == this) {
            final TreeNode<K, V> pp3 = this.parent;
            this.parent = null;
            if (pp3 != null) {
                if (this == pp3.left) {
                    pp3.left = null;
                }
                else if (this == pp3.right) {
                    pp3.right = null;
                }
            }
        }
        if (movable) {
            moveRootToFront(tab, r);
        }
    }
    
    final void split(final HashMap<K, V> map, final Node<K, V>[] tab, final int index, final int bit) {
        TreeNode<K, V> loHead = null;
        TreeNode<K, V> loTail = null;
        TreeNode<K, V> hiHead = null;
        TreeNode<K, V> hiTail = null;
        int lc = 0;
        int hc = 0;
        final int conditionObj10 = 0;
        TreeNode<K, V> next;
        for (TreeNode<K, V> e = this; e != null; e = next) {
            next = (TreeNode)e.next;
            e.next = null;
            if ((e.hash & bit) == conditionObj10) {
                if ((e.prev = loTail) == null) {
                    loHead = e;
                }
                else {
                    loTail.next = e;
                }
                loTail = e;
                ++lc;
            }
            else {
                if ((e.prev = hiTail) == null) {
                    hiHead = e;
                }
                else {
                    hiTail.next = e;
                }
                hiTail = e;
                ++hc;
            }
        }
        if (loHead != null) {
            if (lc <= 6) {
                tab[index] = loHead.untreeify();
            }
            else {
                tab[index] = loHead;
                if (hiHead != null) {
                    loHead.treeify(tab);
                }
            }
        }
        if (hiHead != null) {
            if (hc <= 6) {
                tab[index + bit] = hiHead.untreeify();
            }
            else {
                tab[index + bit] = hiHead;
                if (loHead != null) {
                    hiHead.treeify(tab);
                }
            }
        }
    }
    
    static <K, V> TreeNode<K, V> rotateLeft(TreeNode<K, V> root, final TreeNode<K, V> p) {
        final TreeNode<K, V> r;
        if (p != null && (r = p.right) != null) {
            final TreeNode<K, V> left = r.left;
            p.right = left;
            final TreeNode<K, V> rl;
            if ((rl = left) != null) {
                rl.parent = p;
            }
            final TreeNode<K, V> treeNode = r;
            final TreeNode<K, V> parent = p.parent;
            treeNode.parent = parent;
            final TreeNode<K, V> pp;
            if ((pp = parent) == null) {
                (root = r).red = false;
            }
            else if (pp.left == p) {
                pp.left = r;
            }
            else {
                pp.right = r;
            }
            r.left = p;
            p.parent = r;
        }
        return root;
    }
    
    static <K, V> TreeNode<K, V> rotateRight(TreeNode<K, V> root, final TreeNode<K, V> p) {
        final TreeNode<K, V> l;
        if (p != null && (l = p.left) != null) {
            final TreeNode<K, V> right = l.right;
            p.left = right;
            final TreeNode<K, V> lr;
            if ((lr = right) != null) {
                lr.parent = p;
            }
            final TreeNode<K, V> treeNode = l;
            final TreeNode<K, V> parent = p.parent;
            treeNode.parent = parent;
            final TreeNode<K, V> pp;
            if ((pp = parent) == null) {
                (root = l).red = false;
            }
            else if (pp.right == p) {
                pp.right = l;
            }
            else {
                pp.left = l;
            }
            l.right = p;
            p.parent = l;
        }
        return root;
    }
    
    static <K, V> TreeNode<K, V> balanceInsertion(TreeNode<K, V> root, TreeNode<K, V> x) {
        x.red = true;
        TreeNode<K, V> xp;
        while ((xp = x.parent) != null) {
            TreeNode<K, V> xpp;
            if (!xp.red || (xpp = xp.parent) == null) {
                return root;
            }
            final TreeNode<K, V> xppl;
            if (xp == (xppl = xpp.left)) {
                final TreeNode<K, V> xppr;
                if ((xppr = xpp.right) != null && xppr.red) {
                    xppr.red = false;
                    xp.red = false;
                    xpp.red = true;
                    x = xpp;
                }
                else {
                    if (x == xp.right) {
                        root = (TreeNode<K, V>)rotateLeft((TreeNode<Object, Object>)root, (TreeNode<Object, Object>)(x = xp));
                        xpp = (((xp = x.parent) == null) ? null : xp.parent);
                    }
                    if (xp == null) {
                        continue;
                    }
                    xp.red = false;
                    if (xpp == null) {
                        continue;
                    }
                    xpp.red = true;
                    root = (TreeNode<K, V>)rotateRight((TreeNode<Object, Object>)root, (TreeNode<Object, Object>)xpp);
                }
            }
            else if (xppl != null && xppl.red) {
                xppl.red = false;
                xp.red = false;
                xpp.red = true;
                x = xpp;
            }
            else {
                if (x == xp.left) {
                    root = (TreeNode<K, V>)rotateRight((TreeNode<Object, Object>)root, (TreeNode<Object, Object>)(x = xp));
                    xpp = (((xp = x.parent) == null) ? null : xp.parent);
                }
                if (xp == null) {
                    continue;
                }
                xp.red = false;
                if (xpp == null) {
                    continue;
                }
                xpp.red = true;
                root = (TreeNode<K, V>)rotateLeft((TreeNode<Object, Object>)root, (TreeNode<Object, Object>)xpp);
            }
        }
        x.red = false;
        return x;
    }
    
    static <K, V> TreeNode<K, V> balanceDeletion(TreeNode<K, V> root, TreeNode<K, V> x) {
        while (x != null && x != root) {
            TreeNode<K, V> xp;
            if ((xp = x.parent) == null) {
                x.red = false;
                return x;
            }
            if (x.red) {
                x.red = false;
                return root;
            }
            TreeNode<K, V> xpl;
            if ((xpl = xp.left) == x) {
                TreeNode<K, V> xpr;
                if ((xpr = xp.right) != null && xpr.red) {
                    xpr.red = false;
                    xp.red = true;
                    root = (TreeNode<K, V>)rotateLeft((TreeNode<Object, Object>)root, (TreeNode<Object, Object>)xp);
                    xpr = (((xp = x.parent) == null) ? null : xp.right);
                }
                if (xpr == null) {
                    x = xp;
                }
                else {
                    final TreeNode<K, V> sl = xpr.left;
                    TreeNode<K, V> sr = xpr.right;
                    if ((sr == null || !sr.red) && (sl == null || !sl.red)) {
                        xpr.red = true;
                        x = xp;
                    }
                    else {
                        if (sr == null || !sr.red) {
                            if (sl != null) {
                                sl.red = false;
                            }
                            xpr.red = true;
                            root = (TreeNode<K, V>)rotateRight((TreeNode<Object, Object>)root, (TreeNode<Object, Object>)xpr);
                            xpr = (((xp = x.parent) == null) ? null : xp.right);
                        }
                        if (xpr != null) {
                            xpr.red = (xp != null && xp.red);
                            if ((sr = xpr.right) != null) {
                                sr.red = false;
                            }
                        }
                        if (xp != null) {
                            xp.red = false;
                            root = (TreeNode<K, V>)rotateLeft((TreeNode<Object, Object>)root, (TreeNode<Object, Object>)xp);
                        }
                        x = root;
                    }
                }
            }
            else {
                if (xpl != null && xpl.red) {
                    xpl.red = false;
                    xp.red = true;
                    root = (TreeNode<K, V>)rotateRight((TreeNode<Object, Object>)root, (TreeNode<Object, Object>)xp);
                    xpl = (((xp = x.parent) == null) ? null : xp.left);
                }
                if (xpl == null) {
                    x = xp;
                }
                else {
                    TreeNode<K, V> sl = xpl.left;
                    final TreeNode<K, V> sr = xpl.right;
                    if ((sl == null || !sl.red) && (sr == null || !sr.red)) {
                        xpl.red = true;
                        x = xp;
                    }
                    else {
                        if (sl == null || !sl.red) {
                            if (sr != null) {
                                sr.red = false;
                            }
                            xpl.red = true;
                            root = (TreeNode<K, V>)rotateLeft((TreeNode<Object, Object>)root, (TreeNode<Object, Object>)xpl);
                            xpl = (((xp = x.parent) == null) ? null : xp.left);
                        }
                        if (xpl != null) {
                            xpl.red = (xp != null && xp.red);
                            if ((sl = xpl.left) != null) {
                                sl.red = false;
                            }
                        }
                        if (xp != null) {
                            xp.red = false;
                            root = (TreeNode<K, V>)rotateRight((TreeNode<Object, Object>)root, (TreeNode<Object, Object>)xp);
                        }
                        x = root;
                    }
                }
            }
        }
        return root;
    }
    
    static <K, V> boolean checkInvariants(final TreeNode<K, V> t) {
        final TreeNode<K, V> tp = t.parent;
        final TreeNode<K, V> tl = t.left;
        final TreeNode<K, V> tr = t.right;
        final TreeNode<K, V> tb = t.prev;
        final TreeNode<K, V> tn = (TreeNode<K, V>)(TreeNode)t.next;
        return (tb == null || tb.next == t) && (tn == null || tn.prev == t) && (tp == null || t == tp.left || t == tp.right) && (tl == null || (tl.parent == t && tl.hash <= t.hash)) && (tr == null || (tr.parent == t && tr.hash >= t.hash)) && (!t.red || tl == null || !tl.red || tr == null || !tr.red) && (tl == null || checkInvariants((TreeNode<Object, Object>)tl)) && (tr == null || checkInvariants((TreeNode<Object, Object>)tr));
    }
    
    Class<?> comparableClassFor(final Object x) {
        if (x instanceof Comparable) {
            final Class<?> c;
            if ((c = (Class<?>)x.getClass()) == String.class) {
                return c;
            }
            final Type[] ts;
            if ((ts = c.getGenericInterfaces()) != null) {
                for (int i = 0; i < ts.length; ++i) {
                    final Type t;
                    final ParameterizedType p;
                    final Type[] as;
                    if ((t = ts[i]) instanceof ParameterizedType && (p = (ParameterizedType)t).getRawType() == Comparable.class && (as = p.getActualTypeArguments()) != null && as.length == 1 && as[0] == c) {
                        return c;
                    }
                }
            }
        }
        return null;
    }
    
    int compareComparables(final Class<?> kc, final Object k, final Object x) {
        return (x == null || x.getClass() != kc) ? 0 : ((Comparable)k).compareTo(x);
    }
    
    private static <K, V> void moveRootToFrontHelper(final TreeNode<K, V> root, final Node<K, V>[] tab) {
        final int conditionObj0 = 0;
        final int n;
        if (root != null && tab != null && (n = tab.length) > conditionObj0) {
            final int index = n - 1 & root.hash;
            final TreeNode<K, V> first = (TreeNode<K, V>)(TreeNode)tab[index];
            if (root != first) {
                tab[index] = root;
                final TreeNode<K, V> rp = root.prev;
                final Node<K, V> rn;
                if ((rn = root.next) != null) {
                    ((TreeNode)rn).prev = (TreeNode<K, V>)rp;
                }
                if (rp != null) {
                    rp.next = rn;
                }
                if (first != null) {
                    first.prev = root;
                }
                root.next = first;
                root.prev = null;
            }
            assert checkInvariants(root);
        }
    }
}
