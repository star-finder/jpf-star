package darpa.stac.graph_analyzer.graph.cell;

import java.awt.*;
import darpa.stac.graph_analyzer.graph.*;

public class Net extends Node
{
    public Net() {
        this.rep = null;
    }
    
    @Override
    public void paint(final Graphics g) {
        super.paint(g);
    }
    
    public static Net attach(final Node n1, final Node n2) throws GraphException {
        if (n1.parent != n2.parent) {
            throw new GraphException("Nodes must be in same graph to be attached by a net!");
        }
        final Net n3 = new Net();
        n1.parent.add(n3);
        n3.x = (n1.x + n2.x) / 2.0;
        n3.y = (n1.y + n2.y) / 2.0;
        n3.w = (n1.w + n2.w) / 2.0;
        n3.h = (n1.h + n2.h) / 2.0;
        n1.attach(n3);
        n3.attach(n2);
        return n3;
    }
    
    public static Net attach(final Node[] ns) throws GraphException {
        if (ns.length > 0) {
            final Net n = new Net();
            ns[0].parent.add(n);
            for (int i = 0; i < ns.length; ++i) {
                if (ns[i].parent != n.parent) {
                    throw new GraphException();
                }
                final Net net = n;
                net.x += ns[i].x;
                final Net net2 = n;
                net2.y += ns[i].y;
                final Net net3 = n;
                net3.w += ns[i].w;
                final Net net4 = n;
                net4.h += ns[i].h;
                ns[i].attach(n);
            }
            final Net net5 = n;
            net5.x /= ns.length;
            final Net net6 = n;
            net6.y /= ns.length;
            final Net net7 = n;
            net7.w /= ns.length;
            final Net net8 = n;
            net8.h /= ns.length;
            return n;
        }
        return null;
    }
}
