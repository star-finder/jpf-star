package darpa.stac.graph_analyzer.graph.layout.adv;

import darpa.stac.graph_analyzer.graph.*;
import darpa.stac.graph_analyzer.logging.*;
import java.util.*;

public class OptimizerModularity
{
    private double quality(final double interAtedges, final double interAtpairs, final double atedges, final double atpairs) {
        return interAtedges / atedges - interAtpairs / atpairs;
    }
    
    private void refine(final Map<Node, Integer> nodeToCluster, final Map<Node, List<Edge>> nodeToEdges, final double atedges, final double atpairs) {
        int maxCluster = 0;
        for (final int cluster : nodeToCluster.values()) {
            maxCluster = Math.max(maxCluster, cluster);
        }
        final double[] clusterToAtnodes = new double[nodeToCluster.keySet().size() + 1];
        for (final Node node : nodeToCluster.keySet()) {
            final double[] array = clusterToAtnodes;
            final int intValue = (int)nodeToCluster.get(node);
            array[intValue] += node.weight;
        }
        double interAtedges = 0.0;
        for (final List<Edge> edges : nodeToEdges.values()) {
            for (final Edge edge : edges) {
                if (!((Integer)nodeToCluster.get(edge.head)).equals(nodeToCluster.get(edge.tail))) {
                    interAtedges += edge.weight;
                }
            }
        }
        double interAtpairs = 0.0;
        for (final Node node2 : nodeToCluster.keySet()) {
            interAtpairs += node2.weight;
        }
        interAtpairs *= interAtpairs;
        for (final double clusterAtnodes : clusterToAtnodes) {
            interAtpairs -= clusterAtnodes * clusterAtnodes;
        }
        double prevQuality = Double.MAX_VALUE;
        double quality = this.quality(interAtedges, interAtpairs, atedges, atpairs);
        LogFactory.getLog(null).info(new StringBuilder().append("Refining ").append(nodeToCluster.keySet().size()).append(" nodes, initial modularity ").append(-quality).toString());
        while (quality < prevQuality) {
            prevQuality = quality;
            for (final Node node3 : nodeToCluster.keySet()) {
                int bestCluster = 0;
                double bestQuality = quality;
                double bestInterAtedges = interAtedges;
                double bestInterAtpairs = interAtpairs;
                final double[] clusterToAtedges = new double[nodeToCluster.keySet().size() + 1];
                for (final Edge edge2 : nodeToEdges.get(node3)) {
                    if (!edge2.tail.equals(node3)) {
                        final double[] array2 = clusterToAtedges;
                        final int intValue2 = (int)nodeToCluster.get(edge2.tail);
                        array2[intValue2] += 2.0 * edge2.weight;
                    }
                }
                final int cluster2 = (int)nodeToCluster.get(node3);
                for (int newCluster = 0; newCluster <= maxCluster + 1; ++newCluster) {
                    if (cluster2 != newCluster) {
                        final double newInterPairs = interAtpairs + clusterToAtnodes[cluster2] * clusterToAtnodes[cluster2] - (clusterToAtnodes[cluster2] - node3.weight) * (clusterToAtnodes[cluster2] - node3.weight) + clusterToAtnodes[newCluster] * clusterToAtnodes[newCluster] - (clusterToAtnodes[newCluster] + node3.weight) * (clusterToAtnodes[newCluster] + node3.weight);
                        final double newInterEdges = interAtedges + clusterToAtedges[cluster2] - clusterToAtedges[newCluster];
                        final double newQuality = this.quality(newInterEdges, newInterPairs, atedges, atpairs);
                        if (bestQuality - newQuality > 1.0E-8) {
                            bestCluster = newCluster;
                            bestQuality = newQuality;
                            bestInterAtedges = newInterEdges;
                            bestInterAtpairs = newInterPairs;
                        }
                    }
                }
                if (bestQuality < quality) {
                    final double[] array3 = clusterToAtnodes;
                    final int n = cluster2;
                    array3[n] -= node3.weight;
                    final double[] array4 = clusterToAtnodes;
                    final int n2 = bestCluster;
                    array4[n2] += node3.weight;
                    nodeToCluster.put(node3, bestCluster);
                    maxCluster = Math.max(maxCluster, bestCluster);
                    quality = bestQuality;
                    interAtedges = bestInterAtedges;
                    interAtpairs = bestInterAtpairs;
                    LogFactory.getLog(null).info(new StringBuilder().append(" Moving ").append(node3).append(" to ").append(bestCluster).append(", ").append("new modularity ").append(-quality).toString());
                }
            }
        }
    }
    
