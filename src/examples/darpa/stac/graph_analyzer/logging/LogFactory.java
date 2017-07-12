package darpa.stac.graph_analyzer.logging;

public class LogFactory
{
    public static Log log;
    
    public static Log getLog(final Class cl) {
        if (LogFactory.log == null) {
            LogFactory.log = new Log();
        }
        return LogFactory.log;
    }
    
    static {
        LogFactory.log = null;
    }
}
