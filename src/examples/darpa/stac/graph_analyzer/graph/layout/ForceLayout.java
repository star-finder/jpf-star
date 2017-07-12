package darpa.stac.graph_analyzer.graph.layout;

import darpa.stac.graph_analyzer.graph.cluster.*;
import java.util.*;
import java.awt.*;
import darpa.stac.graph_analyzer.graph.*;
import darpa.stac.graph_analyzer.logging.*;

public class ForceLayout implements Action, Painter
{
    public static int s_forceIndex;
    float m_temp;
    int m_width;
    int m_height;
    int m_border;
    public static final int NUM_DUMMY = 8;
    public Hashtable m_hash;
    public Color m_cool;
    public Color m_cold;
    
    public ForceLayout(final int width, final int height, final int border) {
        this.m_temp = 5.0f;
        this.m_hash = new Hashtable();
        this.m_cool = new Color(30, 30, 180);
        this.m_cold = new Color(50, 50, 220);
        this.m_width = width;
        this.m_height = height;
        this.m_border = border;
        if (ForceLayout.s_forceIndex == AttributeManager.NO_INDEX) {
            ForceLayout.s_forceIndex = AttributeManager.getIndex("Force");
        }
    }
    
    static double attract(final double x, final double k) {
        return x * x / k;
    }
    
    static double repel(final double x, final double k) {
        return k * k / x;
    }
    
    void cool() {
        if (this.m_temp > 0.001) {
            this.m_temp *= 0.95f;
        }
        else {
            this.m_temp = 0.001f;
        }
    }
    
    public void apply(final Graph g) {
        this.init(g);
        for (int i = 0; i < 10; ++i) {
            this.step(g);
        }
        this.finish(g);
    }
    
    public void initDummy(final Graph g, final Point p1, final Point p2) {
        for (int i = 0; i < 8; ++i) {
            final DummyNode d = new DummyNode();
            final double t = i / 7.0;
            d.x = (int)((1.0 - t) * p1.x + t * p2.x);
            d.y = (int)((1.0 - t) * p1.y + t * p2.y);
            g.add(d);
        }
    }
    
    public void init(final Graph g) {
        new GreedyCluster().apply(g);
        final int w = this.m_width;
        final int h = this.m_height;
        final int b = this.m_border;
        this.initDummy(g, new Point(b, b), new Point(w - b, b));
        this.initDummy(g, new Point(b, b), new Point(b, h - b));
        this.initDummy(g, new Point(w - b, b), new Point(w - b, h - b));
        this.initDummy(g, new Point(b, h - b), new Point(w - b, h - b));
        final Enumeration e = g.nodes.elements();
        while (e.hasMoreElements()) {
            final Node n = (Node)e.nextElement();
            ForceAttr a = (ForceAttr)n.getAttr(ForceLayout.s_forceIndex);
            if (a == null) {
                a = new ForceAttr();
                if (n instanceof DummyNode) {
                    a.peg = true;
                }
                n.setAttr(ForceLayout.s_forceIndex, a);
            }
        }
    }
    
    public void finish(final Graph g) {
        final Enumeration e = g.nodes.elements();
        while (e.hasMoreElements()) {
            final Node n = (Node)e.nextElement();
            if (n instanceof DummyNode) {
                g.delete(n);
            }
        }
    }
    
    public void paint(final Graphics g) {
        final Enumeration elts = this.m_hash.elements();
        while (elts.hasMoreElements()) {
            final MovementTrail t = (MovementTrail)elts.nextElement();
            final boolean cold = t.prevx != t.prevx2 && t.prevy != t.prevy2;
            g.setColor(this.m_cool);
            g.drawLine((int)t.x, (int)t.y, (int)t.prevx, (int)t.prevy);
            if (cold) {
                g.setColor(this.m_cold);
                g.drawLine((int)t.prevx, (int)t.prevy, (int)t.prevx2, (int)t.prevy2);
            }
            g.setColor(this.m_cool);
            g.fillRect((int)t.prevx - 1, (int)t.prevy - 1, 2, 2);
            if (cold) {
                g.setColor(this.m_cold);
                g.fillRect((int)t.prevx2 - 1, (int)t.prevy2 - 1, 2, 2);
            }
        }
    }
    
