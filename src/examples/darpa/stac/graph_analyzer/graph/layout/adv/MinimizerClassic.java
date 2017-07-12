package darpa.stac.graph_analyzer.graph.layout.adv;

import darpa.stac.graph_analyzer.graph.*;
import java.util.*;
import darpa.stac.graph_analyzer.logging.*;

public class MinimizerClassic
{
    private final List<Node> nodes;
    private double repuFactor;
    private double repuExponent;
    private final Map<Node, Collection<Edge>> attrEdges;
    private double attrExponent;
    private final double[] baryCenter;
    private double gravFactor;
    private final int nrDims;
    private Map<Node, double[]> positions;
    
    public MinimizerClassic(final Collection<Node> nodes, final Collection<Edge> attrEdges, final double repuExponent, final double attrExponent, final double gravFactor, final int nrDims) {
        this.nodes = (List<Node>)new ArrayList((Collection)nodes);
        this.attrEdges = (Map<Node, Collection<Edge>>)new HashMap();
        for (final Node node : nodes) {
            this.attrEdges.put(node, new ArrayList());
        }
        for (final Edge edge : attrEdges) {
            if (edge.head == edge.tail) {
                continue;
            }
            ((Collection)this.attrEdges.get((Object)edge.head)).add((Object)edge);
        }
        this.repuExponent = repuExponent;
        this.attrExponent = attrExponent;
        this.baryCenter = new double[nrDims];
        this.gravFactor = gravFactor;
        this.nrDims = nrDims;
    }
    
    public void minimizeEnergy(final Map<Node, double[]> positions, final int nrIterations) {
        if (this.nodes.size() <= 1) {
            return;
        }
        this.positions = positions;
        this.initEnergyFactors();
        final double finalAttrExponent = this.attrExponent;
        final double finalRepuExponent = this.repuExponent;
        this.computeBaryCenter();
        this.printStatistics();
        double energySum = 0.0;
        for (final Node node : this.nodes) {
            energySum += this.getEnergy(node);
        }
        LogFactory.getLog(null).info(new StringBuilder().append("initial energy ").append(energySum).toString());
        final double[] oldPos = new double[this.nrDims];
        final double[] bestDir = new double[this.nrDims];
        for (int step = 1; step <= nrIterations; ++step) {
            this.computeBaryCenter();
            if (nrIterations >= 50 && finalRepuExponent < 1.0) {
                this.attrExponent = finalAttrExponent;
                this.repuExponent = finalRepuExponent;
                if (step <= 0.6 * nrIterations) {
                    this.attrExponent += 1.1 * (1.0 - finalRepuExponent);
                    this.repuExponent += 0.9 * (1.0 - finalRepuExponent);
                }
                else if (step <= 0.9 * nrIterations) {
                    this.attrExponent += 1.1 * (1.0 - finalRepuExponent) * (0.9 - step / nrIterations) / 0.3;
                    this.repuExponent += 0.9 * (1.0 - finalRepuExponent) * (0.9 - step / nrIterations) / 0.3;
                }
            }
            energySum = 0.0;
            for (final Node node2 : this.nodes) {
                final double oldEnergy = this.getEnergy(node2);
                this.getDirection(node2, bestDir);
                final double[] pos = (double[])positions.get((Object)node2);
                for (int d = 0; d < this.nrDims; ++d) {
                    oldPos[d] = pos[d];
                }
                double bestEnergy = oldEnergy;
                int bestMultiple = 0;
                for (int d2 = 0; d2 < this.nrDims; ++d2) {
                    final double[] array = bestDir;
                    final int n = d2;
                    array[n] /= 32.0;
                }
                for (int multiple = 32; multiple >= 1 && (bestMultiple == 0 || bestMultiple / 2 == multiple); multiple /= 2) {
                    for (int d3 = 0; d3 < this.nrDims; ++d3) {
                        pos[d3] = oldPos[d3] + bestDir[d3] * multiple;
                    }
                    final double curEnergy = this.getEnergy(node2);
                    if (curEnergy < bestEnergy) {
                        bestEnergy = curEnergy;
                        bestMultiple = multiple;
                    }
                }
                for (int multiple = 64; multiple <= 128 && bestMultiple == multiple / 2; multiple *= 2) {
                    for (int d3 = 0; d3 < this.nrDims; ++d3) {
                        pos[d3] = oldPos[d3] + bestDir[d3] * multiple;
                    }
                    final double curEnergy = this.getEnergy(node2);
                    if (curEnergy < bestEnergy) {
                        bestEnergy = curEnergy;
                        bestMultiple = multiple;
                    }
                }
                for (int d2 = 0; d2 < this.nrDims; ++d2) {
                    pos[d2] = oldPos[d2] + bestDir[d2] * bestMultiple;
                }
                energySum += bestEnergy;
            }
            LogFactory.getLog(null).info(new StringBuilder().append("iteration ").append(step).append("   energy ").append(energySum).append("   repulsion ").append(this.repuExponent).toString());
        }
        this.printStatistics();
        double minDistance = Double.MAX_VALUE;
        double maxDistance = 0.0;
        for (final Node node3 : this.nodes) {
            if (node3.weight == 0.0) {
                continue;
            }
            final double[] position1 = (double[])positions.get((Object)node3);
            for (final Node node4 : this.nodes) {
                if (node4.weight != 0.0 && node3 != node4) {
                    final double dist = this.getDist(position1, (double[])positions.get((Object)node4));
                    minDistance = Math.min(minDistance, dist);
                    maxDistance = Math.max(maxDistance, dist);
                }
            }
        }
        if (maxDistance / minDistance > 1.0E9) {
            System.err.println("The node distances in the layout are extremely nonuniform.\n The graph likely has unconnected or very sparsely connected components.\n Set random layout to recover, and increase gravitation factor.");
        }
    }
    
