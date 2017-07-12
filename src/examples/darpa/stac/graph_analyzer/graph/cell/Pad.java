package darpa.stac.graph_analyzer.graph.cell;

import darpa.stac.graph_analyzer.graph.*;

public class Pad extends Node
{
    Port port;
    
    public Pad() {
        this.port = null;
    }
    
    public Pad(final double x, final double y) {
        super(x, y);
        this.port = null;
    }
    
    public Pad(final double x, final double y, final double w, final double h) {
        super(x, y, w, h);
        this.port = null;
    }
}
