package darpa.stac.graph_analyzer.graph.cell;

import darpa.stac.graph_analyzer.graph.rep.*;
import java.awt.*;
import darpa.stac.graph_analyzer.graph.*;
import java.util.*;

public class Cell extends Graph
{
    public Vector ports;
    public NodeRep lodRep;
    
    public Cell() {
        this.ports = new Vector();
        this.lodRep = null;
    }
    
    public Cell(final int n) {
        super(n);
        this.ports = new Vector();
        this.lodRep = null;
    }
    
    public Cell(final int n, final int incr) {
        super(n, incr);
        this.ports = new Vector();
        this.lodRep = null;
    }
    
    @Override
    public void paint(final Graphics g) {
        if (this.parent != null) {
            if (!this.explode) {
                if (this.lodRep != null) {
                    this.lodRep.paint(g, this.x, this.y, this.w, this.h);
                }
                if (this.lbl != null) {
                    this.lbl.paint(g, this.x, this.y - this.w / 4.0);
                }
            }
            else {
                super.paint(g);
            }
        }
        if (this.explode) {
            Enumeration e = this.nodes.elements();
            while (e.hasMoreElements()) {
                final Node n = (Node)e.nextElement();
                n.paintEdges(g);
            }
            e = this.ports.elements();
            while (e.hasMoreElements()) {
                final Node n = (Node)e.nextElement();
                n.paintEdges(g);
            }
            e = this.nodes.elements();
            while (e.hasMoreElements()) {
                final Node n = (Node)e.nextElement();
                n.paint(g);
            }
            e = this.ports.elements();
            while (e.hasMoreElements()) {
                final Node n = (Node)e.nextElement();
                n.paint(g);
            }
        }
    }
}
