package darpa.stac.graph_analyzer.graph;

import java.util.*;

public class AdjacencyMatrix extends Matrix
{
    public String[] names;
    public String name;
    public boolean directed;
    
    public AdjacencyMatrix(final int w) {
        super(w, w);
        this.names = null;
        this.name = null;
        this.directed = false;
        this.names = new String[w];
    }
    
    public AdjacencyMatrix(final Graph g) {
        super(g.nodes.size(), g.nodes.size());
        this.names = null;
        this.name = null;
        this.directed = false;
        this.names = new String[g.nodes.size()];
        this.name = g.name;
        int i = 0;
        final Enumeration e = g.nodes.elements();
        while (e.hasMoreElements()) {
            final Node n = (Node)e.nextElement();
            this.names[i++] = n.name;
            for (int j = 0; j < n.out.size(); ++j) {
                final Edge edge = (Edge)n.out.elementAt(j);
                final int x = g.nodes.indexOf((Object)edge.head);
                final int y = g.nodes.indexOf((Object)edge.tail);
                this.values[x][y] = edge.weightint;
            }
        }
    }
    
    @Override
    public String toString() {
        String s = new String();
        final int w = this.values.length;
        for (int h = this.values[0].length, i = 0; i < h; ++i) {
            for (int j = 0; j < w; ++j) {
                s = s + "\t" + this.values[i][j];
            }
            s = s + "\t" + this.names[i] + "\n";
        }
        return s;
    }
}
