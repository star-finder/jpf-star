package darpa.stac.graph_analyzer.graph.filter;

import java.awt.*;

public class ColorProp extends FilterProp
{
    public Color val;
    
    public ColorProp(final String title) {
        this.val = new Color(0);
        this.build(title);
    }
    
    public ColorProp(final String title, final Color val) {
        this.val = new Color(0);
        this.val = val;
        this.build(title);
    }
    
    protected void build(final String s) {
        this.setLayout((LayoutManager)new FlowLayout());
        final Label lbl = new Label(s);
        this.add((Component)lbl);
    }
    
    @Override
    public void update() {
    }
    
    @Override
    public void reset() {
    }
}
