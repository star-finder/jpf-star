package darpa.stac.graph_analyzer.graph.filter;

import java.awt.*;

public class IntProp extends FilterProp
{
    public int val;
    protected TextField m_field;
    
    public IntProp(final String s) {
        this.val = 0;
        this.m_field = null;
        this.build(s);
    }
    
    public IntProp(final String s, final int val) {
        this.val = 0;
        this.m_field = null;
        this.val = val;
        this.build(s);
    }
    
    protected void build(final String s) {
        this.setLayout((LayoutManager)new FlowLayout());
        final Label lbl = new Label(s);
        this.add((Component)lbl);
        this.m_field = new TextField();
        this.reset();
    }
    
    @Override
    public void reset() {
        this.m_field.setText(String.valueOf(this.val));
    }
    
    @Override
    public void update() {
        final Integer i = new Integer(this.m_field.getText());
        this.val = i;
    }
}
