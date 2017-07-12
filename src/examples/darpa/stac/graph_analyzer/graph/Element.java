package darpa.stac.graph_analyzer.graph;

public abstract class Element
{
    public static final int MAX_ATTR = 3;
    public Object[] attrs;
    
    public Element() {
        this.attrs = null;
    }
    
    public Object getAttr(final int i) {
        if (this.attrs == null) {
            this.attrs = new Object[3];
        }
        return this.attrs[i];
    }
    
    public void setAttr(final int i, final Object attr) {
        if (this.attrs == null) {
            this.attrs = new Object[3];
        }
        this.attrs[i] = attr;
    }
}
