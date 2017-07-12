package darpa.stac.graph_analyzer.graph.filter;

import java.awt.*;

public class FloatProp extends FilterProp
{
    public float val;
    protected TextField m_field;
    
    public FloatProp(final String s) {
        this.val = 0.0f;
        this.m_field = null;
        this.build(s);
    }
    
    public FloatProp(final String s, final float val) {
        this.val = 0.0f;
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
        final Float f = new Float(this.m_field.getText());
        this.val = f;
    }
}
