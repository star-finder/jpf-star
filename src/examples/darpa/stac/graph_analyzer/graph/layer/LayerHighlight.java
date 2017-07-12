package darpa.stac.graph_analyzer.graph.layer;

import darpa.stac.graph_analyzer.graph.filter.*;
import darpa.stac.graph_analyzer.graph.*;
import java.awt.*;

public class LayerHighlight implements Filter
{
    public void apply(final Node n) {
    }
    
    public String getName() {
        return "Layer Highlight";
    }
    
    public Frame buildGUI() {
        return new Frame("Layer Highlight");
    }
    
    public Component buildThumbnail() {
        return null;
    }
}
