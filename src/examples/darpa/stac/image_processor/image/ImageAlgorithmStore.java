package darpa.stac.image_processor.image;

import java.util.*;
import darpa.stac.image_processor.image.algorithms.detectors.*;
import darpa.stac.image_processor.image.algorithms.filters.*;

public class ImageAlgorithmStore
{
    private static Map<String, ImageAlgorithm> store;
    
    private static void addAlgorithm(final Class<? extends ImageAlgorithm> algo) {
        try {
            ImageAlgorithmStore.store.put(algo.getSimpleName(), algo.newInstance());
        }
        catch (InstantiationException | IllegalAccessException ex2) {
            throw new RuntimeException("Fatal initialization error has occurred");
        }
    }
    
    public static ImageAlgorithm getAlgorithm(final String name) {
        return (ImageAlgorithm)ImageAlgorithmStore.store.get(name);
    }
    
    static {
        ImageAlgorithmStore.store = new HashMap<String, ImageAlgorithm>();
        addAlgorithm(BlackDetector.class);
        addAlgorithm(BlueDetector.class);
        addAlgorithm(EdgingDetector.class);
        addAlgorithm(GreenDetector.class);
        addAlgorithm(RedDetector.class);
        addAlgorithm(WhiteDetector.class);
        addAlgorithm(Intensify.class);
        addAlgorithm(Invert.class);
    }
}