    private Map<Node, Integer> cluster(final Collection<Node> nodes, final List<Edge> edges, final double atedges, final double atpairs) {
        LogFactory.getLog(null).info(new StringBuilder().append("Contracting ").append(nodes.size()).append(" nodes, ").append(edges.size()).append(" edges").toString());
        Collections.sort(edges, new Comparator<Edge>() {
            public int compare(final Edge e1, final Edge e2) {
                e1.getClass();
                final double n = 0.0;
                e2.getClass();
                if (n == 0.0) {
                    return 0;
                }
                e1.getClass();
                final double n2 = 0.0;
                e2.getClass();
                return (n2 < 0.0) ? 1 : -1;
            }
        });
        final Map<Node, Node> nodeToContr = (Map<Node, Node>)new HashMap();
        final List<Node> contrNodes = (List<Node>)new ArrayList();
        for (final Edge edge : edges) {
            edge.getClass();
            if (0.0 < atedges / atpairs) {
                break;
            }
            if (edge.head.equals(edge.tail)) {
                continue;
            }
            if (nodeToContr.containsKey(edge.head)) {
                continue;
            }
            if (nodeToContr.containsKey(edge.tail)) {
                continue;
            }
            LogFactory.getLog(null).info(new StringBuilder().append(" Contracting ").append(edge).toString());
            final Node contrNode = new Node(edge.head.name + " " + edge.tail.name, edge.head.weight + edge.tail.weight);
            nodeToContr.put(edge.head, contrNode);
            nodeToContr.put(edge.tail, contrNode);
            contrNodes.add(contrNode);
        }
        if (nodeToContr.isEmpty()) {
            final Map<Node, Integer> nodeToCluster = (Map<Node, Integer>)new HashMap();
            int clusterId = 0;
            for (final Node node : nodes) {
                nodeToCluster.put(node, (clusterId++));
            }
            return nodeToCluster;
        }
        for (final Node node2 : nodes) {
            if (!nodeToContr.containsKey(node2)) {
                final Node contrNode = new Node(node2.name, node2.weight);
                nodeToContr.put(node2, contrNode);
                contrNodes.add(contrNode);
            }
        }
        final Map<Node, Map<Node, Double>> startToEndToWeight = (Map<Node, Map<Node, Double>>)new HashMap();
        Iterator i$3 = contrNodes.iterator();
        while (i$3.hasNext()) {
            final Node contrNode = (Node)i$3.next();
            startToEndToWeight.put(contrNode, new HashMap());
        }
        i$3 = edges.iterator();
        while (i$3.hasNext()) {
            final Edge edge2 = (Edge)i$3.next();
            final Node contrStart = (Node)nodeToContr.get(edge2.head);
            final Node contrEnd = (Node)nodeToContr.get(edge2.tail);
            double contrWeight = 0.0;
            final Map<Node, Double> endToWeight = (Map<Node, Double>)startToEndToWeight.get(contrStart);
            if (endToWeight.containsKey(contrEnd)) {
                contrWeight = (double)endToWeight.get(contrEnd);
            }
            endToWeight.put(contrEnd, (contrWeight + edge2.weight));
        }
        final List<Edge> contrEdges = (List<Edge>)new ArrayList();
        final Iterator i$2 = startToEndToWeight.keySet().iterator();
        while (i$2.hasNext()) {
            final Node contrStart = (Node)i$2.next();
            final Map<Node, Double> endToWeight2 = (Map<Node, Double>)startToEndToWeight.get(contrStart);
            for (final Node contrEnd2 : endToWeight2.keySet()) {
                final Edge contrEdge = new Edge(contrStart, contrEnd2, (double)endToWeight2.get(contrEnd2));
                contrEdges.add(contrEdge);
            }
        }
        final Map<Node, Integer> contrNodeToCluster = this.cluster((Collection<Node>)contrNodes, contrEdges, atedges, atpairs);
        final Map<Node, Integer> nodeToCluster2 = (Map<Node, Integer>)new HashMap();
        for (final Node node3 : nodeToContr.keySet()) {
            nodeToCluster2.put(node3, contrNodeToCluster.get(nodeToContr.get(node3)));
        }
        final Map<Node, List<Edge>> nodeToEdge = (Map<Node, List<Edge>>)new HashMap();
        for (final Node node4 : nodes) {
            nodeToEdge.put(node4, new ArrayList());
        }
        for (final Edge edge3 : edges) {
            ((List)nodeToEdge.get(edge3.head)).add(edge3);
        }
        this.refine(nodeToCluster2, nodeToEdge, atedges, atpairs);
        return nodeToCluster2;
    }
    
    public Map<Node, Integer> execute(final List<Node> nodes, final List<Edge> edges, final boolean ignoreLoops) {
        double atedgeCnt = 0.0;
        for (final Edge edge : edges) {
            if (!ignoreLoops || !edge.head.equals(edge.tail)) {
                atedgeCnt += edge.weight;
            }
        }
        double atpairCnt = 0.0;
        for (final Node node : nodes) {
            atpairCnt += node.weight;
        }
        atpairCnt *= atpairCnt;
        if (ignoreLoops) {
            for (final Node node : nodes) {
                atpairCnt -= node.weight * node.weight;
            }
        }
        return this.cluster((Collection<Node>)nodes, edges, atedgeCnt, atpairCnt);
    }
}
