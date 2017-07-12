package darpa.stac.graph_analyzer.graph.filter;

import java.awt.*;

public class StringProp extends FilterProp
{
    public String val;
    protected TextField m_field;
    
    public StringProp(final String title, final String val) {
        this.val = new String("");
        this.m_field = null;
        this.val = val;
        this.build(title);
    }
    
    public StringProp(final String title) {
        this.val = new String("");
        this.m_field = null;
        this.build(title);
    }
    
    protected void build(final String s) {
        this.setLayout((LayoutManager)new FlowLayout());
        final Label lbl = new Label(s);
        this.add((Component)lbl);
        this.add((Component)(this.m_field = new TextField()));
        this.reset();
    }
    
    @Override
    public void reset() {
        this.m_field.setText(String.valueOf((Object)this.val));
    }
    
    @Override
    public void update() {
        this.val = this.m_field.getText();
    }
}
