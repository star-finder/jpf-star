package darpa.stac.graph_analyzer.graph.layout.adv;

public class EdgeX
{
    public final NodeX startNode;
    public final NodeX endNode;
    public final double weight;
    public final double density;
    
    public EdgeX(final NodeX startNode, final NodeX endNode, final double weight) {
        this.startNode = startNode;
        this.endNode = endNode;
        this.weight = weight;
        this.density = weight / (startNode.weight * endNode.weight);
    }
    
    public String toString() {
        return this.startNode.name + "->" + this.endNode.name + " " + this.weight;
    }
}
