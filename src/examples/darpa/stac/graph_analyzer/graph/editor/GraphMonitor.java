package darpa.stac.graph_analyzer.graph.editor;

import darpa.stac.graph_analyzer.graph.*;

public interface GraphMonitor
{
    boolean addNode(final Node p0);
    
    boolean deleteNode(final Node p0);
    
    boolean moveNode(final Node p0, final int p1, final int p2);
    
    boolean selectNode(final Node p0);
    
    boolean deselectNode(final Node p0);
    
    boolean startEdge(final Edge p0, final Node p1);
    
    boolean addEdge(final Edge p0, final Node p1, final Node p2);
    
    boolean deleteEdge(final Edge p0);
    
    boolean selectEdge(final Edge p0);
    
    boolean moveEdge(final Edge p0, final Node p1, final Node p2);
    
    boolean addGraph(final Graph p0);
    
    boolean deleteGraph(final Graph p0);
    
    boolean ungroupGraph(final Graph p0);
    
    boolean selectGraph(final Graph p0);
}
