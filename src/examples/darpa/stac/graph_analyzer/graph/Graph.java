package darpa.stac.graph_analyzer.graph;

import darpa.stac.graph_analyzer.logging.*;
import java.util.*;
import java.awt.*;

public class Graph extends Node
{
    public Vector<Node> nodes;
    public boolean explode;
    public boolean directed;
    
    public Graph() {
        this.explode = true;
        this.directed = true;
        this.nodes = new Vector<Node>();
        this.init();
    }
    
    public Graph(final int n) {
        this.explode = true;
        this.directed = true;
        this.nodes = new Vector<Node>(n);
        this.init();
    }
    
    public Graph(final int n, final int incr) {
        this.explode = true;
        this.directed = true;
        this.nodes = new Vector<Node>(n, incr);
        this.init();
    }
    
    private void init() {
        this.rep.fill = null;
    }
    
    public Graph(final AdjacencyMatrix m) throws GraphException {
        this.explode = true;
        this.directed = true;
        this.nodes = new Vector<Node>(m.names.length);
        for (int i = 0; i < m.names.length; ++i) {
            final Node n = new Node();
            n.name = m.names[i];
            n.lbl.label = n.name;
            this.add(n);
        }
        for (int i = 0; i < this.nodes.size(); ++i) {
            for (int j = 0; j < this.nodes.size(); ++j) {
                final int wt = m.values[i][j];
                if (wt != 0 && i != j && (m.directed || i < j)) {
                    final Node head = (Node)this.nodes.elementAt(i);
                    final Node tail = (Node)this.nodes.elementAt(j);
                    final Edge e = tail.attach(head);
                    e.weight = wt;
                    e.directed = m.directed;
                }
            }
        }
        this.init();
    }
    
    public void check() {
        final Enumeration ns = this.nodes.elements();
        while (ns.hasMoreElements()) {
            final Node n = (Node)ns.nextElement();
            Enumeration es = n.out.elements();
            while (es.hasMoreElements()) {
                final Edge e = (Edge)es.nextElement();
                if (!e.tail.out.contains((Object)e) || !e.head.in.contains((Object)e)) {
                    LogFactory.getLog(null).info("ERROR OUT!");
                    System.exit(0);
                }
            }
            es = n.in.elements();
            while (es.hasMoreElements()) {
                final Edge e = (Edge)es.nextElement();
                if (!e.tail.out.contains((Object)e) || !e.head.in.contains((Object)e)) {
                    LogFactory.getLog(null).info("ERROR OUT!");
                    System.exit(0);
                }
            }
        }
    }
    
    public void add(final Node n) {
        this.nodes.addElement(n);
        n.parent = this;
    }
    
    public void delete(final Node n) {
        while (n.out.size() > 0) {
            final Edge e = (Edge)n.out.elementAt(0);
            e.detach();
        }
        while (n.in.size() > 0) {
            final Edge e = (Edge)n.in.elementAt(0);
            e.detach();
        }
        this.nodes.removeElement((Object)n);
    }
    
    @Override
    public void paint(final Graphics g) {
        if (this.parent != null) {
            super.paint(g);
        }
        if (this.explode) {
            Enumeration e = this.nodes.elements();
            while (e.hasMoreElements()) {
                final Node n = (Node)e.nextElement();
                n.paintEdges(g);
            }
            e = this.nodes.elements();
            while (e.hasMoreElements()) {
                final Node n = (Node)e.nextElement();
                n.paint(g);
            }
        }
    }
    
    @Override
    public void paint(final Graphics g, final double px, final double py, final double pw, final double ph) {
        if (this.parent != null) {
            super.paint(g, px, py, pw, ph);
        }
        final double wx = px + this.x * pw / 1000.0;
        final double wy = py + this.y * ph / 1000.0;
        final double ww = this.w * pw / 1000.0;
        final double wh = this.h * ph / 1000.0;
        if (this.explode) {
            Enumeration e = this.nodes.elements();
            while (e.hasMoreElements()) {
                final Node n = (Node)e.nextElement();
                n.paintEdges(g);
            }
            e = this.nodes.elements();
            while (e.hasMoreElements()) {
                final Node n = (Node)e.nextElement();
                n.paint(g, wx, wx, ww, wh);
            }
        }
    }
}
