package darpa.stac.graph_analyzer.graph.filter;

import java.awt.*;

public class BooleanProp extends FilterProp
{
    public boolean val;
    protected Checkbox m_box;
    
    public BooleanProp(final String s) {
        this.val = false;
        this.m_box = null;
        this.build(s);
    }
    
    public BooleanProp(final String s, final boolean val) {
        this.val = false;
        this.m_box = null;
        this.val = val;
        this.build(s);
    }
    
    protected void build(final String s) {
        this.setLayout((LayoutManager)new FlowLayout());
        this.add((Component)(this.m_box = new Checkbox(s)));
        this.reset();
    }
    
    @Override
    public void reset() {
        this.m_box.setState(this.val);
    }
    
    @Override
    public void update() {
        this.val = this.m_box.getState();
    }
}
