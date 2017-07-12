package darpa.stac.graph_analyzer.graph.animation;

import darpa.stac.graph_analyzer.graph.*;

public class FlashAction extends AnimationAction
{
    Node node;
    int num;
    int speed;
    boolean flashOn;
    long prevFlash;
    
    public FlashAction(final Node n, final int num) {
        this.prevFlash = 0L;
        this.init(n, num, -1);
    }
    
    public FlashAction(final Node n, final int num, final int speed) {
        this.prevFlash = 0L;
        this.init(n, num, speed);
    }
    
    void init(final Node n, final int num, final int speed) {
        this.node = n;
        this.num = num;
        this.speed = speed;
        this.flashOn = false;
    }
    
    @Override
    boolean apply() {
        final long cur = System.currentTimeMillis();
        if (cur - this.prevFlash <= this.speed) {
            return false;
        }
        if (this.num == 0) {
            this.node.rep.select(false);
            return true;
        }
        this.prevFlash = cur;
        this.flashOn = !this.flashOn;
        this.node.rep.select(this.flashOn);
        --this.num;
        return false;
    }
}
