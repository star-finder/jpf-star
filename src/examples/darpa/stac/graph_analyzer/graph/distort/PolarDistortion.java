package darpa.stac.graph_analyzer.graph.distort;

import darpa.stac.graph_analyzer.graph.filter.*;
import darpa.stac.graph_analyzer.graph.*;
import java.awt.*;

public class PolarDistortion implements Filter
{
    public int[] focus;
    public int k;
    public static int s_distortIndex;
    
    public PolarDistortion() {
        this.focus = new int[2];
        if (PolarDistortion.s_distortIndex == AttributeManager.NO_INDEX) {
            PolarDistortion.s_distortIndex = AttributeManager.getIndex("Distortion");
        }
    }
    
    public void init(final Graph g) {
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
        PolarDistortion.s_distortIndex = AttributeManager.NO_INDEX;
    }
}
