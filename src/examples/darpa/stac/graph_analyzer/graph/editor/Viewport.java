package darpa.stac.graph_analyzer.graph.editor;

import java.awt.*;
import darpa.stac.graph_analyzer.graph.*;

class Viewport
{
    double x;
    double y;
    double w;
    double h;
    
    Viewport() {
        this.x = 0.0;
        this.y = 0.0;
        this.w = 100.0;
        this.h = 100.0;
    }
    
    void paint(final Graphics g, final Graph graph, final int cw, final int ch) {
    }
}
