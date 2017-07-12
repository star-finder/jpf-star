package darpa.stac.graph_analyzer.graph.cluster;

import darpa.stac.graph_analyzer.graph.*;
import java.util.*;

public class MinCut implements Action
{
    static Random s_rand;
    public static int s_mincutIndex;
    
    public MinCut() {
        if (MinCut.s_mincutIndex == AttributeManager.NO_INDEX) {
            MinCut.s_mincutIndex = AttributeManager.getIndex("MinCut");
        }
    }
    
    public void init(final Graph g) {
        final Enumeration nodes = g.nodes.elements();
        while (nodes.hasMoreElements()) {
            final Node n = (Node)nodes.nextElement();
            final Enumeration outEdges = n.out.elements();
            while (outEdges.hasMoreElements()) {
                final Edge e = (Edge)outEdges.nextElement();
                CutAttr a = (CutAttr)e.getAttr(MinCut.s_mincutIndex);
                if (a == null) {
                    a = new CutAttr();
                    e.setAttr(MinCut.s_mincutIndex, a);
                }
            }
        }
    }
    
    public void apply(final Graph g) {
    }
    
    public void step(final Graph g) {
    }
    
    public void finish(final Graph g) {
    }
    
    static {
        MinCut.s_rand = new Random(System.currentTimeMillis());
        MinCut.s_mincutIndex = AttributeManager.NO_INDEX;
    }
}
