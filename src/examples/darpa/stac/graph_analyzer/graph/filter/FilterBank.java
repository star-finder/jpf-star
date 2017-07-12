package darpa.stac.graph_analyzer.graph.filter;

import darpa.stac.graph_analyzer.graph.*;
import java.util.*;
import java.awt.*;

public class FilterBank extends Panel
{
    public static final int MAX_FILTERS = 10;
    Button m_add;
    Button m_delete;
    Panel m_filterButtons;
    int m_numFilters;
    Filter[] m_filters;
    Button[] m_buttons;
    FilterPalette m_palette;
    GridBagLayout m_buttonLayout;
    GridBagConstraints m_buttonConstraints;
    static FilterBank s_this;
    Graph m_graph;
    
    public static FilterBank createFilterBank(final Graph g) {
        if (FilterBank.s_this == null) {
            return FilterBank.s_this = new FilterBank(g);
        }
        return null;
    }
    
    public static FilterBank getFilterBank() {
        return FilterBank.s_this;
    }
    
    public void setGraph(final Graph g) {
        this.m_graph = g;
        update();
    }
    
    public Graph getGraph() {
        return this.m_graph;
    }
    
    public static void update() {
        if (FilterBank.s_this.m_graph != null) {
            FilterBank.s_this.apply(FilterBank.s_this.m_graph);
        }
    }
    
    public void apply(final Graph g) {
        final Enumeration e = g.nodes.elements();
        while (e.hasMoreElements()) {
            final Node n = (Node)e.nextElement();
            this.applySingle(n);
            if (n instanceof Graph) {
                final Graph sub = (Graph)n;
                this.apply(sub);
            }
        }
    }
    
    public void applySingle(final Node n) {
        for (int i = 0; i < this.m_numFilters; ++i) {
            final Filter f = this.m_filters[i];
            f.apply(n);
        }
    }
    
    private FilterBank(final Graph g) {
        this.m_add = new Button("Add");
        this.m_delete = new Button("Delete");
        this.m_filterButtons = new Panel();
        this.m_numFilters = 0;
        this.m_filters = new Filter[10];
        this.m_buttons = new Button[10];
        this.m_graph = null;
        this.m_graph = g;
        final GridBagLayout gb = new GridBagLayout();
        final GridBagConstraints gc = new GridBagConstraints();
        this.setLayout((LayoutManager)gb);
        gc.anchor = 17;
        gb.setConstraints((Component)this.m_add, gc);
        this.add((Component)this.m_add);
        gb.setConstraints((Component)this.m_add, gc);
        this.add((Component)this.m_delete);
        gc.gridwidth = 0;
        gc.fill = 1;
        gc.weightx = 1.0;
        gb.setConstraints((Component)this.m_filterButtons, gc);
        this.m_buttonLayout = new GridBagLayout();
        this.m_buttonConstraints = new GridBagConstraints();
        this.m_buttonConstraints.insets = new Insets(3, 3, 3, 0);
        this.m_buttonConstraints.weightx = 1.0;
        this.m_buttonConstraints.anchor = 17;
        this.m_filterButtons.setLayout((LayoutManager)this.m_buttonLayout);
        this.m_filterButtons.setBackground(Color.yellow);
        this.add((Component)this.m_filterButtons);
        this.setBackground(Color.cyan);
    }
    
    void add(final Filter f) {
        if (this.m_numFilters < 9) {
            this.m_filters[this.m_numFilters] = f;
            final Button b = new Button(f.getName());
            this.m_buttons[this.m_numFilters] = b;
            this.m_buttonLayout.setConstraints((Component)b, this.m_buttonConstraints);
            this.m_filterButtons.add((Component)b);
            this.repaint();
            this.resize(this.size());
            ++this.m_numFilters;
        }
    }
    
    public void setPalette(final FilterPalette palette) {
        this.m_palette = palette;
    }
    
    void delete() {
    }
    
    public Dimension minimumSize() {
        return new Dimension(20, 300);
    }
    
    public boolean action(final Event evt, final Object what) {
        if (evt.target == this.m_add) {
            this.m_palette.show();
            return true;
        }
        return evt.target == this.m_delete || super.action(evt, what);
    }
    
    static {
        FilterBank.s_this = null;
    }
}
