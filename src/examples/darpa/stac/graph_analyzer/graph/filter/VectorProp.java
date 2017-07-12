package darpa.stac.graph_analyzer.graph.filter;

import java.awt.*;

public class VectorProp extends FilterProp
{
    public double[] val;
    
    public VectorProp() {
        this.val = new double[3];
    }
    
    public Component getGUI() {
        final Button b = new Button("VectorProp");
        b.setBackground(Color.blue);
        return (Component)b;
    }
    
    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void reset() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
