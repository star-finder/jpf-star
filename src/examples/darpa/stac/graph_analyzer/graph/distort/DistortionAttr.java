package darpa.stac.graph_analyzer.graph.distort;

public class DistortionAttr
{
    public int[] prevPos;
    public int prevK;
    
    public DistortionAttr() {
        this.prevPos = new int[2];
        this.prevK = 0;
    }
}
