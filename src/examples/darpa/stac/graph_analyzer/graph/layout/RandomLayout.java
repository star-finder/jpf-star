package darpa.stac.graph_analyzer.graph.layout;

import darpa.stac.graph_analyzer.graph.*;
import darpa.stac.graph_analyzer.logging.*;
import java.util.*;

public class RandomLayout implements Action
{
    int x;
    int y;
    int w;
    int h;
    boolean m_recurse;
    static Random s_rand;
    
    public RandomLayout(final int width, final int height, final int border) {
        this.m_recurse = false;
        this.x = border;
        this.y = border;
        this.w = width - 2 * border;
        this.h = height - 2 * border;
    }
    
    public void apply(final Graph g) {
        this.step(g);
    }
    
    public void init(final Graph g) {
    }
    
    public void step(final Graph g) {
        final Enumeration e = g.nodes.elements();
        while (e.hasMoreElements()) {
            final Node n = (Node)e.nextElement();
            if (this.m_recurse && n instanceof Graph) {
                final Graph sub = (Graph)n;
                this.apply(sub);
            }
            n.x = 200 + RandomLayout.s_rand.nextInt(1000);
            n.y = 200 + RandomLayout.s_rand.nextInt(1000);
            LogFactory.getLog(null).info(new StringBuilder().append("x:").append(n.x).append(" y:").append(n.y).toString());
        }
    }
    
    public void finish(final Graph g) {
    }
    
    static {
        RandomLayout.s_rand = new Random(1000L);
    }
}
