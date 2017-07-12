package darpa.stac.graph_analyzer.graph.filter;

import darpa.stac.graph_analyzer.graph.*;
import java.awt.*;

public interface Filter
{
    void apply(final Node p0);
    
    Frame buildGUI();
    
    Component buildThumbnail();
    
    String getName();
}
