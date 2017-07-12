package darpa.stac.graph_analyzer.graph.editor;

import java.util.*;
import darpa.stac.graph_analyzer.graph.*;
import darpa.stac.graph_analyzer.logging.*;
import java.awt.*;

public class Editor extends Viewer
{
    public static final int SELECT_MODE = 0;
    public static final int MOVE_MODE = 1;
    public static final int NODE_MODE = 2;
    public static final int EDGE_MODE = 3;
    public static final int DELETE_MODE = 4;
    public static final int UNGROUP_MODE = 5;
    public static final int NUM_MODES = 6;
    Node m_move;
    Node m_tail;
    Node m_head;
    double m_moveStartX;
    double m_moveStartY;
    Node m_possibleHead;
    Edge m_edge;
    int m_nodeCount;
    int m_edgeCount;
    Color m_selColor;
    Node m_primeSel;
    Vector m_sel;
    boolean m_lblNodes;
    boolean m_lblEdges;
    int m_startSelX;
    int m_startSelY;
    Rectangle m_selRect;
    boolean m_inSel;
    protected GraphMonitor m_monitor;
    public int m_mode;
    private boolean m_busy;
    
    public Editor(final GraphMonitor monitor, final int w, final int h) {
        super(w, h);
        this.m_move = null;
        this.m_tail = null;
        this.m_head = null;
        this.m_moveStartX = 0.0;
        this.m_moveStartY = 0.0;
        this.m_possibleHead = null;
        this.m_edge = null;
        this.m_nodeCount = 0;
        this.m_edgeCount = 0;
        this.m_selColor = Color.black;
        this.m_primeSel = null;
        this.m_sel = new Vector();
        this.m_lblNodes = true;
        this.m_lblEdges = false;
        this.m_selRect = new Rectangle();
        this.m_inSel = false;
        this.m_mode = 1;
        this.m_busy = false;
        this.m_monitor = monitor;
    }
    
    public Editor(final GraphMonitor monitor) {
        this.m_move = null;
        this.m_tail = null;
        this.m_head = null;
        this.m_moveStartX = 0.0;
        this.m_moveStartY = 0.0;
        this.m_possibleHead = null;
        this.m_edge = null;
        this.m_nodeCount = 0;
        this.m_edgeCount = 0;
        this.m_selColor = Color.black;
        this.m_primeSel = null;
        this.m_sel = new Vector();
        this.m_lblNodes = true;
        this.m_lblEdges = false;
        this.m_selRect = new Rectangle();
        this.m_inSel = false;
        this.m_mode = 1;
        this.m_busy = false;
        this.m_monitor = monitor;
    }
    
    public boolean setMode(final int mode) {
        if (!this.m_busy && mode >= 0 && mode <= 6) {
            this.m_mode = mode;
            return true;
        }
        return false;
    }
    
    public void clearSelection() {
        if (!this.m_busy) {
            final Enumeration e = this.m_sel.elements();
            while (e.hasMoreElements()) {
                final Node n = (Node)e.nextElement();
                n.rep.select(false);
            }
            this.m_sel.removeAllElements();
        }
    }
    
    protected synchronized Node pick(final int x, final int y) {
        for (int i = this.graph.nodes.size(); i > 0; --i) {
            final Node n = (Node)this.graph.nodes.elementAt(i - 1);
            if (n.rep != null && n.rep.show && x >= n.x && y >= n.y && x < n.x + n.w && y < n.y + n.h) {
                return n;
            }
        }
        return null;
    }
    
    protected synchronized Node pick(final int x, final int y, final double tol) {
        Node bestNode = null;
        double bestDistance = Double.MAX_VALUE;
        for (int i = this.graph.nodes.size(); i > 0; --i) {
            final Node n = (Node)this.graph.nodes.elementAt(i - 1);
            final double centerX = n.x + n.w / 2.0;
            final double centerY = n.y + n.h / 2.0;
            final double sqdist = (centerX - x) * (centerX - x) + (centerY - y) * (centerY - y);
            if (sqdist < bestDistance && sqdist <= tol) {
                bestDistance = sqdist;
                bestNode = n;
            }
        }
        return bestNode;
    }
    
