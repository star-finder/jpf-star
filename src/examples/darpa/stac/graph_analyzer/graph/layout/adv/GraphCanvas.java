package darpa.stac.graph_analyzer.graph.layout.adv;

import darpa.stac.graph_analyzer.graph.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class GraphCanvas extends JComponent
{
    private final Map<Node, double[]> nodeToPosition;
    private double minX;
    private double maxX;
    private double minY;
    private double maxY;
    private final Map<Node, Integer> nodeToCluster;
    private int maxCluster;
    private Set<Node> labelledNodes;
    private boolean labelsEnabled;
    private String searchedName;
    
    public GraphCanvas(final Map<Node, double[]> nodeToPosition, final Map<Node, Integer> nodeToCluster) {
        this.labelledNodes = (Set<Node>)new HashSet();
        this.labelsEnabled = false;
        this.searchedName = null;
        this.nodeToPosition = nodeToPosition;
        this.nodeToCluster = nodeToCluster;
        this.minX = 3.4028234663852886E38;
        this.maxX = -3.4028234663852886E38;
        this.minY = 3.4028234663852886E38;
        this.maxY = -3.4028234663852886E38;
        for (final Node node : nodeToPosition.keySet()) {
            final double[] position = (double[])nodeToPosition.get((Object)node);
            final double diameter = Math.sqrt(node.weight);
            this.minX = Math.min(this.minX, position[0] - diameter / 2.0);
            this.maxX = Math.max(this.maxX, position[0] + diameter / 2.0);
            this.minY = Math.min(this.minY, position[1] - diameter / 2.0);
            this.maxY = Math.max(this.maxY, position[1] + diameter / 2.0);
        }
        this.maxCluster = 0;
        for (final int cluster : nodeToCluster.values()) {
            this.maxCluster = Math.max(cluster, this.maxCluster);
        }
        this.addMouseMotionListener((MouseMotionListener)new MouseMotionAdapter() {
            public void mouseMoved(final MouseEvent event) {
                GraphCanvas.this.labelledNodes = GraphCanvas.this.nodesAt(event.getX(), event.getY());
                GraphCanvas.this.repaint();
            }
        });
        this.addMouseListener((MouseListener)new MouseAdapter() {
            public void mousePressed(final MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                    GraphCanvas.this.showPopup(e.getX(), e.getY());
                }
            }
        });
    }
    
    private void showPopup(final int posX, final int posY) {
        final JPopupMenu menu = new JPopupMenu();
        final JMenuItem item = new JMenuItem("Search...");
        item.addActionListener((ActionListener)new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                GraphCanvas.this.searchedName = JOptionPane.showInputDialog("Search for node:");
                GraphCanvas.this.repaint();
            }
        });
        menu.add(item);
        menu.show((Component)this, posX, posY);
    }
    
    private Set<Node> nodesAt(final int x, final int y) {
        final double scale = Math.min(this.getWidth() / (this.maxX - this.minX), this.getHeight() / (this.maxY - this.minY));
        final Set<Node> result = (Set<Node>)new HashSet();
        for (final Node node : this.nodeToPosition.keySet()) {
            final int positionX = (int)Math.round((((double[])this.nodeToPosition.get((Object)node))[0] - this.minX) * scale);
            final int positionY = (int)Math.round((((double[])this.nodeToPosition.get((Object)node))[1] - this.minY) * scale);
            final int diameter = (int)Math.round(Math.sqrt(node.weight) * scale);
            if (x >= positionX - diameter / 2 && x <= positionX + diameter / 2 && y >= positionY - diameter / 2 && y <= positionY + diameter / 2) {
                result.add(node);
            }
        }
        return result;
    }
    
    public void setLabelEnabled(final boolean labelsEnabled) {
        this.labelsEnabled = labelsEnabled;
        this.repaint();
    }
    
    public void paint(final Graphics g) {
        final double scale = Math.min(this.getWidth() / (this.maxX - this.minX), this.getHeight() / (this.maxY - this.minY));
        ((Graphics2D)g).setComposite((Composite)AlphaComposite.getInstance(3, 0.5f));
        for (final Node node : this.nodeToPosition.keySet()) {
            final float hue = (int)this.nodeToCluster.get((Object)node) / (this.maxCluster + 1);
            g.setColor(Color.getHSBColor(hue, 1.0f, 1.0f));
            final int positionX = (int)Math.round((((double[])this.nodeToPosition.get((Object)node))[0] - this.minX) * scale);
            final int positionY = (int)Math.round((((double[])this.nodeToPosition.get((Object)node))[1] - this.minY) * scale);
            final int diameter = (int)Math.round(Math.sqrt(node.weight) * scale);
            g.fillOval(positionX - diameter / 2, positionY - diameter / 2, diameter, diameter);
        }
        final int FONT_SIZE = 10;
        g.setFont(g.getFont().deriveFont(10));
        ((Graphics2D)g).setComposite((Composite)AlphaComposite.getInstance(3, 1.0f));
        for (final Node node2 : this.nodeToPosition.keySet()) {
            if (this.labelledNodes.contains((Object)node2)) {
                continue;
            }
            if (!node2.name.equalsIgnoreCase(this.searchedName) && !this.labelsEnabled) {
                continue;
            }
            g.setColor(node2.name.equalsIgnoreCase(this.searchedName) ? Color.RED : Color.BLACK);
            final int positionX = (int)Math.round((((double[])this.nodeToPosition.get((Object)node2))[0] - this.minX) * scale);
            final int positionY = (int)Math.round((((double[])this.nodeToPosition.get((Object)node2))[1] - this.minY) * scale);
            g.drawString(node2.name, Math.min(positionX, this.getWidth() - g.getFontMetrics().stringWidth(node2.name)), Math.max(positionY, 10));
        }
        if (!this.labelledNodes.isEmpty()) {
            final Node firstNode = (Node)this.labelledNodes.iterator().next();
            final int positionX2 = (int)Math.round((((double[])this.nodeToPosition.get((Object)firstNode))[0] - this.minX) * scale);
            int positionY2 = (int)Math.round((((double[])this.nodeToPosition.get((Object)firstNode))[1] - this.minY) * scale);
            positionY2 = Math.max(positionY2, 10);
            for (final Node node3 : this.labelledNodes) {
                g.setColor(node3.name.equalsIgnoreCase(this.searchedName) ? Color.RED : Color.BLACK);
                g.drawString(node3.name, Math.min(positionX2, this.getWidth() - g.getFontMetrics().stringWidth(node3.name)), positionY2);
                positionY2 += 10;
            }
        }
    }
}