    private void initEnergyFactors() {
        double attrSum = 0.0;
        for (final Node node : this.nodes) {
            for (final Edge edge : this.attrEdges.get((Object)node)) {
                attrSum += edge.weight;
            }
        }
        double repuSum = 0.0;
        for (final Node node2 : this.nodes) {
            repuSum += node2.weight;
        }
        if (repuSum > 0.0 && attrSum > 0.0) {
            final double density = attrSum / repuSum / repuSum;
            this.repuFactor = density * Math.pow(repuSum, 0.5 * (this.attrExponent - this.repuExponent));
            this.gravFactor = density * repuSum * Math.pow(this.gravFactor, this.attrExponent - this.repuExponent);
        }
        else {
            this.repuFactor = 1.0;
        }
    }
    
    private final double getDist(final double[] pos1, final double[] pos2) {
        double dist = 0.0;
        for (int d = 0; d < this.nrDims; ++d) {
            final double diff = pos1[d] - pos2[d];
            dist += diff * diff;
        }
        return Math.sqrt(dist);
    }
    
    private double getRepulsionEnergy(final Node node) {
        if (node.weight == 0.0) {
            return 0.0;
        }
        final double[] position = (double[])this.positions.get((Object)node);
        double energy = 0.0;
        for (final Node node2 : this.nodes) {
            if (node2 != node) {
                if (node2.weight == 0.0) {
                    continue;
                }
                final double dist = this.getDist(position, (double[])this.positions.get((Object)node2));
                if (this.repuExponent == 0.0) {
                    energy -= this.repuFactor * node.weight * node2.weight * Math.log(dist);
                }
                else {
                    energy -= this.repuFactor * node.weight * node2.weight * Math.pow(dist, this.repuExponent) / this.repuExponent;
                }
            }
        }
        return energy;
    }
    
    private double getAttractionEnergy(final Node node) {
        double energy = 0.0;
        final double[] position = (double[])this.positions.get((Object)node);
        for (final Edge edge : this.attrEdges.get((Object)node)) {
            final double dist = this.getDist(position, (double[])this.positions.get((Object)edge.tail));
            if (this.attrExponent == 0.0) {
                energy += edge.weight * Math.log(dist);
            }
            else {
                energy += edge.weight * Math.pow(dist, this.attrExponent) / this.attrExponent;
            }
        }
        return energy;
    }
    
    private double getGravitationEnergy(final Node node) {
        final double dist = this.getDist((double[])this.positions.get((Object)node), this.baryCenter);
        if (this.attrExponent == 0.0) {
            return this.gravFactor * node.weight * Math.log(dist);
        }
        return this.gravFactor * node.weight * Math.pow(dist, this.attrExponent) / this.attrExponent;
    }
    
    private double getEnergy(final Node node) {
        return this.getRepulsionEnergy(node) + this.getAttractionEnergy(node) + this.getGravitationEnergy(node);
    }
    
    private double addRepulsionDir(final Node node, final double[] dir) {
        if (node.weight == 0.0) {
            return 0.0;
        }
        final double[] position = (double[])this.positions.get((Object)node);
        double dir2 = 0.0;
        for (final Node node2 : this.nodes) {
            if (node2 != node) {
                if (node2.weight == 0.0) {
                    continue;
                }
                final double[] position2 = (double[])this.positions.get((Object)node2);
                final double dist = this.getDist(position, position2);
                if (dist == 0.0) {
                    continue;
                }
                final double tmp = this.repuFactor * node.weight * node2.weight * Math.pow(dist, this.repuExponent - 2.0);
                dir2 += tmp * Math.abs(this.repuExponent - 1.0);
                for (int d = 0; d < this.nrDims; ++d) {
                    final int n = d;
                    dir[n] -= (position2[d] - position[d]) * tmp;
                }
            }
        }
        return dir2;
    }
    
    private double addAttractionDir(final Node node, final double[] dir) {
        double dir2 = 0.0;
        final double[] position = (double[])this.positions.get((Object)node);
        for (final Edge edge : this.attrEdges.get(node)) {
            final double[] position2 = (double[])this.positions.get((Object)edge.tail);
            final double dist = this.getDist(position, position2);
            if (dist == 0.0) {
                continue;
            }
            final double tmp = edge.weight * Math.pow(dist, this.attrExponent - 2.0);
            dir2 += tmp * Math.abs(this.attrExponent - 1.0);
            for (int d = 0; d < this.nrDims; ++d) {
                final int n = d;
                dir[n] += (position2[d] - position[d]) * tmp;
            }
        }
        return dir2;
    }
    
