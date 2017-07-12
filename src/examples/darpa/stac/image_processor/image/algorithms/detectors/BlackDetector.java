package darpa.stac.image_processor.image.algorithms.detectors;

import darpa.stac.image_processor.image.algorithms.*;
import java.awt.image.*;
import darpa.stac.image_processor.image.utilities.*;

public class BlackDetector extends Detector
{
    @Override
    public float detect(final BufferedImage image) {
        final int width = image.getWidth();
        final int height = image.getHeight();
        int count = 0;
        for (int x = 0; x < width; ++x) {
            for (int y = 0; y < height; ++y) {
                final float[] hsva = ARGB.toHSVA(image.getRGB(x, y));
                if (hsva[2] <= 0.05) {
                    ++count;
                }
            }
        }
        return count / (width * height);
    }
}
