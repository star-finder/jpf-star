package darpa.stac.graph_analyzer.graph.layout.adv;

import darpa.stac.graph_analyzer.graph.*;
import java.util.*;
import darpa.stac.graph_analyzer.logging.*;

public class MinimizerBarnesHut
{
    private final List<Node> nodes;
    private double repuFactor;
    private double repuExponent;
    private final Map<Node, Collection<Edge>> attrEdges;
    private double attrExponent;
    private final double[] baryCenter;
    private double gravFactor;
    private final int nrDims = 3;
    private Map<Node, double[]> positions;
    
    public MinimizerBarnesHut(final Collection<Node> nodes, final Collection<Edge> attrEdges, final double repuExponent, final double attrExponent, final double gravFactor) {
        this.baryCenter = new double[3];
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
        this.gravFactor = gravFactor;
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
        OctTree octTree = this.buildOctTree();
        this.printStatistics(octTree);
        double energySum = 0.0;
        for (final Node node : this.nodes) {
            energySum += this.getEnergy(node, octTree);
        }
        LogFactory.getLog(null).info(new StringBuilder().append("initial energy ").append(energySum).toString());
        final double[] oldPos = new double[3];
        final double[] bestDir = new double[3];
        for (int step = 1; step <= nrIterations; ++step) {
            this.computeBaryCenter();
            octTree = this.buildOctTree();
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
                final double oldEnergy = this.getEnergy(node2, octTree);
                this.getDirection(node2, octTree, bestDir);
                final double[] pos = (double[])positions.get((Object)node2);
                for (int d = 0; d < 3; ++d) {
                    oldPos[d] = pos[d];
                }
                double bestEnergy = oldEnergy;
                int bestMultiple = 0;
                for (int d2 = 0; d2 < 3; ++d2) {
                    final double[] array = bestDir;
                    final int n = d2;
                    array[n] /= 32.0;
                }
                for (int multiple = 32; multiple >= 1 && (bestMultiple == 0 || bestMultiple / 2 == multiple); multiple /= 2) {
                    octTree.removeNode(node2, pos, 0);
                    for (int d3 = 0; d3 < 3; ++d3) {
                        pos[d3] = oldPos[d3] + bestDir[d3] * multiple;
                    }
                    octTree.addNode(node2, pos, 0);
                    final double curEnergy = this.getEnergy(node2, octTree);
                    if (curEnergy < bestEnergy) {
                        bestEnergy = curEnergy;
                        bestMultiple = multiple;
                    }
                }
                for (int multiple = 64; multiple <= 128 && bestMultiple == multiple / 2; multiple *= 2) {
                    octTree.removeNode(node2, pos, 0);
                    for (int d3 = 0; d3 < 3; ++d3) {
                        pos[d3] = oldPos[d3] + bestDir[d3] * multiple;
                    }
                    octTree.addNode(node2, pos, 0);
                    final double curEnergy = this.getEnergy(node2, octTree);
                    if (curEnergy < bestEnergy) {
                        bestEnergy = curEnergy;
                        bestMultiple = multiple;
                    }
                }
                octTree.removeNode(node2, pos, 0);
                for (int d2 = 0; d2 < 3; ++d2) {
                    pos[d2] = oldPos[d2] + bestDir[d2] * bestMultiple;
                }
                octTree.addNode(node2, pos, 0);
                energySum += bestEnergy;
            }
            LogFactory.getLog(null).info(new StringBuilder().append("iteration ").append(step).append("   energy ").append(energySum).append("   repulsion ").append(this.repuExponent).toString());
        }
        this.printStatistics(octTree);
        if (octTree.getHeight() >= 18) {
            System.err.println("The node distances in the layout are extremely nonuniform.\n The graph likely has unconnected or very sparsely connected components.\n Set random layout to recover, and increase gravitation factor.");
        }
    }
    
    private void initEnergyFactors() {
        double attrSum = 0.0;
        for (final Node node : this.nodes) {
            for (final Edge edge : this.attrEdges.get(node)) {
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
        for (int d = 0; d < 3; ++d) {
            final double diff = pos1[d] - pos2[d];
            dist += diff * diff;
        }
        return Math.sqrt(dist);
    }
    
    private double getRepulsionEnergy(final Node node, final OctTree tree) {
        if (tree == null || tree.node == node) {
            return 0.0;
        }
        if (node.weight == 0.0) {
            return 0.0;
        }
        final double dist = this.getDist((double[])this.positions.get((Object)node), tree.position);
        if (tree.childCount > 0 && dist < 2.0 * tree.width()) {
            double energy = 0.0;
            for (int i = 0; i < tree.children.length; ++i) {
                energy += this.getRepulsionEnergy(node, tree.children[i]);
            }
            return energy;
        }
        if (dist == 0.0) {
            return 0.0;
        }
        if (this.repuExponent == 0.0) {
            return -this.repuFactor * node.weight * tree.weight * Math.log(dist);
        }
        return -this.repuFactor * node.weight * tree.weight * Math.pow(dist, this.repuExponent) / this.repuExponent;
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
    
    private double getEnergy(final Node node, final OctTree octTree) {
        return this.getRepulsionEnergy(node, octTree) + this.getAttractionEnergy(node) + this.getGravitationEnergy(node);
    }
    
    private double addRepulsionDir(final Node node, final OctTree tree, final double[] dir) {
        if (tree == null || tree.node == node) {
            return 0.0;
        }
        if (node.weight == 0.0) {
            return 0.0;
        }
        final double[] position = (double[])this.positions.get((Object)node);
        final double dist = this.getDist(position, tree.position);
        if (tree.childCount > 0 && dist < 2.0 * tree.width()) {
            double dir2 = 0.0;
            for (int i = 0; i < tree.children.length; ++i) {
                dir2 += this.addRepulsionDir(node, tree.children[i], dir);
            }
            return dir2;
        }
        if (dist == 0.0) {
            return 0.0;
        }
        final double tmp = this.repuFactor * node.weight * tree.weight * Math.pow(dist, this.repuExponent - 2.0);
        for (int d = 0; d < 3; ++d) {
            final int n = d;
            dir[n] -= (tree.position[d] - position[d]) * tmp;
        }
        return tmp * Math.abs(this.repuExponent - 1.0);
    }
    
    private double addAttractionDir(final Node node, final double[] dir) {
        double dir2 = 0.0;
        final double[] position = (double[])this.positions.get((Object)node);
        for (final Edge edge : this.attrEdges.get((Object)node)) {
            final double[] position2 = (double[])this.positions.get((Object)edge.tail);
            final double dist = this.getDist(position, position2);
            if (dist == 0.0) {
                continue;
            }
            final double tmp = edge.weight * Math.pow(dist, this.attrExponent - 2.0);
            dir2 += tmp * Math.abs(this.attrExponent - 1.0);
            for (int d = 0; d < 3; ++d) {
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
        for (int d = 0; d < 3; ++d) {
            final int n = d;
            dir[n] += (this.baryCenter[d] - position[d]) * tmp;
        }
        return tmp * Math.abs(this.attrExponent - 1.0);
    }
    
    private void getDirection(final Node node, final OctTree octTree, final double[] dir) {
        for (int d = 0; d < 3; ++d) {
            dir[d] = 0.0;
        }
        double dir2 = this.addRepulsionDir(node, octTree, dir);
        dir2 += this.addAttractionDir(node, dir);
        dir2 += this.addGravitationDir(node, dir);
        if (dir2 != 0.0) {
            for (int d2 = 0; d2 < 3; ++d2) {
                final int n = d2;
                dir[n] /= dir2;
            }
            double scale = 1.0;
            for (int d3 = 0; d3 < 3; ++d3) {
                final double width = octTree.maxPos[d3] - octTree.minPos[d3];
                if (width > 0.0) {
                    scale = Math.min(scale, Math.abs(width / 16.0 / dir[d3]));
                }
            }
            for (int d3 = 0; d3 < 3; ++d3) {
                final int n2 = d3;
                dir[n2] *= scale;
            }
        }
        else {
            for (int d2 = 0; d2 < 3; ++d2) {
                dir[d2] = 0.0;
            }
        }
    }
    
    private OctTree buildOctTree() {
        final double[] minPos = { Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE };
        final double[] maxPos = { -1.7976931348623157E308, -1.7976931348623157E308, -1.7976931348623157E308 };
        for (final Node node : this.nodes) {
            if (node.weight == 0.0) {
                continue;
            }
            final double[] position = (double[])this.positions.get((Object)node);
            for (int d = 0; d < 3; ++d) {
                minPos[d] = Math.min(position[d], minPos[d]);
                maxPos[d] = Math.max(position[d], maxPos[d]);
            }
        }
        for (int d2 = 0; d2 < 3; ++d2) {
            final double posDiff = maxPos[d2] - minPos[d2];
            final double[] array = maxPos;
            final int n = d2;
            array[n] += posDiff / 2.0;
            final double[] array2 = minPos;
            final int n2 = d2;
            array2[n2] -= posDiff / 2.0;
        }
        final OctTree result = new OctTree(null, new double[3], minPos, maxPos);
        for (final Node node2 : this.nodes) {
            result.addNode(node2, (double[])this.positions.get((Object)node2), 0);
        }
        return result;
    }
    
    private void computeBaryCenter() {
        for (int d = 0; d < 3; ++d) {
            this.baryCenter[d] = 0.0;
        }
        double weightSum = 0.0;
        for (final Node node : this.nodes) {
            weightSum += node.weight;
            final double[] position = (double[])this.positions.get((Object)node);
            for (int d2 = 0; d2 < 3; ++d2) {
                final double[] baryCenter = this.baryCenter;
                final int n = d2;
                baryCenter[n] += node.weight * position[d2];
            }
        }
        if (weightSum > 0.0) {
            for (int d3 = 0; d3 < 3; ++d3) {
                final double[] baryCenter2 = this.baryCenter;
                final int n2 = d3;
                baryCenter2[n2] /= weightSum;
            }
        }
    }
    
    private void printStatistics(final OctTree octTree) {
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
            meanRepuEnergy += this.getRepulsionEnergy(node4, octTree);
        }
        meanRepuEnergy /= this.repuFactor;
        meanRepuEnergy = ((this.repuExponent == 0.0) ? Math.exp(-meanRepuEnergy / repuSum) : Math.pow(-meanRepuEnergy * this.repuExponent / repuSum, 1.0 / this.repuExponent));
        LogFactory.getLog(null).info(new StringBuilder().append("Weighted mean of repulsion energy: ").append(meanRepuEnergy).toString());
        LogFactory.getLog(null).info(new StringBuilder().append("Mean attraction / mean repulsion: ").append(meanAttrEnergy / meanRepuEnergy).toString());
    }
    
    static class OctTree
    {
        protected static final int MAX_DEPTH = 18;
        protected Node node;
        protected OctTree[] children;
        protected int childCount;
        protected double[] position;
        protected double weight;
        protected double[] minPos;
        protected double[] maxPos;
        
        public OctTree(final Node node, final double[] position, final double[] minPos, final double[] maxPos) {
            this.children = new OctTree[8];
            this.childCount = 0;
            this.node = node;
            this.position = new double[] { position[0], position[1], position[2] };
            this.weight = ((node != null) ? node.weight : 0.0);
            this.minPos = minPos;
            this.maxPos = maxPos;
        }
        
        public void addNode(final Node newNode, final double[] newPos, final int depth) {
            if (newNode.weight == 0.0) {
                return;
            }
            if (this.node != null) {
                this.addNode2(this.node, this.position, depth);
                this.node = null;
            }
            for (int d = 0; d < 3; ++d) {
                this.position[d] = (this.weight * this.position[d] + newNode.weight * newPos[d]) / (this.weight + newNode.weight);
            }
            this.weight += newNode.weight;
            this.addNode2(newNode, newPos, depth);
        }
        
        protected void addNode2(final Node newNode, final double[] newPos, final int depth) {
            if (depth == 18) {
                if (this.children.length == this.childCount) {
                    final OctTree[] oldChildren = this.children;
                    System.arraycopy((Object)oldChildren, 0, (Object)(this.children = new OctTree[2 * this.children.length]), 0, oldChildren.length);
                }
                this.children[this.childCount++] = new OctTree(newNode, newPos, newPos, newPos);
                return;
            }
            int childIndex = 0;
            for (int d = 0; d < 3; ++d) {
                if (newPos[d] > (this.minPos[d] + this.maxPos[d]) / 2.0) {
                    childIndex += 1 << d;
                }
            }
            if (this.children[childIndex] == null) {
                final double[] newMinPos = new double[3];
                final double[] newMaxPos = new double[3];
                for (int d2 = 0; d2 < 3; ++d2) {
                    if ((childIndex & 1 << d2) == 0x0) {
                        newMinPos[d2] = this.minPos[d2];
                        newMaxPos[d2] = (this.minPos[d2] + this.maxPos[d2]) / 2.0;
                    }
                    else {
                        newMinPos[d2] = (this.minPos[d2] + this.maxPos[d2]) / 2.0;
                        newMaxPos[d2] = this.maxPos[d2];
                    }
                }
                ++this.childCount;
                this.children[childIndex] = new OctTree(newNode, newPos, newMinPos, newMaxPos);
            }
            else {
                this.children[childIndex].addNode(newNode, newPos, depth + 1);
            }
        }
        
        public void removeNode(final Node oldNode, final double[] oldPos, final int depth) {
            if (oldNode.weight == 0.0) {
                return;
            }
            if (this.weight <= oldNode.weight) {
                this.weight = 0.0;
                this.node = null;
                for (int i = 0; i < this.children.length; ++i) {
                    this.children[i] = null;
                }
                this.childCount = 0;
                return;
            }
            for (int d = 0; d < 3; ++d) {
                this.position[d] = (this.weight * this.position[d] - oldNode.weight * oldPos[d]) / (this.weight - oldNode.weight);
            }
            this.weight -= oldNode.weight;
            if (depth == 18) {
                int childIndex;
                for (childIndex = 0; this.children[childIndex].node != oldNode; ++childIndex) {}
                --this.childCount;
                for (int j = childIndex; j < this.childCount; ++j) {
                    this.children[j] = this.children[j + 1];
                }
                this.children[this.childCount] = null;
            }
            else {
                int childIndex = 0;
                for (int d2 = 0; d2 < 3; ++d2) {
                    if (oldPos[d2] > (this.minPos[d2] + this.maxPos[d2]) / 2.0) {
                        childIndex += 1 << d2;
                    }
                }
                this.children[childIndex].removeNode(oldNode, oldPos, depth + 1);
                if (this.children[childIndex].weight == 0.0) {
                    this.children[childIndex] = null;
                    --this.childCount;
                }
            }
        }
        
        public double width() {
            double width = 0.0;
            for (int d = 0; d < 3; ++d) {
                if (this.maxPos[d] - this.minPos[d] > width) {
                    width = this.maxPos[d] - this.minPos[d];
                }
            }
            return width;
        }
        
        public int getHeight() {
            int height = -1;
            for (final OctTree child : this.children) {
                if (child != null) {
                    height = Math.max(height, child.getHeight());
                }
            }
            return height + 1;
        }
    }
}
