package darpa.stac.image_processor.learning;

import java.util.*;

public class VectorMap extends HashMap<Vector, String>
{
    public String get(final Vector key) {
        return (String)super.get((Object)key);
    }
    
    public boolean containsKey(final Vector key) {
        return super.containsKey((Object)key);
    }
    
    public String remove(final Vector key) {
        return (String)super.remove((Object)key);
    }
    
    public boolean containsValue(final Vector value) {
        return super.containsValue((Object)value);
    }
}
