package darpa.stac.graph_analyzer.graph.dot;

import java.util.*;
import java.awt.*;

public class DotInfo
{
    public Hashtable props;
    int x;
    int y;
    int w;
    int h;
    Color color;
    boolean firstTime;
    
    public DotInfo() {
        this.props = null;
        this.x = 0;
        this.y = 0;
        this.w = 0;
        this.h = 0;
        this.firstTime = true;
    }
}
