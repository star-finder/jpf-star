package darpa.stac.graph_analyzer.logging;

public class Log
{
    public boolean isDebugEnabled() {
        return false;
    }
    
    public void debug(final String string) {
    }
    
    public void warn(final String undo_is_not_implemented) {
    }
    
    public void error(final String string) {
    }
    
    public void info(final String string) {
    }
    
    public void warn(final String exception_extracting_bounds_from_descript, final Throwable ex) {
    }
    
    public void error(final String error_while_exporting_Graphics, final Throwable ex) {
    }
    
    public boolean isWarnEnabled() {
        return false;
    }
    
    public void debug(final String string, final Throwable ex) {
    }
    
    public void error(final Throwable ex) {
    }
    
    public boolean isInfoEnabled() {
        return false;
    }
    
    public void debug(final StringBuffer buf) {
    }
}
