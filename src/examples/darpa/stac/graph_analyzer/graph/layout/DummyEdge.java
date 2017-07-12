package darpa.stac.graph_analyzer.graph.layout;

import darpa.stac.graph_analyzer.graph.*;
import java.awt.*;

class DummyEdge extends Edge
{
    public static int s_forceIndex;
    public Action owner;
    
    public DummyEdge() {
        if (DummyEdge.s_forceIndex == AttributeManager.NO_INDEX) {
            DummyEdge.s_forceIndex = AttributeManager.getIndex("Force");
        }
        final ForceAttr fa = new ForceAttr();
        fa.peg = true;
        this.setAttr(DummyEdge.s_forceIndex, fa);
    }
    
    @Override
    public void paint(final Graphics g) {
    }
    
    static {
        DummyEdge.s_forceIndex = AttributeManager.NO_INDEX;
    }
}
