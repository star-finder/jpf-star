package darpa.stac.image_processor.image.utilities;

import java.awt.image.*;
import javax.swing.*;
import java.awt.*;

public class ShowImage extends JFrame
{
    public ShowImage(final String name, final BufferedImage im) {
        this(name, im, true);
    }
    
    public ShowImage(final String name, final BufferedImage im, final boolean vis) {
        this.setTitle(name);
        this.setSize(im.getWidth(), im.getHeight());
        this.setDefaultCloseOperation(3);
        final JLabel lbl = new JLabel((Icon)new ImageIcon((Image)im));
        final JPanel jPanel = new JPanel();
        jPanel.add((Component)lbl);
        this.add((Component)jPanel);
        this.setVisible(vis);
    }
}
