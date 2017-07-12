package darpa.stac.graph_analyzer.graph.cluster;

import darpa.stac.graph_analyzer.graph.*;
import java.util.*;

public class BuddyCluster
{
    float thresh;
    
    public BuddyCluster() {
        this.thresh = 4.0f;
    }
    
    public void init(final Graph g) {
    }
    
    public void finish(final Graph g) {
    }
    
    public void apply(final Graph g) {
    }
    
    public float connectivity(final Graph g) {
        int tot = 0;
        final Enumeration ns = g.nodes.elements();
        while (ns.hasMoreElements()) {
            final Node n = (Node)ns.nextElement();
            final Enumeration out = n.out.elements();
            while (out.hasMoreElements()) {
                final Edge e = (Edge)out.nextElement();
                if (g.nodes.contains((Object)e.head)) {
                    tot += (int)e.weight;
                }
            }
        }
        return tot / g.nodes.size();
    }
}
