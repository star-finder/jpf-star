package darpa.stac.graph_analyzer.graph.animation;

import darpa.stac.graph_analyzer.graph.*;

public class ScaleAction extends AnimationAction
{
    Node node;
    double startW;
    double startH;
    double finishW;
    double finishH;
    boolean center;
    long startTime;
    long finishTime;
    
    ScaleAction(final Node n, final double w, final double h, final int dt) {
        this.center = false;
        this.node = n;
        this.startTime = System.currentTimeMillis();
        this.finishTime = this.startTime + dt;
        this.startW = n.w;
        this.startH = n.h;
        this.finishW = w;
        this.finishH = h;
    }
    
    @Override
    boolean apply() {
        final long currentTime = System.currentTimeMillis();
        if (currentTime >= this.finishTime) {
            this.node.w = this.finishW;
            this.node.h = this.finishH;
            return true;
        }
        final double t = (currentTime - this.startTime) / (this.finishTime - this.startTime);
        this.node.w = this.startW + t * (this.finishW - this.startW);
        this.node.h = this.startH + t * (this.finishH - this.startH);
        return false;
    }
}
