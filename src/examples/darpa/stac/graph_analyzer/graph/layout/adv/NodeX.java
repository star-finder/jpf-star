package darpa.stac.graph_analyzer.graph.layout.adv;

public class NodeX
{
    public final String name;
    public final double weight;
    
    public NodeX(final String name, final double weight) {
        this.name = name;
        this.weight = weight;
    }
    
    public String toString() {
        return this.name + " " + this.weight;
    }
}
