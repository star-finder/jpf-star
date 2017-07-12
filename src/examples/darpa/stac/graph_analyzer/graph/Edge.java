package darpa.stac.graph_analyzer.graph;

import darpa.stac.graph_analyzer.graph.rep.*;
import darpa.stac.graph_analyzer.logging.*;
import java.awt.*;

public class Edge extends Element
{
    public EdgeRep rep;
    public LabelRep lbl;
    public Node head;
    public Node tail;
    public String name;
    public boolean directed;
    public double weight;
    public int weightint;
    public final double density = 0.0;
    
    public Edge() {
        this.rep = new EdgeRep();
        this.lbl = new LabelRep();
        this.head = null;
        this.tail = null;
        this.name = null;
        this.directed = true;
        this.weight = 1.0;
        this.weightint = 1;
    }
    
    public Edge(final Node tail, final Node head, final double weight) {
        this.rep = new EdgeRep();
        this.lbl = new LabelRep();
        this.head = null;
        this.tail = null;
        this.name = null;
        this.directed = true;
        this.weight = 1.0;
        this.weightint = 1;
        this.tail = tail;
        this.head = head;
        this.weight = weight;
    }
    
    public Edge(final Node tail, final Node head) {
        this.rep = new EdgeRep();
        this.lbl = new LabelRep();
        this.head = null;
        this.tail = null;
        this.name = null;
        this.directed = true;
        this.weight = 1.0;
        this.weightint = 1;
        this.tail = tail;
        this.head = head;
    }
    
    public void detach() {
        if (this.tail != null) {
            if (!this.tail.out.removeElement((Object)this)) {
                LogFactory.getLog(null).info("ERROR TAIL 2!");
                System.exit(0);
            }
            this.tail = null;
        }
        if (this.head != null) {
            if (!this.head.in.removeElement((Object)this)) {
                LogFactory.getLog(null).info("ERROR HEAD 2!");
                System.exit(0);
            }
            this.head = null;
        }
    }
    
    public void swapHead(final Node n) {
        if (this.head != null) {
            this.head.in.removeElement((Object)this);
        }
        this.head = n;
        n.in.addElement(this);
    }
    
    public void swapTail(final Node n) {
        if (this.tail != null) {
            this.tail.out.removeElement((Object)this);
        }
        this.tail = n;
        n.out.addElement(this);
    }
    
    public void paint(final Graphics g) {
        if (this.rep != null) {
            this.rep.paint(g, this.tail.x + this.tail.w / 2.0, this.tail.y + this.tail.h / 2.0, this.head.x + this.head.w / 2.0, this.head.y + this.head.h / 2.0);
        }
        if (this.lbl != null) {
            final double x = (this.tail.x + this.head.x) / 2.0;
            final double y = (this.tail.y + this.head.y) / 2.0;
            this.lbl.paint(g, x, y);
        }
    }
}
