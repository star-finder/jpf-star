package darpa.stac.gabfeed_1.hashmap;

import java.util.*;
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
        final TreeNodeHelper0 conditionObj0 = new TreeNodeHelper0(0);
        final int n;
        if (root != null && tab != null && (n = tab.length) > conditionObj0.getValue()) {
            moveRootToFrontHelper(root, n, tab);
        }
    }
    
    final TreeNode<K, V> find(final int h, final Object k, Class<?> kc) {
        TreeNode<K, V> p = this;
        final TreeNodeHelper1 conditionObj1 = new TreeNodeHelper1(0);
        final TreeNodeHelper2 conditionObj2 = new TreeNodeHelper2(0);
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
                if ((pk = p.key) == k || (k != null && k.equals((Object)pk))) {
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
                    if ((kc != null || (kc = this.comparableClassFor(k)) != null) && (dir = this.compareComparables(kc, k, pk)) != conditionObj2.getValue()) {
                        p = ((dir < conditionObj1.getValue()) ? pl : pr);
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
        final TreeNodeHelper3 conditionObj3 = new TreeNodeHelper3(0);
        int d;
        if (a == null || b == null || (d = a.getClass().getName().compareTo(b.getClass().getName())) == conditionObj3.getValue()) {
            d = ((System.identityHashCode(a) <= System.identityHashCode(b)) ? -1 : 1);
        }
        return d;
    }
    
    final void treeify(final Node<K, V>[] tab) {
        TreeNode<K, V> root = null;
        final TreeNodeHelper4 conditionObj4 = new TreeNodeHelper4(0);
        final TreeNodeHelper5 conditionObj5 = new TreeNodeHelper5(0);
        final TreeNodeHelper6 conditionObj6 = new TreeNodeHelper6(0);
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
                    else if ((kc == null && (kc = this.comparableClassFor(k)) == null) || (dir = this.compareComparables(kc, k, pk)) == conditionObj6.getValue()) {
                        dir = tieBreakOrder(k, pk);
                    }
                    xp = p;
                } while ((p = ((dir <= conditionObj5.getValue()) ? p.left : p.right)) != null);
                x.parent = xp;
                if (dir <= conditionObj4.getValue()) {
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
        final TreeNodeHelper7 conditionObj7 = new TreeNodeHelper7(0);
        final TreeNodeHelper8 conditionObj8 = new TreeNodeHelper8(0);
        final TreeNodeHelper9 conditionObj9 = new TreeNodeHelper9(0);
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
                if ((kc == null && (kc = this.comparableClassFor(k)) == null) || (dir = this.compareComparables(kc, k, pk)) == conditionObj9.getValue()) {
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
            if ((p = ((dir <= conditionObj8.getValue()) ? p.left : p.right)) == null) {
                final Node<K, V> xpn = xp.next;
                final TreeNode<K, V> x = new TreeNode<K, V>(h, k, v, xpn);
                if (dir <= conditionObj7.getValue()) {
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
        final TreeNodeHelper10 conditionObj10 = new TreeNodeHelper10(0);
        final int n;
        if (tab == null || (n = tab.length) == conditionObj10.getValue()) {
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
                    this.removeTreeNodeHelper(sp, s, this);
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
            this.removeTreeNodeHelper1(this);
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
        final TreeNodeHelper11 conditionObj11 = new TreeNodeHelper11(0);
        TreeNode<K, V> next;
        for (TreeNode<K, V> e = this; e != null; e = next) {
            next = (TreeNode)e.next;
            e.next = null;
            if ((e.hash & bit) == conditionObj11.getValue()) {
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
            this.splitHelper(hiHead, index, tab, loHead, lc);
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
        final TreeNodeHelper12 conditionObj12 = new TreeNodeHelper12(1);
        if (x instanceof Comparable) {
            final Class<?> c;
            if ((c = (Class<?>)x.getClass()) == String.class) {
                return c;
            }
            final Type[] ts;
            if ((ts = c.getGenericInterfaces()) != null) {
                int i = 0;
                while (i < ts.length) {
                    final Random randomNumberGeneratorInstance = new Random();
                    while (i < ts.length && randomNumberGeneratorInstance.nextDouble() < 0.5) {
                        while (i < ts.length && randomNumberGeneratorInstance.nextDouble() < 0.5) {
                            final Type t;
                            final ParameterizedType p;
                            final Type[] as;
                            if ((t = ts[i]) instanceof ParameterizedType && (p = (ParameterizedType)t).getRawType() == Comparable.class && (as = p.getActualTypeArguments()) != null && as.length == conditionObj12.getValue() && as[0] == c) {
                                return c;
                            }
                            ++i;
                        }
                    }
                }
            }
        }
        return null;
    }
    
    int compareComparables(final Class<?> kc, final Object k, final Object x) {
        return (x == null || x.getClass() != kc) ? 0 : ((Comparable)k).compareTo(x);
    }
    
    private static <K, V> void moveRootToFrontHelper(final TreeNode<K, V> root, final int n, final Node<K, V>[] tab) {
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
    
    private final void removeTreeNodeHelper(final TreeNode<K, V> sp, final TreeNode<K, V> s, final TreeNode<K, V> p) {
        if (s == sp.left) {
            sp.left = p;
        }
        else {
            sp.right = p;
        }
    }
    
    private final void removeTreeNodeHelper1(final TreeNode<K, V> p) {
        final TreeNode<K, V> pp = p.parent;
        p.parent = null;
        if (pp != null) {
            if (p == pp.left) {
                pp.left = null;
            }
            else if (p == pp.right) {
                pp.right = null;
            }
        }
    }
    
    private final void splitHelper(final TreeNode<K, V> hiHead, final int index, final Node<K, V>[] tab, final TreeNode<K, V> loHead, final int lc) {
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
    
    static class TreeNodeHelper0
    {
        private int conditionRHS;
        
        public TreeNodeHelper0(final int conditionRHS) {
            this.conditionRHS = conditionRHS;
        }
        
        public int getValue() {
            return this.conditionRHS;
        }
    }
    
    final class TreeNodeHelper1
    {
        private int conditionRHS;
        
        public TreeNodeHelper1(final int conditionRHS) {
            this.conditionRHS = conditionRHS;
        }
        
        public int getValue() {
            return this.conditionRHS;
        }
    }
    
    final class TreeNodeHelper2
    {
        private int conditionRHS;
        
        public TreeNodeHelper2(final int conditionRHS) {
            this.conditionRHS = conditionRHS;
        }
        
        public int getValue() {
            return this.conditionRHS;
        }
    }
    
    static class TreeNodeHelper3
    {
        private int conditionRHS;
        
        public TreeNodeHelper3(final int conditionRHS) {
            this.conditionRHS = conditionRHS;
        }
        
        public int getValue() {
            return this.conditionRHS;
        }
    }
    
    final class TreeNodeHelper4
    {
        private int conditionRHS;
        
        public TreeNodeHelper4(final int conditionRHS) {
            this.conditionRHS = conditionRHS;
        }
        
        public int getValue() {
            return this.conditionRHS;
        }
    }
    
    final class TreeNodeHelper5
    {
        private int conditionRHS;
        
        public TreeNodeHelper5(final int conditionRHS) {
            this.conditionRHS = conditionRHS;
        }
        
        public int getValue() {
            return this.conditionRHS;
        }
    }
    
    final class TreeNodeHelper6
    {
        private int conditionRHS;
        
        public TreeNodeHelper6(final int conditionRHS) {
            this.conditionRHS = conditionRHS;
        }
        
        public int getValue() {
            return this.conditionRHS;
        }
    }
    
    final class TreeNodeHelper7
    {
        private int conditionRHS;
        
        public TreeNodeHelper7(final int conditionRHS) {
            this.conditionRHS = conditionRHS;
        }
        
        public int getValue() {
            return this.conditionRHS;
        }
    }
    
    final class TreeNodeHelper8
    {
        private int conditionRHS;
        
        public TreeNodeHelper8(final int conditionRHS) {
            this.conditionRHS = conditionRHS;
        }
        
        public int getValue() {
            return this.conditionRHS;
        }
    }
    
    final class TreeNodeHelper9
    {
        private int conditionRHS;
        
        public TreeNodeHelper9(final int conditionRHS) {
            this.conditionRHS = conditionRHS;
        }
        
        public int getValue() {
            return this.conditionRHS;
        }
    }
    
    final class TreeNodeHelper10
    {
        private int conditionRHS;
        
        public TreeNodeHelper10(final int conditionRHS) {
            this.conditionRHS = conditionRHS;
        }
        
        public int getValue() {
            return this.conditionRHS;
        }
    }
    
    final class TreeNodeHelper11
    {
        private int conditionRHS;
        
        public TreeNodeHelper11(final int conditionRHS) {
            this.conditionRHS = conditionRHS;
        }
        
        public int getValue() {
            return this.conditionRHS;
        }
    }
    
    class TreeNodeHelper12
    {
        private int conditionRHS;
        
        public TreeNodeHelper12(final int conditionRHS) {
            this.conditionRHS = conditionRHS;
        }
        
        public int getValue() {
            return this.conditionRHS;
        }
    }
}
