package darpa.stac.image_processor.image.algorithms.detectors;

import darpa.stac.image_processor.image.algorithms.*;
import java.awt.image.*;
import darpa.stac.image_processor.image.algorithms.generics.*;

public class EdgingDetector extends Detector
{
    @Override
    public float detect(final BufferedImage image) {
        final BufferedImage cannied = CannyEdgeDetect.detect(image, 125, 220);
        return new WhiteDetector().detect(cannied);
    }
}