    protected synchronized void startNode(final int x, final int y) {
        this.clearSelection();
        this.m_busy = true;
        final Node n = new Node();
        n.x = x;
        n.y = y;
        if (this.m_monitor == null || this.m_monitor.addNode(n)) {
            n.name = new StringBuilder().append("Node_").append(this.m_nodeCount++).toString();
            if (this.m_lblNodes) {
                n.lbl.label = n.name;
            }
            this.graph.nodes.addElement(n);
            this.m_move = n;
            this.m_moveStartX = x;
            this.m_moveStartY = y;
            n.rep.select(true);
            this.repaint();
        }
        else {
            this.m_busy = false;
        }
    }
    
    synchronized boolean ungroup(final int x, final int y) {
        final Node n = this.pick(x, y);
        if (n != null && n instanceof Graph) {
            final Graph g = (Graph)n;
            if (this.m_monitor == null || this.m_monitor.ungroupGraph(g)) {
                final Enumeration e = g.nodes.elements();
                while (e.hasMoreElements()) {
                    final Node child = (Node)e.nextElement();
                    g.parent.add(child);
                    LogFactory.getLog(null).info("Promoting " + child.name);
                }
                this.graph.delete(g);
                this.repaint();
                return true;
            }
        }
        return false;
    }
    
    synchronized boolean delete(final int x, final int y) {
        final Node n = this.pick(x, y);
        if (n != null && (this.m_monitor == null || this.m_monitor.deleteNode(n))) {
            this.graph.delete(n);
            this.repaint();
            return true;
        }
        return false;
    }
    
    synchronized boolean startMove(final int x, final int y) {
        this.clearSelection();
        final Node n = this.pick(x, y);
        if (n != null) {
            this.m_move = n;
            this.m_moveStartX = this.m_move.x;
            this.m_moveStartY = this.m_move.y;
            n.rep.select(true);
            this.repaint();
            return true;
        }
        return false;
    }
    
    synchronized boolean dragMove(final int x, final int y) {
        if (this.m_move != null) {
            this.m_move.x = x;
            this.m_move.y = y;
            this.repaint();
            return true;
        }
        return false;
    }
    
    synchronized boolean finishMove(final int x, final int y) {
        if (this.m_move != null) {
            if (this.m_monitor == null || this.m_monitor.moveNode(this.m_move, x, y)) {
                this.m_move.x = x;
                this.m_move.y = y;
            }
            else {
                this.m_move.x = this.m_moveStartX;
                this.m_move.y = this.m_moveStartY;
            }
            this.m_move.rep.select(false);
            this.m_move = null;
            this.m_busy = false;
            this.repaint();
            return true;
        }
        return false;
    }
    
    synchronized boolean startEdge(final int x, final int y) {
        this.clearSelection();
        final Node n = this.pick(x, y);
        if (n != null && (this.m_monitor == null || this.m_monitor.startEdge(this.m_edge, n))) {
            this.m_tail = n;
            this.m_tail.rep.select(true);
            this.m_head = new Node();
            this.m_head.name = "Dummy";
            this.m_head.rep = null;
            this.m_head.lbl = null;
            this.m_head.x = x;
            this.m_head.y = y;
            try {
                this.m_edge = this.m_tail.attach(this.m_head);
            }
            catch (Exception e) {
                LogFactory.getLog(null).info(e.toString());
                System.exit(0);
            }
            return true;
        }
        return false;
    }
    
    synchronized boolean dragEdge(final int x, final int y) {
        if (this.m_tail != null && this.m_head != null) {
            final Node n = this.pick(x, y);
            if (n != null) {
                if (!n.equals((Object)this.m_possibleHead)) {
                    if (this.m_possibleHead != null) {
                        this.m_possibleHead.rep.select(false);
                    }
                    this.m_possibleHead = n;
                    this.m_possibleHead.rep.select(true);
                }
            }
            else {
                if (this.m_possibleHead != null && this.m_possibleHead != this.m_tail) {
                    this.m_possibleHead.rep.select(false);
                }
                this.m_possibleHead = null;
            }
            this.m_head.x = x;
            this.m_head.y = y;
            this.repaint();
            return true;
        }
        return false;
    }
    
    synchronized boolean finishEdge(final int x, final int y) {
        if (this.m_tail != null && this.m_head != null) {
            final Node n = this.pick(x, y);
            if (n != null && n != this.m_tail && (this.m_monitor == null || this.m_monitor.addEdge(this.m_edge, this.m_tail, n))) {
                this.m_edge.name = new StringBuilder().append("Edge_").append(this.m_edgeCount++).toString();
                if (this.m_lblEdges) {
                    this.m_edge.lbl.label = this.m_edge.name;
                }
                this.m_edge.head = n;
                n.in.addElement(this.m_edge);
            }
            else {
                this.m_edge.detach();
            }
            if (this.m_possibleHead != null) {
                this.m_possibleHead.rep.select(false);
            }
            this.m_tail.rep.select(false);
            final Node head = null;
            this.m_possibleHead = head;
            this.m_tail = head;
            this.m_head = head;
            this.m_edge = null;
            this.m_busy = false;
            this.repaint();
            return true;
        }
        return false;
    }
    