    public void step(final Graph g) {
        for (int i = 0; i < g.nodes.size(); ++i) {
            final Node n1 = (Node)g.nodes.elementAt(i);
            final ForceAttr a1 = (ForceAttr)n1.getAttr(ForceLayout.s_forceIndex);
            if (!a1.peg) {
                a1.embX = 0.5;
                a1.embY = 0.5;
                for (int j = 0; j < g.nodes.size(); ++j) {
                    if (i != j) {
                        final Node n2 = (Node)g.nodes.elementAt(j);
                        final ForceAttr a2 = (ForceAttr)n2.getAttr(ForceLayout.s_forceIndex);
                        double dx = n1.x - n2.x;
                        double dy = n1.y - n2.y;
                        if (dx == 0.0 && dy == 0.0) {
                            dy = (dx = 9.999999747378752E-5);
                        }
                        final double mag = Math.sqrt(dx * dx + dy * dy);
                        final double meanMass = 0.5f * (a1.mass + a2.mass);
                        final double f = repel(mag, meanMass);
                        final ForceAttr forceAttr = a1;
                        forceAttr.embX += dx / mag * f;
                        final ForceAttr forceAttr2 = a1;
                        forceAttr2.embY += dy / mag * f;
                    }
                }
            }
        }
        for (int i = 0; i < g.nodes.size(); ++i) {
            final Node n1 = (Node)g.nodes.elementAt(i);
            final ForceAttr a1 = (ForceAttr)n1.getAttr(ForceLayout.s_forceIndex);
            for (int j = 0; j < n1.out.size(); ++j) {
                final Edge e = (Edge)n1.out.elementAt(j);
                final Node n2 = e.head;
                final ForceAttr a2 = (ForceAttr)n2.getAttr(ForceLayout.s_forceIndex);
                final double dx = n1.x - n2.x;
                final double dy = n1.y - n2.y;
                final double mag = Math.sqrt(dx * dx + dy * dy);
                double f;
                if (mag != 0.0) {
                    f = attract(mag, (float)e.weight);
                }
                else {
                    f = 1000.0 * mag * mag;
                }
                if (!a1.peg) {
                    final ForceAttr forceAttr3 = a1;
                    forceAttr3.embX -= dx / mag * f;
                    final ForceAttr forceAttr4 = a1;
                    forceAttr4.embY -= dy / mag * f;
                }
                if (!a2.peg) {
                    final ForceAttr forceAttr5 = a2;
                    forceAttr5.embX += dx / mag * f;
                    final ForceAttr forceAttr6 = a2;
                    forceAttr6.embY += dy / mag * f;
                }
            }
        }
        for (int i = 0; i < g.nodes.size(); ++i) {
            final Node n1 = (Node)g.nodes.elementAt(i);
            final ForceAttr a1 = (ForceAttr)n1.getAttr(ForceLayout.s_forceIndex);
            if (!a1.peg) {
                final double dx = a1.embX - n1.x;
                final double dy = a1.embY - n1.y;
                final double mag = (float)Math.sqrt(dx * dx + dy * dy);
                MovementTrail trail = (MovementTrail)this.m_hash.get((Object)n1);
                if (trail != null) {
                    trail.prevx2 = trail.prevx;
                    trail.prevy2 = trail.prevy;
                    trail.prevx = trail.x;
                    trail.prevy = trail.y;
                }
                else {
                    trail = new MovementTrail();
                }
                if (mag != 0.0) {
                    final double minn = Math.min(mag, (double)(5.0f * this.m_temp));
                    LogFactory.getLog(null).info(new StringBuilder().append("Displacing (").append(dx / mag * minn).append(", ").append(dy / mag * minn).toString());
                    final Node node = n1;
                    node.x += dx / mag * minn;
                    final Node node2 = n1;
                    node2.y += dy / mag * minn;
                }
                n1.x = Math.min(Math.max((double)this.m_border, n1.x), (double)(this.m_width - this.m_border));
                n1.y = Math.min(Math.max((double)this.m_border, n1.y), (double)(this.m_height - this.m_border));
                trail.x = n1.x;
                trail.y = n1.y;
                this.m_hash.put((Object)n1, (Object)trail);
            }
        }
        this.cool();
    }
    
    static {
        ForceLayout.s_forceIndex = AttributeManager.NO_INDEX;
    }
}
