package darpa.stac.image_processor.image.algorithms.generics;

import java.awt.color.*;
import darpa.stac.image_processor.image.utilities.*;
import java.awt.image.*;
import java.awt.*;

public class ConvertImage
{
    public static BufferedImage grayscale(final BufferedImage image) {
        return new ColorConvertOp(ColorSpace.getInstance(1003), (RenderingHints)null).filter(image, (BufferedImage)null);
    }
    
    public static BufferedImage boostedGray(final BufferedImage image) {
        final BufferedImage out = new BufferedImage(image.getWidth(), image.getHeight(), 2);
        for (int i = 0; i < image.getWidth(); ++i) {
            for (int j = 0; j < image.getHeight(); ++j) {
                final int argb = image.getRGB(i, j);
                final int a = ARGB.rawA(argb);
                final int r = ARGB.rawR(argb);
                final int g = ARGB.rawG(argb);
                final int b = ARGB.rawB(argb);
                final int val = (r + r + r + b + g + g + g + g) / 8;
                out.setRGB(i, j, ARGB.toARGB(a, val, val, val));
            }
        }
        return out;
    }
    
    public static BufferedImage otherGray(final BufferedImage image) {
        final BufferedImage out = new BufferedImage(image.getWidth(), image.getHeight(), 10);
        final Graphics g = out.getGraphics();
        g.drawImage((Image)image, 0, 0, (ImageObserver)null);
        return out;
    }
}
