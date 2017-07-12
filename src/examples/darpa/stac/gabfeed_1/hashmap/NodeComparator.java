package darpa.stac.gabfeed_1.hashmap;

import java.util.*;

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