    void updateSel(final int x, final int y) {
        this.m_selRect.x = Math.min(this.m_startSelX, x);
        this.m_selRect.y = Math.min(this.m_startSelY, y);
        this.m_selRect.width = Math.abs(this.m_startSelX - x);
        this.m_selRect.height = Math.abs(this.m_startSelY - y);
    }
    
    void pickSel() {
        this.clearSelection();
        final Rectangle bounds = new Rectangle();
        final Enumeration e = this.graph.nodes.elements();
        while (e.hasMoreElements()) {
            final Node n = (Node)e.nextElement();
            bounds.x = (int)n.x;
            bounds.y = (int)n.y;
            bounds.width = (int)n.w;
            bounds.height = (int)n.h;
            if (this.m_selRect.intersects(bounds) && n.rep != null && n.rep.show) {
                n.rep.select(true);
                this.m_sel.addElement((Object)n);
            }
        }
    }
    
    @Override
    protected void viewerPaint(final Graphics g) {
        if (this.m_inSel) {
            g.setColor(this.m_selColor);
            g.drawRect(this.m_selRect.x, this.m_selRect.y, this.m_selRect.width, this.m_selRect.height);
        }
    }
    
    public boolean mouseDown(final Event evt, final int x, final int y) {
        switch (this.m_mode) {
            case 4: {
                if (this.delete(x, y)) {
                    return true;
                }
                break;
            }
            case 5: {
                if (this.ungroup(x, y)) {
                    return true;
                }
                break;
            }
            case 1: {
                if (this.startMove(x, y)) {
                    return true;
                }
                break;
            }
            case 2: {
                this.startNode(x, y);
                return true;
            }
            case 3: {
                if (this.startEdge(x, y)) {
                    return true;
                }
                break;
            }
        }
        if (this.m_mode == 1) {
            this.m_inSel = true;
            this.updateSel(this.m_startSelX = x, this.m_startSelY = y);
            this.repaint();
            return true;
        }
        return super.mouseDown(evt, x, y);
    }
    
    public boolean mouseDrag(final Event evt, final int x, final int y) {
        switch (this.m_mode) {
            case 1: {
                if (this.dragMove(x, y)) {
                    return true;
                }
                break;
            }
            case 2: {
                return !this.dragMove(x, y) || true;
            }
            case 3: {
                if (this.dragEdge(x, y)) {
                    return true;
                }
                break;
            }
        }
        if (this.m_inSel) {
            this.updateSel(x, y);
            this.repaint();
            return true;
        }
        return super.mouseDrag(evt, x, y);
    }
    
    public boolean mouseUp(final Event evt, final int x, final int y) {
        switch (this.m_mode) {
            case 1: {
                if (this.finishMove(x, y)) {
                    return true;
                }
                break;
            }
            case 2: {
                return !this.finishMove(x, y) || true;
            }
            case 3: {
                if (this.finishEdge(x, y)) {
                    return true;
                }
                break;
            }
        }
        if (this.m_inSel) {
            this.updateSel(x, y);
            this.pickSel();
            this.repaint();
            this.m_inSel = false;
            return true;
        }
        return super.mouseUp(evt, x, y);
    }
    
    @Override
    public boolean keyDown(final Event evt, final int key) {
        if (!this.m_busy) {
            switch (key) {
                case 110: {
                    this.m_mode = 2;
                    return true;
                }
                case 101: {
                    this.m_mode = 3;
                    return true;
                }
                case 109: {
                    this.m_mode = 1;
                    return true;
                }
                case 115: {
                    this.m_mode = 0;
                    return true;
                }
                case 100: {
                    this.m_mode = 4;
                    return true;
                }
                case 99: {
                    this.graph.check();
                    return true;
                }
                case 127: {
                    final Enumeration e = this.m_sel.elements();
                    while (e.hasMoreElements()) {
                        final Node n = (Node)e.nextElement();
                        this.graph.delete(n);
                    }
                    this.repaint();
                    return true;
                }
            }
        }
        return super.keyDown(evt, key);
    }
}
