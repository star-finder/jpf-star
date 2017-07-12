package darpa.stac.graph_analyzer.graph.layout;

import darpa.stac.graph_analyzer.graph.*;

class LevelInfo
{
    boolean hasDummies;
    double barycenter;
    int level;
    int useage;
    Node metaRoot;
    boolean mark;
    
    LevelInfo() {
        this.hasDummies = false;
        this.level = -1;
        this.useage = 1000;
        this.metaRoot = null;
        this.mark = false;
    }
}
