package darpa.stac.graph_analyzer.graph.cluster;

import java.awt.*;
import darpa.stac.graph_analyzer.logging.*;
import darpa.stac.graph_analyzer.graph.layout.*;
import java.util.*;
import darpa.stac.graph_analyzer.graph.*;

public class GreedyCluster implements Action
{
    public static final Color[] testColors;
    static Random s_rand;
    public float m_thresh;
    
    public GreedyCluster() {
        this.m_thresh = 0.0f;
    }
    
    public GreedyCluster(final float thresh) {
        this.m_thresh = 0.0f;
        this.m_thresh = thresh;
    }
    
    public void apply(final Graph g) {
        this.step(g);
    }
    
    public void init(final Graph g) {
    }
    
    public void finish(final Graph g) {
    }
    
    public void step(final Graph g) {
        LogFactory.getLog(null).info("clustering!");
        final Vector dest = new Vector();
        final Vector src = (Vector)g.nodes.clone();
        while (src.size() > 0) {
            final int randIndex = (int)(GreedyCluster.s_rand.nextFloat() * src.size());
            final Node n = (Node)src.elementAt(randIndex);
            Graph maxSub = null;
            float maxGain = this.m_thresh;
            final Enumeration e = dest.elements();
            while (e.hasMoreElements()) {
                final Graph sub = (Graph)e.nextElement();
                final float gain;
                if ((gain = this.calcGain(n, sub)) > maxGain) {
                    maxGain = gain;
                    maxSub = sub;
                }
            }
            if (maxSub != null) {
                src.removeElement((Object)n);
                maxSub.add(n);
            }
            else {
                src.removeElement((Object)n);
                final Graph sub2 = new Graph();
                sub2.name = "group";
                sub2.parent = g;
                sub2.nodes.addElement(n);
                dest.addElement((Object)sub2);
            }
        }
        int i = 0;
        final Enumeration e2 = dest.elements();
        while (e2.hasMoreElements()) {
            final Graph sub3 = (Graph)e2.nextElement();
            this.colorChildren(sub3, GreedyCluster.testColors[i++]);
            new FrameLayout(2).apply(sub3);
            sub3.rep.fill = null;
            sub3.explode = true;
        }
        g.nodes = (Vector<Node>)dest;
        LogFactory.getLog(null).info("done!");
    }
    
    void colorChildren(final Graph g, final Color c) {
        final Enumeration e = g.nodes.elements();
        while (e.hasMoreElements()) {
            final Node n = (Node)e.nextElement();
            if (!(n instanceof Graph)) {
                n.rep.fill = c;
            }
        }
    }
    
    float calcGain(final Node n, final Graph g) {
        int gain = 0;
        Enumeration e = n.out.elements();
        while (e.hasMoreElements()) {
            final Edge edge = (Edge)e.nextElement();
            if (g.nodes.contains((Object)edge.head)) {
                gain += (int)edge.weight;
            }
        }
        e = n.in.elements();
        while (e.hasMoreElements()) {
            final Edge edge = (Edge)e.nextElement();
            if (g.nodes.contains((Object)edge.tail)) {
                gain += (int)edge.weight;
            }
        }
        return gain;
    }
    
    static {
        testColors = new Color[] { Color.yellow, Color.red, Color.orange, Color.blue, Color.green, Color.magenta };
        GreedyCluster.s_rand = new Random(System.currentTimeMillis());
    }
}
