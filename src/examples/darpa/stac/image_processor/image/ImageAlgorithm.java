package darpa.stac.image_processor.image;

import java.awt.image.*;

public abstract class ImageAlgorithm
{
    public boolean hasValue() {
        return false;
    }
    
    public float getValue() {
        throw new RuntimeException("This image algorithm does not implement values");
    }
    
    public abstract void runAlgorithm(final BufferedImage p0);
}
