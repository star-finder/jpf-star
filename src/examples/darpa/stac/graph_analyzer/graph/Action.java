package darpa.stac.graph_analyzer.graph;

public interface Action
{
    void apply(final Graph p0);
    
    void init(final Graph p0);
    
    void step(final Graph p0);
    
    void finish(final Graph p0);
}
