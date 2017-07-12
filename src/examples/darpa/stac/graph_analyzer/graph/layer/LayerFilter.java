package darpa.stac.graph_analyzer.graph.layer;

import darpa.stac.graph_analyzer.graph.filter.*;
import darpa.stac.graph_analyzer.graph.*;
import java.awt.*;

public class LayerFilter implements Filter
{
    public static int s_layerIndex;
    
    public LayerFilter() {
        if (LayerFilter.s_layerIndex == AttributeManager.NO_INDEX) {
            LayerFilter.s_layerIndex = AttributeManager.getIndex("Layer");
        }
    }
    
    public void apply(final Node n) {
        final LayerInfo info = (LayerInfo)n.getAttr(LayerFilter.s_layerIndex);
        final boolean show = true;
        n.rep.show = show;
        for (int i = 0; i < n.in.size(); ++i) {
            ((Edge)n.in.elementAt(i)).rep.show = show;
        }
        for (int i = 0; i < n.out.size(); ++i) {
            ((Edge)n.out.elementAt(i)).rep.show = show;
        }
    }
    
    public String getName() {
        return "Layer";
    }
    
    public Component buildThumbnail() {
        return (Component)new Button("Layers");
    }
    
    public Frame buildGUI() {
        return new Frame("Layer Filter");
    }
    
    static {
        LayerFilter.s_layerIndex = AttributeManager.NO_INDEX;
    }
}
