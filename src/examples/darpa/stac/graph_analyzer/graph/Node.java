package darpa.stac.graph_analyzer.graph;

import darpa.stac.graph_analyzer.graph.rep.*;
import java.util.*;
import darpa.stac.graph_analyzer.graph.dot.*;
import darpa.stac.graph_analyzer.logging.*;
import java.awt.*;

public class Node extends Element implements Cloneable
{
    public static final int DEFAULT_WIDTH = 6;
    public static final int DEFAULT_HEIGHT = 6;
    public static final double FRAME = 1000.0;
    public Color color;
    public Object[] attrs;
    public NodeRep rep;
    public LabelRep lbl;
    public String name;
    public double x;
    public double y;
    public double w;
    public double h;
    public Graph parent;
    public Vector<Edge> in;
    public Vector<Edge> out;
    public double weight;
    
    public Node() {
        this.attrs = null;
        this.rep = new NodeRep();
        this.lbl = new LabelRep();
        this.name = null;
        this.x = 0.0;
        this.y = 0.0;
        this.w = 6.0;
        this.h = 6.0;
        this.parent = null;
        this.in = new Vector<Edge>();
        this.out = new Vector<Edge>();
    }
    
    public Node(final double x, final double y) {
        this.attrs = null;
        this.rep = new NodeRep();
        this.lbl = new LabelRep();
        this.name = null;
        this.x = 0.0;
        this.y = 0.0;
        this.w = 6.0;
        this.h = 6.0;
        this.parent = null;
        this.in = new Vector<Edge>();
        this.out = new Vector<Edge>();
        this.x = x;
        this.y = y;
    }
    
    public Node(final double x, final double y, final double w, final double h) {
        this.attrs = null;
        this.rep = new NodeRep();
        this.lbl = new LabelRep();
        this.name = null;
        this.x = 0.0;
        this.y = 0.0;
        this.w = 6.0;
        this.h = 6.0;
        this.parent = null;
        this.in = new Vector<Edge>();
        this.out = new Vector<Edge>();
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    
    public Node(final String nodeName, final double nodeWeight) {
        this.attrs = null;
        this.rep = new NodeRep();
        this.lbl = new LabelRep();
        this.name = null;
        this.x = 0.0;
        this.y = 0.0;
        this.w = 6.0;
        this.h = 6.0;
        this.parent = null;
        this.in = new Vector<Edge>();
        this.out = new Vector<Edge>();
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public String getType() {
        final int s_dotIndex = AttributeManager.getIndex("Dot");
        final DotInfo info = (DotInfo)this.getAttr(s_dotIndex);
        if (info != null) {
            return (String)info.props.get("type");
        }
        return null;
    }
    
    public Edge attach(final Node n) throws GraphException {
        if (!this.equals((Object)n)) {
            final Edge e = new Edge(this, n);
            this.out.addElement(e);
            n.in.addElement(e);
            if (!e.head.in.contains((Object)e)) {
                LogFactory.getLog(null).info("ERROR HEAD!");
                System.exit(0);
            }
            if (!e.tail.out.contains((Object)e)) {
                LogFactory.getLog(null).info("ERROR TAIL!");
                System.exit(0);
            }
            return e;
        }
        return null;
    }
    
    public void paintEdges(final Graphics g) {
        for (int i = 0; i < this.out.size(); ++i) {
            ((Edge)this.out.elementAt(i)).paint(g);
        }
    }
    
    public void paint(final Graphics g) {
        if (this.rep != null) {
            this.rep.paint(g, this.x, this.y, this.w, this.h);
        }
        if (this.lbl != null) {
            this.lbl.paint(g, this.x, this.y - this.w / 4.0);
        }
    }
    
    public void paint(final Graphics g, final double px, final double py, final double pw, final double ph) {
        final double wx = px + this.x * pw / 1000.0;
        final double wy = py + this.y * ph / 1000.0;
        final double ww = this.w * pw / 1000.0;
        final double wh = this.h * ph / 1000.0;
        if (this.rep != null) {
            this.rep.paint(g, wx, wy, ww, wh);
        }
        if (this.lbl != null) {
            this.lbl.paint(g, wx, wy);
        }
    }
}
