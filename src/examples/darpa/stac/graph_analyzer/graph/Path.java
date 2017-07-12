package darpa.stac.graph_analyzer.graph;

import java.util.*;

public class Path
{
    public Vector<Node> path;
    
    Path() {
        this.path = new Vector<Node>();
    }
    
    Path(final int size) {
        this.path = new Vector<Node>(size);
    }
    
    Path(final int size, final int incr) {
        this.path = new Vector<Node>(size, incr);
    }
    
    public void insert(final Node n, final int index) {
        this.path.insertElementAt(n, index);
    }
    
    public void push(final Node n) {
        this.path.addElement(n);
    }
    
    public Node pop() {
        final Node n = this.path.lastElement();
        this.path.removeElementAt(this.path.lastIndexOf(n));
        return n;
    }
    
    public boolean valid() throws GraphException {
        if (this.path.size() == 0) {
            return true;
        }
        final Enumeration<Node> e = this.path.elements();
        Node prevNode = e.nextElement();
        while (e.hasMoreElements()) {
            final Node curNode = e.nextElement();
            if (!this.checkConnection(prevNode, curNode)) {
                return false;
            }
            prevNode = curNode;
        }
        return true;
    }
    
    boolean checkConnection(final Node n1, final Node n2) throws GraphException {
        if (n1 instanceof Graph) {
            final Graph g1 = (Graph)n1;
            if (g1.nodes.contains(n1)) {
                return true;
            }
        }
        if (!n1.parent.equals(n2.parent)) {
            final String err = "Path: nodes (" + n1.name + ", " + n2.name + ") do not share the same parent graph!";
            throw new GraphException(err);
        }
        Enumeration<Edge> e = n1.out.elements();
        while (e.hasMoreElements()) {
            final Edge edge = (Edge)e.nextElement();
            if (edge.head == n2) {
                return true;
            }
        }
        if (!n1.parent.directed) {
            e = n1.in.elements();
            while (e.hasMoreElements()) {
                final Edge edge = (Edge)e.nextElement();
                if (edge.tail == n2) {
                    return true;
                }
            }
        }
        return false;
    }
}
