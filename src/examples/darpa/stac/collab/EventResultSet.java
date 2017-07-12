package darpa.stac.collab;

import java.util.*;

public class EventResultSet
{
    List<Integer> events;
    long base;
    long min;
    long max;
    
    public EventResultSet(final long base, final long min, final long max) {
        this.base = base;
        this.min = min;
        this.max = max;
        this.events = new ArrayList<Integer>();
    }
    
    public EventResultSet(final List<Integer> eventids) {
        this.events = eventids;
    }
    
    private void sort() {
        Collections.sort(this.events);
    }
    
    public List<Integer> get() {
        this.sort();
        return this.events;
    }
    
    public void add(final long base, final long key, final long min, final long max) {
        if (key >= min && key <= max) {
            final long v = key - base;
            this.events.add((int)v);
        }
    }
    
    public void add(final long mKey) {
        this.add(this.base, mKey, this.min, this.max);
    }
}
