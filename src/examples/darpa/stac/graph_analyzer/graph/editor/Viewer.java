package darpa.stac.graph_analyzer.graph.editor;

import java.awt.*;
import darpa.stac.graph_analyzer.graph.*;
import java.awt.image.*;
import java.util.*;

public class Viewer extends Canvas
{
    public static int HEIGHT;
    public static int WIDTH;
    public static final int BORDER = 50;
    public Action action;
    public Graph graph;
    public Map<String, Graph> graphs;
    public Vector painters;
    Image m_offImg;
    
    public Viewer() {
        this.action = null;
        this.graph = null;
        this.graphs = null;
        this.painters = new Vector();
        this.m_offImg = null;
    }
    
    public Viewer(final int w, final int h) {
        this.action = null;
        this.graph = null;
        this.graphs = null;
        this.painters = new Vector();
        this.m_offImg = null;
        Viewer.WIDTH = w;
        Viewer.HEIGHT = h;
    }
    
    public void update(final Graphics g) {
        this.paint(g);
    }
    
    public Dimension preferredSize() {
        return new Dimension(Viewer.WIDTH, Viewer.HEIGHT);
    }
    
    public boolean keyDown(final Event evt, final int key) {
        switch (key) {
            case 10: {
                if (this.action != null) {
                    this.action.apply(this.graph);
                    this.repaint();
                    return true;
                }
                return super.keyDown(evt, key);
            }
            default: {
                return super.keyDown(evt, key);
            }
        }
    }
    
    protected void viewerPaint(final Graphics g) {
    }
    
    public void paint(final Graphics g) {
        if (this.m_offImg == null) {
            this.m_offImg = this.createImage(Viewer.WIDTH, Viewer.HEIGHT);
        }
        final Graphics offg = this.m_offImg.getGraphics();
        super.paint(offg);
        this.graph.paint(offg);
        this.viewerPaint(offg);
        final Enumeration e = this.painters.elements();
        while (e.hasMoreElements()) {
            final Painter p = (Painter)e.nextElement();
            p.paint(offg);
        }
        g.drawImage(this.m_offImg, 0, 0, (ImageObserver)this);
    }
    
    static {
        Viewer.HEIGHT = 600;
        Viewer.WIDTH = Viewer.HEIGHT;
    }
}
