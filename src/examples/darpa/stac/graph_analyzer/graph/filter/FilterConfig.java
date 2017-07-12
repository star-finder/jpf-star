package darpa.stac.graph_analyzer.graph.filter;

import java.awt.*;

public class FilterConfig extends Frame
{
    protected FilterProp[] m_props;
    protected Button m_done;
    protected Button m_cancel;
    
    FilterConfig(final FilterProp[] props) {
        this.m_props = null;
        this.m_done = null;
        this.m_cancel = null;
        this.m_props = props;
        this.setLayout((LayoutManager)new GridLayout(this.m_props.length + 2, 1));
        for (int i = 0; i < this.m_props.length; ++i) {
            this.add((Component)this.m_props[i]);
        }
        this.add((Component)(this.m_done = new Button("Done")));
        this.add((Component)(this.m_cancel = new Button("Cancel")));
    }
    
    public void update() {
        for (int i = 0; i < this.m_props.length; ++i) {
            this.m_props[i].update();
        }
    }
    
    public boolean action(final Event evt, final Object what) {
        if (evt.target == this.m_done) {
            this.update();
            this.hide();
            return true;
        }
        if (evt.target == this.m_cancel) {
            this.hide();
            return true;
        }
        return super.action(evt, what);
    }
}
