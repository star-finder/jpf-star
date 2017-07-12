package darpa.stac.graph_analyzer.graph.editor;

import darpa.stac.graph_analyzer.graph.*;

public class EditorMonitor implements GraphMonitor
{
    public boolean addNode(final Node n) {
        return true;
    }
    
    public boolean deleteNode(final Node n) {
        return true;
    }
    
    public boolean moveNode(final Node n, final int x, final int y) {
        return true;
    }
    
    public boolean selectNode(final Node n) {
        return true;
    }
    
    public boolean deselectNode(final Node n) {
        return true;
    }
    
    public boolean startEdge(final Edge e, final Node tail) {
        return true;
    }
    
    public boolean addEdge(final Edge e, final Node tail, final Node head) {
        return true;
    }
    
    public boolean deleteEdge(final Edge e) {
        return true;
    }
    
    public boolean selectEdge(final Edge e) {
        return true;
    }
    
    public boolean moveEdge(final Edge e, final Node from, final Node to) {
        return true;
    }
    
    public boolean addGraph(final Graph g) {
        return true;
    }
    
    public boolean deleteGraph(final Graph g) {
        return true;
    }
    
    public boolean ungroupGraph(final Graph g) {
        return true;
    }
    
    public boolean selectGraph(final Graph g) {
        return true;
    }
}
