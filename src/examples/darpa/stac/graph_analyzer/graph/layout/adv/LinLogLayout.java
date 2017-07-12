package darpa.stac.graph_analyzer.graph.layout.adv;

import darpa.stac.graph_analyzer.graph.*;
import java.io.*;
import darpa.stac.graph_analyzer.logging.*;
import java.util.*;

public class LinLogLayout
{
    private static Map<String, Map<String, Double>> readGraph(final String filename) {
        final Map<String, Map<String, Double>> result = (Map<String, Map<String, Double>>)new HashMap();
        try {
            final BufferedReader file = new BufferedReader((Reader)new FileReader(filename));
            String line;
            while ((line = file.readLine()) != null) {
                final StringTokenizer st = new StringTokenizer(line);
                if (!st.hasMoreTokens()) {
                    continue;
                }
                final String source = st.nextToken();
                final String target = st.nextToken();
                final double weight = st.hasMoreTokens() ? Double.parseDouble(st.nextToken()) : 1.0;
                if (result.get((Object)source) == null) {
                    result.put(source, new HashMap());
                }
                ((Map)result.get((Object)source)).put((Object)target, (Object)weight);
            }
            file.close();
        }
        catch (IOException e) {
            System.err.println("Exception while reading the graph:");
            System.err.println((Object)e);
            System.exit(1);
        }
        return result;
    }
    
    private static Map<String, Map<String, Double>> makeSymmetricGraph(final Map<String, Map<String, Double>> graph) {
        final Map<String, Map<String, Double>> result = (Map<String, Map<String, Double>>)new HashMap();
        for (final String source : graph.keySet()) {
            for (final String target : ((Map<String, Double>)graph.get(source)).keySet()) {
                final double weight = (double)((Map)graph.get((Object)source)).get((Object)target);
                double revWeight = 0.0;
                if (graph.get((Object)target) != null && ((Map)graph.get((Object)target)).get((Object)source) != null) {
                    revWeight = (double)((Map)graph.get((Object)target)).get((Object)source);
                }
                if (result.get((Object)source) == null) {
                    result.put(source, new HashMap());
                }
                ((Map)result.get((Object)source)).put((Object)target, (Object)(weight + revWeight));
                if (result.get((Object)target) == null) {
                    result.put(target, new HashMap());
                }
                ((Map)result.get((Object)target)).put((Object)source, (Object)(weight + revWeight));
            }
        }
        return result;
    }
    
    private static Map<String, Node> makeNodes(final Map<String, Map<String, Double>> graph) {
        final Map<String, Node> result = (Map<String, Node>)new HashMap();
        for (final String nodeName : graph.keySet()) {
            double nodeWeight = 0.0;
            for (final Double edgeWeight : ((Map<String, Double>)graph.get(nodeName)).values()) {
                nodeWeight += edgeWeight;
            }
            result.put(nodeName, new Node(nodeName, nodeWeight));
        }
        return result;
    }
    
    private static List<Edge> makeEdges(final Map<String, Map<String, Double>> graph, final Map<String, Node> nameToNode) {
        final List<Edge> result = (List<Edge>)new ArrayList();
        for (final String sourceName : graph.keySet()) {
            for (final String targetName : ((Map<String, Double>)graph.get((Object)sourceName)).keySet()) {
                final Node sourceNode = (Node)nameToNode.get((Object)sourceName);
                final Node targetNode = (Node)nameToNode.get((Object)targetName);
                final double weight = (double)((Map)graph.get((Object)sourceName)).get((Object)targetName);
                result.add(new Edge(sourceNode, targetNode, weight));
            }
        }
        return result;
    }
    
    public static Map<Node, double[]> makeInitialPositions(final List<Node> nodes, final boolean is3d) {
        final Map<Node, double[]> result = (Map<Node, double[]>)new HashMap();
        for (final Node node : nodes) {
            final double[] position = { Math.random() - 0.5, Math.random() - 0.5, is3d ? (Math.random() - 0.5) : 0.0 };
            result.put(node, position);
        }
        return result;
    }
    
    private static void writePositions(final Map<Node, double[]> nodeToPosition, final Map<Node, Integer> nodeToCluster, final String filename) {
        try {
            final BufferedWriter file = new BufferedWriter((Writer)new FileWriter(filename));
            for (final Node node : nodeToPosition.keySet()) {
                final double[] position = (double[])nodeToPosition.get((Object)node);
                final int cluster = (int)nodeToCluster.get((Object)node);
                file.write(node.name + " " + position[0] + " " + position[1] + " " + position[2] + " " + cluster);
                file.write("\n");
            }
            file.close();
        }
        catch (IOException e) {
            System.err.println("Exception while writing the graph:");
            System.err.println((Object)e);
            System.exit(1);
        }
    }
    
    public static void main(final String[] args) {
        if (args.length != 3 || (!args[0].equals("2") && !args[0].equals("3"))) {
            LogFactory.getLog(null).info("Usage: java LinLogLayout <dim> <inputfile> <outputfile>\nComputes a <dim>-dimensional layout and a clustering for the graph\nin <inputfile>, writes the layout and the clustering into <outputfile>,\nand displays (the first 2 dimensions of) the layout and the clustering.\n<dim> must be 2 or 3.\n\nInput file format:\nEach line represents an edge and has the format:\n<source> <target> <nonnegative real weight>\nThe weight is optional, the default value is 1.0.\n\nOutput file format:\n<node> <x-coordinate> <y-coordinate> <z-coordinate (0.0 for 2D)> <cluster>");
            System.exit(0);
        }
        Map<String, Map<String, Double>> graph = readGraph(args[1]);
        graph = makeSymmetricGraph(graph);
        final Map<String, Node> nameToNode = makeNodes(graph);
        final List<Node> nodes = (List<Node>)new ArrayList(nameToNode.values());
        final List<Edge> edges = makeEdges(graph, nameToNode);
        final Map<Node, double[]> nodeToPosition = makeInitialPositions(nodes, args[0].equals("3"));
        new MinimizerBarnesHut((Collection<Node>)nodes, (Collection<Edge>)edges, 0.0, 1.0, 0.05).minimizeEnergy(nodeToPosition, 100);
        final Map<Node, Integer> nodeToCluster = new OptimizerModularity().execute(nodes, edges, false);
        writePositions(nodeToPosition, nodeToCluster, args[2]);
        new GraphFrame(nodeToPosition, nodeToCluster).setVisible(true);
    }
}
