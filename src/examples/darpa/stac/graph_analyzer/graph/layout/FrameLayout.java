package darpa.stac.graph_analyzer.graph.layout;

import darpa.stac.graph_analyzer.graph.*;
import java.util.*;

public class FrameLayout implements Action
{
    int m_gap;
    boolean m_recurse;
    
    public FrameLayout() {
        this.m_gap = 1;
        this.m_recurse = true;
    }
    
    public FrameLayout(final int gap) {
        this.m_gap = 1;
        this.m_recurse = true;
        this.m_gap = gap;
    }
    
    public void apply(final Graph g) {
        this.step(g);
    }
    
    public void init(final Graph g) {
    }
    
    public void finish(final Graph g) {
    }
    
    public void step(final Graph g) {
        double minx = Double.MAX_VALUE;
        double miny = Double.MAX_VALUE;
        double maxx = Double.MIN_VALUE;
        double maxy = Double.MIN_VALUE;
        final Enumeration e = g.nodes.elements();
        while (e.hasMoreElements()) {
            final Node n = (Node)e.nextElement();
            if (this.m_recurse && n instanceof Graph) {
                final Graph sub = (Graph)n;
                this.apply(sub);
            }
            minx = Math.min(n.x, minx);
            miny = Math.min(n.y, miny);
            maxx = Math.max(n.x + n.w, maxx);
            maxy = Math.max(n.y + n.h, maxy);
        }
        g.x = minx - this.m_gap;
        g.y = miny - this.m_gap;
        g.w = maxx - minx + 2 * this.m_gap;
        g.h = maxy - miny + 2 * this.m_gap;
    }
}
