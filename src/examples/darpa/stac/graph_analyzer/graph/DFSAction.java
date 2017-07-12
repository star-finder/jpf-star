package darpa.stac.graph_analyzer.graph;

public class DFSAction implements Action
{
    public FooAction preInit;
    public FooAction postInit;
    public FooAction preStep;
    public FooAction postStep;
    public FooAction preFinish;
    public FooAction postFinish;
    Node m_parent;
    Node m_prev;
    
    public DFSAction() {
        this.preInit = null;
        this.postInit = null;
        this.preStep = null;
        this.postStep = null;
        this.preFinish = null;
        this.postFinish = null;
    }
    
    public void apply(final Graph g) {
        this.init(g);
        while (true) {
            this.step(g);
        }
    }
    
    public void init(final Graph g) {
        if (this.preInit != null) {
            this.preInit.apply(g);
        }
        if (this.postInit != null) {
            this.postInit.apply(g);
        }
    }
    
    public void step(final Graph g) {
        if (this.preStep != null) {
            this.preStep.apply(g);
        }
        if (this.postStep != null) {
            this.postStep.apply(g);
        }
    }
    
    public void finish(final Graph g) {
        if (this.preFinish != null) {
            this.preFinish.apply(g);
        }
        if (this.postFinish != null) {
            this.postFinish.apply(g);
        }
    }
}
