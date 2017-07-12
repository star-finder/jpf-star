package darpa.stac.graph_analyzer.graph.filter;

import java.util.*;
import java.awt.*;

public class FilterPalette extends Frame
{
    private static final int WIDTH = 150;
    private static final int HEIGHT = 300;
    Button m_done;
    Button m_cancel;
    java.awt.List m_list;
    Vector m_filters;
    FilterBank m_bank;
    
    public FilterPalette() {
        this.m_done = new Button("Done");
        this.m_cancel = new Button("Cancel");
        this.m_list = new java.awt.List();
        this.m_filters = new Vector();
        this.m_bank = null;
        this.setLayout((LayoutManager)new GridLayout(3, 1));
        this.add((Component)this.m_list);
        this.add((Component)this.m_done);
        this.add((Component)this.m_cancel);
    }
    
    public void show() {
        this.resize(150, 300);
        super.show();
    }
    
    public void add(final Filter f) {
        this.m_filters.addElement((Object)f);
        this.m_list.addItem(f.getName());
    }
    
    public void setBank(final FilterBank bank) {
        this.m_bank = bank;
    }
    
    public boolean action(final Event evt, final Object what) {
        if (evt.target == this.m_done) {
            final int[] indices = this.m_list.getSelectedIndexes();
            for (int i = 0; i < indices.length; ++i) {
                final Filter f = (Filter)this.m_filters.elementAt(indices[i]);
                this.m_bank.add(f);
            }
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
