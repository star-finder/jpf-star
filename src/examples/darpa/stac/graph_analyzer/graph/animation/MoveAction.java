package darpa.stac.graph_analyzer.graph.animation;

import darpa.stac.graph_analyzer.graph.*;

public class MoveAction extends AnimationAction
{
    Node node;
    double startX;
    double startY;
    double finishX;
    double finishY;
    long startTime;
    long finishTime;
    
    public MoveAction(final Node n, final double x, final double y, final int dt) {
        this.node = n;
        this.startTime = System.currentTimeMillis();
        this.finishTime = this.startTime + dt;
        this.startX = n.x;
        this.startY = n.y;
        this.finishX = x;
        this.finishY = y;
    }
    
    @Override
    boolean apply() {
        final long currentTime = System.currentTimeMillis();
        if (currentTime >= this.finishTime) {
            this.node.x = this.finishX;
            this.node.y = this.finishY;
            return true;
        }
        final double t = (currentTime - this.startTime) / (this.finishTime - this.startTime);
        this.node.x = this.startX + t * (this.finishX - this.startX);
        this.node.y = this.startY + t * (this.finishY - this.startY);
        return false;
    }
}
