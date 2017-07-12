package darpa.stac.graph_analyzer.graph.layout;

import darpa.stac.graph_analyzer.graph.*;
import java.awt.*;

class DummyNode extends Node
{
    public static int s_forceIndex;
    public Action owner;
    
    public DummyNode() {
        if (DummyNode.s_forceIndex == AttributeManager.NO_INDEX) {
            DummyNode.s_forceIndex = AttributeManager.getIndex("Force");
        }
        this.rep.type = 3;
        this.rep.fill = Color.red;
    }
    
    static {
        DummyNode.s_forceIndex = AttributeManager.NO_INDEX;
    }
}
