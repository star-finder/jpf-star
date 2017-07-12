package darpa.stac.image_processor.image.algorithms;

import darpa.stac.image_processor.image.*;
import java.awt.image.*;

public abstract class Filter extends ImageAlgorithm
{
    @Override
    public void runAlgorithm(final BufferedImage image) {
        this.filter(image);
    }
    
    public abstract void filter(final BufferedImage p0);
}
