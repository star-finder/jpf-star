package darpa.stac.graph_analyzer.graph.cell;

import darpa.stac.graph_analyzer.graph.*;

public class Port extends Node
{
    Pad pad;
    
    public Port() {
        this.pad = null;
    }
    
    public Port(final double x, final double y) {
        super(x, y);
        this.pad = null;
    }
    
    public Port(final double x, final double y, final double w, final double h) {
        super(x, y, w, h);
        this.pad = null;
    }
    
    public Port(final Pad p) {
        super(p.x, p.y, p.w, p.h);
        this.pad = null;
        this.pad = p;
    }
}
