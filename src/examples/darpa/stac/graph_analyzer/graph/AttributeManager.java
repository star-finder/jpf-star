package darpa.stac.graph_analyzer.graph;

import java.util.*;

public class AttributeManager
{
    public static int NO_INDEX;
    private static int DEFAULT_NUM_PKG;
    private static Hashtable<String,Integer> s_hash;
    private static int s_numattr;
    private static boolean s_dirty;
    
    public static int queryIndex(final String packageName) {
        final Integer i;
        if ((i = (Integer)AttributeManager.s_hash.get(packageName)) != null) {
            return i;
        }
        return AttributeManager.NO_INDEX;
    }
    
    public static int getIndex(final String packageName) {
        final int i;
        if ((i = queryIndex(packageName)) != AttributeManager.NO_INDEX) {
            return i;
        }
        final Integer ind = new Integer(AttributeManager.s_numattr++);
        if (AttributeManager.s_numattr % AttributeManager.DEFAULT_NUM_PKG == 0) {
            AttributeManager.s_dirty = true;
        }
        AttributeManager.s_hash.put(packageName, ind);
        return ind;
    }
    
    public static int getNumAttr() {
        return AttributeManager.s_numattr;
    }
    
    public static boolean getDirty() {
        return AttributeManager.s_dirty;
    }
    
    static {
        AttributeManager.NO_INDEX = -1;
        AttributeManager.DEFAULT_NUM_PKG = 5;
        AttributeManager.s_hash = new Hashtable<String,Integer>(AttributeManager.DEFAULT_NUM_PKG);
        AttributeManager.s_numattr = 0;
        AttributeManager.s_dirty = false;
    }
}
