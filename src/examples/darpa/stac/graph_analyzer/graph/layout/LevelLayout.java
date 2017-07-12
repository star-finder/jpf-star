package darpa.stac.graph_analyzer.graph.layout;

import java.util.Enumeration;
import java.util.Vector;

//import darpa.stac.graph_analyzer.logging.*;

import darpa.stac.graph_analyzer.graph.Action;
import darpa.stac.graph_analyzer.graph.AttributeManager;
import darpa.stac.graph_analyzer.graph.Edge;
import darpa.stac.graph_analyzer.graph.Graph;
import darpa.stac.graph_analyzer.graph.Node;
import darpa.stac.graph_analyzer.logging.LogFactory;

public class LevelLayout implements Action
{
    double m_l;
    int m_maxLevel;
    Vector[] m_levels;
    public static int s_levelIndex;
    private final int xmarginSize = 10;
    
    public void apply(final Graph g) {
        this.init(g);
        this.makeLevels(g);
        this.placeNodes();
    }
    
    public void step(final Graph g) {
    }
    
    public void finish(final Graph g) {
    }
    
    public LevelLayout() {
        this.m_l = 500.0;
        this.m_maxLevel = -1;
        this.m_levels = null;
        if (LevelLayout.s_levelIndex == AttributeManager.NO_INDEX) {
            LevelLayout.s_levelIndex = AttributeManager.getIndex("Level");
        }
    }
    
    public void init(final Graph g) {
        this.addLevelAttrs(g);
        this.preprocess(g);
        this.addDummies(g);
    }
    
    void addLevelAttrs(final Graph g) {
        LevelInfo linfo = (LevelInfo)g.getAttr(LevelLayout.s_levelIndex);
        if (linfo == null) {
            linfo = new LevelInfo();
            g.setAttr(LevelLayout.s_levelIndex, linfo);
        }
        final Enumeration e = g.nodes.elements();
        while (e.hasMoreElements()) {
            final Node n = (Node)e.nextElement();
            LevelInfo inf = (LevelInfo)n.getAttr(LevelLayout.s_levelIndex);
            if (inf == null) {
                inf = new LevelInfo();
                n.setAttr(LevelLayout.s_levelIndex, inf);
            }
        }
    }
    
    void initialOrderNodes(final Node n) {
        this.setMark(n, true);
        final Enumeration ins = n.in.elements();
        while (ins.hasMoreElements()) {
            final Edge e = (Edge)ins.nextElement();
            if (!this.getMark(e.tail)) {
                this.initialOrderNodes(e.tail);
            }
        }
        this.m_levels[this.getLevel(n)].addElement((Object)n);
    }
    
    void addDummies(final Graph g) {
        final LevelInfo linfo = (LevelInfo)g.getAttr(LevelLayout.s_levelIndex);
        if (linfo.hasDummies) {
            return;
        }
        linfo.hasDummies = true;
        final Enumeration nodes = g.nodes.elements();
        while (nodes.hasMoreElements()) {
            final Node to = (Node)nodes.nextElement();
            if (to instanceof DummyNode) {
                continue;
            }
            final LevelInfo nlinfo = (LevelInfo)to.getAttr(LevelLayout.s_levelIndex);
            final Enumeration in = to.in.elements();
            while (in.hasMoreElements()) {
                Edge e = (Edge)in.nextElement();
                if (e.tail instanceof DummyNode) {
                    continue;
                }
                while (this.getLevel(to) > this.getLevel(e.tail) + 1) {
                    final Node dummy = new DummyNode();
                    final LevelInfo dumInfo = new LevelInfo();
                    dumInfo.level = this.getLevel(e.tail) + 1;
                    dummy.setAttr(LevelLayout.s_levelIndex, dumInfo);
                    g.add(dummy);
                    e.swapHead(dummy);
                    try {
                        e = dummy.attach(to);
                    }
                    catch (Exception ex) {
                        LogFactory.getLog(null).info(ex.toString());
                        System.exit(0);
                    }
                }
            }
        }
    }
    
    void makeLevels(final Graph g) {
        this.m_maxLevel = -1;
        Node maxNode = null;
        Enumeration e = g.nodes.elements();
        while (e.hasMoreElements()) {
            final Node n = (Node)e.nextElement();
            final int level;
            if ((level = this.getLevel(n)) > this.m_maxLevel) {
                this.m_maxLevel = level;
                maxNode = n;
            }
        }
        this.m_levels = new Vector[this.m_maxLevel + 1];
        for (int i = 0; i < this.m_maxLevel + 1; ++i) {
            this.m_levels[i] = new Vector();
        }
        this.markAll(g, false);
        this.initialOrderNodes(maxNode);
        e = g.nodes.elements();
        while (e.hasMoreElements()) {
            final Node n = (Node)e.nextElement();
            if (!this.getMark(n)) {
                this.initialOrderNodes(n);
            }
        }
    }
    