    private double addGravitationDir(final Node node, final double[] dir) {
        final double[] position = (double[])this.positions.get((Object)node);
        final double dist = this.getDist(position, this.baryCenter);
        final double tmp = this.gravFactor * this.repuFactor * node.weight * Math.pow(dist, this.attrExponent - 2.0);
        for (int d = 0; d < this.nrDims; ++d) {
            final int n = d;
            dir[n] += (this.baryCenter[d] - position[d]) * tmp;
        }
        return tmp * Math.abs(this.attrExponent - 1.0);
    }
    
    private void getDirection(final Node node, final double[] dir) {
        for (int d = 0; d < this.nrDims; ++d) {
            dir[d] = 0.0;
        }
        double dir2 = this.addRepulsionDir(node, dir);
        dir2 += this.addAttractionDir(node, dir);
        dir2 += this.addGravitationDir(node, dir);
        double avgDist = 0.0;
        for (final Node node2 : this.nodes) {
            avgDist += this.getDist((double[])this.positions.get((Object)node), (double[])this.positions.get((Object)node2));
        }
        avgDist /= this.nodes.size() - 1;
        if (dir2 != 0.0) {
            for (int d2 = 0; d2 < this.nrDims; ++d2) {
                final int n = d2;
                dir[n] /= dir2;
            }
            double length = this.getDist(dir, new double[this.nrDims]);
            if (avgDist > 0.0 && length > avgDist) {
                length /= avgDist;
                for (int d3 = 0; d3 < this.nrDims; ++d3) {
                    final int n2 = d3;
                    dir[n2] /= length;
                }
            }
        }
        else {
            for (int d2 = 0; d2 < this.nrDims; ++d2) {
                dir[d2] = 0.0;
            }
        }
    }
    
    private void computeBaryCenter() {
        for (int d = 0; d < this.nrDims; ++d) {
            this.baryCenter[d] = 0.0;
        }
        double weightSum = 0.0;
        for (final Node node : this.nodes) {
            weightSum += node.weight;
            final double[] position = (double[])this.positions.get((Object)node);
            for (int d2 = 0; d2 < this.nrDims; ++d2) {
                final double[] baryCenter = this.baryCenter;
                final int n = d2;
                baryCenter[n] += node.weight * position[d2];
            }
        }
        if (weightSum > 0.0) {
            for (int d3 = 0; d3 < this.nrDims; ++d3) {
                final double[] baryCenter2 = this.baryCenter;
                final int n2 = d3;
                baryCenter2[n2] /= weightSum;
            }
        }
    }
    
    private void printStatistics() {
        LogFactory.getLog(null).info(new StringBuilder().append("Number of nodes: ").append(this.nodes.size()).toString());
        double attrSum = 0.0;
        for (final Node node : this.nodes) {
            for (final Edge edge : this.attrEdges.get((Object)node)) {
                attrSum += edge.weight;
            }
        }
        LogFactory.getLog(null).info(new StringBuilder().append("Overall attraction: ").append(attrSum).toString());
        double meanAttrEnergy = 0.0;
        for (final Node node2 : this.nodes) {
            meanAttrEnergy += this.getAttractionEnergy(node2);
        }
        meanAttrEnergy = ((this.attrExponent == 0.0) ? Math.exp(meanAttrEnergy / attrSum) : Math.pow(meanAttrEnergy * this.attrExponent / attrSum, 1.0 / this.attrExponent));
        LogFactory.getLog(null).info(new StringBuilder().append("Weighted mean of attraction energy: ").append(meanAttrEnergy).toString());
        double repuSum = 0.0;
        double repuSquareSum = 0.0;
        for (final Node node3 : this.nodes) {
            repuSum += node3.weight;
            repuSquareSum += node3.weight * node3.weight;
        }
        repuSum = repuSum * repuSum - repuSquareSum;
        LogFactory.getLog(null).info(new StringBuilder().append("Overall repulsion: ").append(repuSum).toString());
        double meanRepuEnergy = 0.0;
        for (final Node node4 : this.nodes) {
            meanRepuEnergy += this.getRepulsionEnergy(node4);
        }
        meanRepuEnergy /= this.repuFactor;
        meanRepuEnergy = ((this.repuExponent == 0.0) ? Math.exp(-meanRepuEnergy / repuSum) : Math.pow(-meanRepuEnergy * this.repuExponent / repuSum, 1.0 / this.repuExponent));
        LogFactory.getLog(null).info(new StringBuilder().append("Weighted mean of repulsion energy: ").append(meanRepuEnergy).toString());
        LogFactory.getLog(null).info(new StringBuilder().append("Mean attraction / mean repulsion: ").append(meanAttrEnergy / meanRepuEnergy).toString());
    }
}
