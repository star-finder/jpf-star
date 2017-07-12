package darpa.stac.graph_analyzer.graph.distort;

import darpa.stac.graph_analyzer.graph.filter.*;
import darpa.stac.graph_analyzer.graph.*;
import java.awt.*;

class CartesianDistortion implements Filter
{
    public int[] focus;
    public int k;
    public static int s_distortIndex;
    
    public CartesianDistortion() {
        this.focus = new int[2];
        if (CartesianDistortion.s_distortIndex == AttributeManager.NO_INDEX) {
            CartesianDistortion.s_distortIndex = AttributeManager.getIndex("Distortion");
        }
    }
    
    public void apply(final Node n) {
    }
    
    public Frame buildGUI() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public Component buildThumbnail() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    static {
        CartesianDistortion.s_distortIndex = AttributeManager.NO_INDEX;
    }
}
