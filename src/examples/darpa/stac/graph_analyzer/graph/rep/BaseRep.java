package darpa.stac.graph_analyzer.graph.rep;

import java.awt.*;

public abstract class BaseRep
{
    public static final int NO_WIDTH = -1;
    public static final int NO_HEIGHT = -1;
    public boolean selected;
    public boolean show;
    
    public BaseRep() {
        this.selected = false;
        this.show = true;
    }
    
    public abstract void paint(final Graphics p0, final double p1, final double p2);
    
    public abstract void paint(final Graphics p0, final double p1, final double p2, final double p3, final double p4);
    
    public void select(final boolean val) {
        this.selected = val;
    }
}
