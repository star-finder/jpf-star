package darpa.stac.graph_analyzer.graph.layout;

class MovementTrail
{
    double x;
    double y;
    double prevx;
    double prevy;
    double prevx2;
    double prevy2;
    
    MovementTrail() {
        this.x = -1.0;
        this.y = -1.0;
        this.prevx = -1.0;
        this.prevy = -1.0;
        this.prevx2 = -1.0;
        this.prevy2 = -1.0;
    }
}
