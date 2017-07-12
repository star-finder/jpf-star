package darpa.stac.graph_analyzer.graph.animation;

import darpa.stac.graph_analyzer.graph.*;
import java.awt.*;

public class FadeAction extends AnimationAction
{
    Node node;
    Color startFill;
    Color startBorder;
    Color finishFill;
    Color finishBorder;
    long startTime;
    long finishTime;
    
    FadeAction(final Node n, final Color fill, final Color border, final int dt) {
        this.startFill = null;
        this.startBorder = null;
        this.finishFill = null;
        this.finishBorder = null;
        this.node = n;
        this.startTime = System.currentTimeMillis();
        this.finishTime = this.startTime + dt;
        this.startFill = ((n.rep.fill == null) ? Color.white : n.rep.fill);
        this.startBorder = ((n.rep.border == null) ? Color.white : n.rep.border);
        this.finishFill = fill;
        this.finishBorder = border;
    }
    
    @Override
    boolean apply() {
        final long currentTime = System.currentTimeMillis();
        if (currentTime >= this.finishTime) {
            this.node.rep.fill = this.finishFill;
            this.node.rep.border = this.finishBorder;
            return true;
        }
        final double t = (currentTime - this.startTime) / (this.finishTime - this.startTime);
        final double fr = this.startFill.getRed() + t * (this.finishFill.getRed() - this.startFill.getRed());
        final double fg = this.startFill.getGreen() + t * (this.finishFill.getGreen() - this.startFill.getGreen());
        final double fb = this.startFill.getBlue() + t * (this.finishFill.getBlue() - this.startFill.getBlue());
        this.node.rep.fill = new Color((int)fr, (int)fg, (int)fb);
        final double br = this.startBorder.getRed() + t * (this.finishBorder.getRed() - this.startBorder.getRed());
        final double bg = this.startBorder.getGreen() + t * (this.finishBorder.getGreen() - this.startBorder.getGreen());
        final double bb = this.startBorder.getBlue() + t * (this.finishBorder.getBlue() - this.startBorder.getBlue());
        this.node.rep.border = new Color((int)br, (int)bg, (int)bb);
        return false;
    }
}
