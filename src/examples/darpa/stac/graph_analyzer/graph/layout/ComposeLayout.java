package darpa.stac.graph_analyzer.graph.layout;

import darpa.stac.graph_analyzer.graph.*;
import java.util.*;

public class ComposeLayout implements Action
{
    boolean m_recurse;
    
    public ComposeLayout() {
        this.m_recurse = true;
    }
    
    public void apply(final Graph g) {
        this.step(g);
    }
    
    public void init(final Graph g) {
    }
    
    public void finish(final Graph g) {
    }
    
    public void step(final Graph g) {
        int x = 0;
        int y = 0;
        int w = 0;
        int h = 0;
        final Enumeration e = g.nodes.elements();
        while (e.hasMoreElements()) {
            final Node n = (Node)e.nextElement();
            if (this.m_recurse && n instanceof Graph) {
                final Graph sub = (Graph)n;
                this.apply(sub);
            }
            x += (int)n.x;
            y += (int)n.y;
            w += (int)n.w;
            h += (int)n.h;
        }
        g.x = x / g.nodes.size();
        g.y = y / g.nodes.size();
        g.w = w / g.nodes.size();
        g.h = h / g.nodes.size();
    }
}