    void placeLevel(final double l, final double y, final Vector nodes) {
        final double xstep = l / (nodes.size() + 1);
        int i = 0;
        final Enumeration e = nodes.elements();
        while (e.hasMoreElements()) {
            final Node n = (Node)e.nextElement();
            n.x = xstep * ++i;
            n.y = y;
        }
    }
    
    void placeNodes() {
        final double ystep = this.m_l / (this.m_maxLevel + 1);
        double y = 0.0;
        for (int i = 0; i <= this.m_maxLevel; ++i) {
            final Vector nodes = this.m_levels[i];
            this.placeLevel(this.m_l, y, nodes);
            y += ystep;
        }
    }
    
    protected final void sortLevel(final Vector nodes) {
        for (int len = nodes.size(), i = 1; i < len; ++i) {
            final Node n1 = (Node)nodes.elementAt(i);
            final double barycent = this.barycenter(n1);
            int j;
            for (j = i; j > 0; --j) {
                final Node n2 = (Node)nodes.elementAt(j - 1);
                if (barycent >= this.barycenter(n2)) {
                    break;
                }
                nodes.setElementAt((Object)n2, j);
            }
            nodes.setElementAt((Object)n1, j);
        }
    }
    
    protected final void orderLevel(final Vector nodes, final double l, final double y, final boolean doin, final boolean doout) {
        final int levelcnt = nodes.size();
        final Enumeration e = nodes.elements();
        while (e.hasMoreElements()) {
            final Node n = (Node)e.nextElement();
            this.computeBarycenter(n, doin, doout);
        }
        this.sortLevel(nodes);
        this.placeLevel(l, y, nodes);
    }
    
    protected final synchronized void orderNodes(final double l, final int op) {
        final boolean doup = (op & 0x1) == 0x1;
        final boolean doin = op > 5 || !doup;
        final boolean doout = op > 5 || doup;
        final double ystep = (this.m_maxLevel > 0) ? (this.m_l / this.m_maxLevel) : 0.0;
        if (doup) {
            double y = 0.0;
            for (int i = 0; i <= this.m_maxLevel; ++i) {
                final Vector nodes = this.m_levels[i];
                this.orderLevel(nodes, l, y, doin, doout);
                y += ystep;
            }
        }
        else {
            double y = l;
            for (int i = this.m_maxLevel; i >= 0; --i) {
                final Vector nodes = this.m_levels[i];
                this.orderLevel(nodes, l, y, doin, doout);
                y -= ystep;
            }
        }
    }
    
    protected final void straightenDummy(final Node n) {
        final Node tail = ((Edge)n.in.firstElement()).tail;
        final Node head = ((Edge)n.in.firstElement()).head;
        final double avg = (n.x + tail.x + head.x) / 3.0;
        n.x = avg;
    }
    
    protected final synchronized void straightenLayout(final double l) {
        final double ystep = l / (this.m_maxLevel + 1);
        double y = 0.0;
        for (int i = 0; i <= this.m_maxLevel; ++i) {
            final Vector nodes = this.m_levels[i];
            final Enumeration e = nodes.elements();
            while (e.hasMoreElements()) {
                final Node n = (Node)e.nextElement();
                if (n instanceof DummyNode) {
                    this.straightenDummy(n);
                }
            }
            for (int j = 1; j < nodes.size(); ++j) {
                final Node n = (Node)nodes.elementAt(j);
                final Node prev = (Node)nodes.elementAt(j - 1);
                final double prevright = prev.x + prev.w / 2.0 + 10.0;
                final double thisleft = n.x - n.w / 2.0 - 10.0;
                final double overlap = prevright - thisleft;
                if (overlap > 0.0) {
                    prev.x -= overlap / 2.0;
                    n.x += overlap / 2.0;
                }
                n.y = y;
            }
            y += ystep;
        }
    }
    
    void computeBarycenter(final Node n, final boolean doin, final boolean doout) {
        double insum = 0.0;
        int insize = 0;
        int outsize = 0;
        if (doin) {
            insize = n.in.size();
            final Enumeration e = n.in.elements();
            while (e.hasMoreElements()) {
                insum += ((Edge)e.nextElement()).tail.x;
            }
            if (insize == 0) {
                insize = 1;
                insum = n.x;
            }
        }
        double outsum = 0.0;
        if (doout) {
            outsize = n.out.size();
            final Enumeration e2 = n.out.elements();
            while (e2.hasMoreElements()) {
                outsum += ((Edge)e2.nextElement()).head.x;
            }
            if (outsize == 0) {
                outsize = 1;
                outsum = n.x;
            }
        }
        double barycenter;
        if (doin && doout) {
            barycenter = (insum + outsum) / (insize + outsize);
        }
        else if (doin) {
            barycenter = insum / insize;
        }
        else if (doout) {
            barycenter = outsum / outsize;
        }
        else {
            barycenter = n.x;
        }
        final LevelInfo info = (LevelInfo)n.getAttr(LevelLayout.s_levelIndex);
        info.barycenter = barycenter;
    }
    
