package darpa.stac.graph_analyzer.graph.rep;

import java.awt.*;

public class EdgeRep extends BaseRep
{
    public static final int STRAIGHT = 0;
    public static final int ROUTED = 1;
    public static final int BEZIER = 2;
    public int type;
    public double[] xroute;
    public double[] yroute;
    public Color color;
    public boolean showArrow;
    public int width;
    protected static final double ARROW_SIZE = 8.0;
    
    public EdgeRep() {
        this.type = 0;
        this.xroute = null;
        this.yroute = null;
        this.color = Color.gray;
        this.showArrow = true;
        this.width = 1;
    }
    
    public void route(final double[] xroute, final double[] yroute) {
        this.type = 1;
        this.xroute = xroute;
        this.yroute = yroute;
    }
    
    @Override
    public void paint(final Graphics g, final double x, final double y) {
    }
    
    @Override
    public void paint(final Graphics g, final double x1, final double y1, final double x2, final double y2) {
        if (this.show) {
            if (this.color != null) {
                g.setColor(this.color);
            }
            switch (this.type) {
                case 1: {
                    double xstart = x1;
                    double ystart = y1;
                    for (int i = 0; i < this.xroute.length; ++i) {
                        this.drawThickLine(g, xstart, ystart, this.xroute[i], this.yroute[i], this.width);
                        xstart = this.xroute[i];
                        ystart = this.yroute[i];
                    }
                    this.drawThickLine(g, xstart, ystart, x2, y2, this.width);
                    break;
                }
                default: {
                    this.drawThickLine(g, x1, y1, x2, y2, this.width);
                    if (this.showArrow) {
                        g.fillPolygon(this.getArrow(x1, y1, x2, y2));
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    void drawThickLine(final Graphics g, final double x1, final double y1, final double x2, final double y2, final int width) {
        for (int i = 0; i < width; ++i) {
            final int startx = (int)(x1 - width / 2 + i);
            final int starty = (int)(y1 - width / 2 + i);
            final int finx = (int)(x2 - width / 2 + i);
            final int finy = (int)(y2 - width / 2 + i);
            g.drawLine(startx, starty, finx, finy);
        }
    }
    
    private Polygon getArrow(final double x1, final double y1, final double x2, final double y2) {
        final double dx = x2 - x1;
        final double dy = y2 - y1;
        final double cx = (x1 + x2) / 2.0;
        final double cy = (y1 + y2) / 2.0;
        final double len = Math.sqrt(dx * dx + dy * dy);
        final double ndx = 8.0 * dx / len;
        final double ndy = 8.0 * dy / len;
        final Polygon poly = new Polygon();
        poly.addPoint((int)(cx + ndx), (int)(cy + ndy));
        poly.addPoint((int)(cx - ndy / 2.0), (int)(cy + ndx / 2.0));
        poly.addPoint((int)(cx + ndy / 2.0), (int)(cy - ndx / 2.0));
        return poly;
    }
}
