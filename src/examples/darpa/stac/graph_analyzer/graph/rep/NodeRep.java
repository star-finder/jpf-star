package darpa.stac.graph_analyzer.graph.rep;

import java.awt.*;
import java.awt.image.*;

public class NodeRep extends BaseRep implements Cloneable
{
    public static final int RECTANGLE = 0;
    public static final int THREED_RECT = 1;
    public static final int ROUND_RECT = 2;
    public static final int OVAL = 3;
    public static final int IMAGE = 4;
    public int type;
    public int selType;
    public int corner;
    public Color fill;
    public Color border;
    public Image image;
    public Color selFill;
    public Color selBorder;
    public Image selImage;
    
    public NodeRep() {
        this.type = 0;
        this.selType = 0;
        this.corner = 5;
        this.fill = Color.orange;
        this.border = Color.blue;
        this.image = null;
        this.selFill = Color.red;
        this.selBorder = Color.blue;
        this.selImage = null;
    }
    
    @Override
    public void paint(final Graphics g, final double x, final double y) {
        switch (this.type) {
            case 4: {
                if (this.image != null) {
                    g.drawImage(this.image, (int)x, (int)y, (ImageObserver)null);
                    break;
                }
                break;
            }
            default: {
                this.paint(g, x, y, 6.0, 6.0);
                break;
            }
        }
    }
    
    public Object clone() {
        final NodeRep rep = new NodeRep();
        rep.type = this.type;
        rep.selType = this.selType;
        rep.corner = this.corner;
        rep.fill = this.fill;
        rep.border = this.border;
        rep.image = this.image;
        rep.selImage = this.selImage;
        rep.selFill = this.selFill;
        rep.selBorder = this.selBorder;
        rep.selected = this.selected;
        return rep;
    }
    
    @Override
    public void paint(final Graphics g, final double x1, final double y1, final double w1, final double h1) {
        final int x2 = (int)x1;
        final int y2 = (int)y1;
        final int w2 = (int)w1;
        final int h2 = (int)h1;
        final int t = this.selected ? this.selType : this.type;
        final Color fc = this.selected ? this.selFill : this.fill;
        final Color bc = this.selected ? this.selBorder : this.border;
        final Image img = this.selected ? this.selImage : this.image;
        if (this.show) {
            if (fc != null) {
                g.setColor(fc);
                switch (t) {
                    case 1: {
                        g.fill3DRect(x2, y2, w2, h2, true);
                    }
                    case 2: {
                        g.fillRoundRect(x2, y2, w2, h2, this.corner, this.corner);
                        break;
                    }
                    case 3: {
                        g.fillOval(x2, y2, w2, h2);
                        break;
                    }
                    case 4: {
                        if (img != null) {
                            g.drawImage(img, x2, y2, w2, h2, (ImageObserver)null);
                            break;
                        }
                        break;
                    }
                    default: {
                        g.fillRect(x2, y2, w2, h2);
                        break;
                    }
                }
            }
            if (bc != null) {
                g.setColor(bc);
                switch (t) {
                    case 1: {
                        g.draw3DRect(x2, y2, w2, h2, true);
                    }
                    case 2: {
                        g.drawRoundRect(x2, y2, w2, h2, this.corner, this.corner);
                        break;
                    }
                    case 3: {
                        g.drawOval(x2, y2, w2, h2);
                        break;
                    }
                    case 4: {
                        break;
                    }
                    default: {
                        g.drawRect(x2, y2, w2, h2);
                        break;
                    }
                }
            }
        }
    }
}