    double barycenter(final Node n) {
        final LevelInfo info = (LevelInfo)n.getAttr(LevelLayout.s_levelIndex);
        return info.barycenter;
    }
    
    void markAll(final Graph g, final boolean val) {
        this.setMark(g, val);
        final Enumeration e = g.nodes.elements();
        while (e.hasMoreElements()) {
            this.setMark((Node)e.nextElement(), false);
        }
    }
    
    void setMark(final Node n, final boolean val) {
        final LevelInfo linfo = (LevelInfo)n.getAttr(LevelLayout.s_levelIndex);
        linfo.mark = val;
    }
    
    boolean getMark(final Node n) {
        final LevelInfo linfo = (LevelInfo)n.getAttr(LevelLayout.s_levelIndex);
        return linfo.mark;
    }
    
    int getLevel(final Node n) {
        final LevelInfo inf = (LevelInfo)n.getAttr(LevelLayout.s_levelIndex);
        return inf.level;
    }
    
    void setLevel(final Node n, final int l) {
        final LevelInfo inf = (LevelInfo)n.getAttr(LevelLayout.s_levelIndex);
        inf.level = l;
    }
    
    int getUseage(final Node n) {
        final LevelInfo inf = (LevelInfo)n.getAttr(LevelLayout.s_levelIndex);
        return inf.useage;
    }
    
    void setUseage(final Node n, final int val) {
        final LevelInfo inf = (LevelInfo)n.getAttr(LevelLayout.s_levelIndex);
        inf.useage = val;
    }
    
    void preprocess(final Graph g) {
        this.markAll(g, false);
        final Node meta = this.makeMeta(g);
        final Vector topo = new Vector();
        this.topoSort(meta, topo);
        this.removeMeta(g);
        int maxlevel = 0;
        int level = 0;
        Enumeration e = topo.elements();
        while (e.hasMoreElements()) {
            final Node n1 = (Node)e.nextElement();
            final Enumeration ins = n1.in.elements();
            while (ins.hasMoreElements()) {
                final Node n2 = ((Edge)ins.nextElement()).tail;
                if (this.getLevel(n2) > level) {
                    level = this.getLevel(n2);
                }
            }
            this.setLevel(n1, level + 1);
            if (level + 1 > maxlevel) {
                maxlevel = level + 1;
            }
        }
        for (int i = topo.size() - 1; i >= 0; --i) {
            final Node n1 = (Node)topo.elementAt(i);
            int minUseage = maxlevel;
            final int outedgecnt = n1.out.size();
            if (n1.out.size() == 0) {
                minUseage = this.getLevel(n1);
            }
            final Enumeration e2 = n1.out.elements();
            while (e2.hasMoreElements()) {
                final Node n3 = ((Edge)e2.nextElement()).tail;
                if (this.getUseage(n3) - 1 < minUseage) {
                    minUseage = this.getUseage(n3) - 1;
                }
            }
            this.setUseage(n1, minUseage);
        }
        e = topo.elements();
        while (e.hasMoreElements()) {
            final Node n4 = (Node)e.nextElement();
            this.setLevel(n4, this.getUseage(n4));
        }
    }
    
    void topoSort(final Node n, final Vector topo) {
        this.setMark(n, true);
        final Enumeration e = n.in.elements();
        while (e.hasMoreElements()) {
            final Node n2 = ((Edge)e.nextElement()).tail;
            if (!this.getMark(n2)) {
                this.topoSort(n2, topo);
            }
        }
        topo.addElement((Object)n);
    }
    
    Node makeMeta(final Graph g) {
        final Node meta = new Node();
        meta.name = "meta";
        meta.setAttr(LevelLayout.s_levelIndex, new LevelInfo());
        final LevelInfo inf = (LevelInfo)g.getAttr(LevelLayout.s_levelIndex);
        inf.metaRoot = meta;
        final Enumeration e = g.nodes.elements();
        while (e.hasMoreElements()) {
            final Node n2 = (Node)e.nextElement();
            try {
                n2.attach(meta);
            }
            catch (Exception ex) {
                LogFactory.getLog(null).info(ex.toString());
                System.exit(0);
            }
        }
        g.nodes.addElement(meta);
        return meta;
    }
    
    void removeMeta(final Graph g) {
        final LevelInfo inf = (LevelInfo)g.getAttr(LevelLayout.s_levelIndex);
        g.delete(inf.metaRoot);
        inf.metaRoot = null;
    }
    
    static {
        LevelLayout.s_levelIndex = AttributeManager.NO_INDEX;
    }
}
