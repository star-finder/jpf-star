package darpa.stac.graph_analyzer.graph.rep;

import java.awt.*;

public class LabelRep extends BaseRep
{
    public Color color;
    public Font font;
    public String label;
    
    public LabelRep() {
        this.color = Color.black;
        this.font = new Font("Helvetica", 1, 10);
        this.label = null;
    }
    
    @Override
    public void paint(final Graphics g, final double x, final double y) {
        if (this.show) {
            g.setFont(this.font);
            if (this.color != null) {
                g.setColor(this.color);
            }
            if (this.label != null) {
                g.drawString(this.label, (int)x, (int)y);
            }
        }
    }
    
    @Override
    public void paint(final Graphics g, final double x, final double y, final double w, final double h) {
        this.paint(g, x, y);
    }
}
