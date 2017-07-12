package darpa.stac.graph_analyzer.graph.layout.adv;

import java.util.*;
import darpa.stac.graph_analyzer.graph.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class GraphFrame extends JFrame
{
    public GraphFrame(final Map<Node, double[]> nodeToPosition, final Map<Node, Integer> nodeToCluster) {
        this.setTitle("LinLogLayout");
        this.setSize(this.getToolkit().getScreenSize().width / 2, this.getToolkit().getScreenSize().height / 2);
        this.setDefaultCloseOperation(3);
        this.getContentPane().setLayout((LayoutManager)new BorderLayout());
        final GraphCanvas canvas = new GraphCanvas(nodeToPosition, nodeToCluster);
        this.getContentPane().add("Center", (Component)canvas);
        final JPanel southPanel = new JPanel((LayoutManager)new BorderLayout());
        final JLabel commentLabel = new JLabel("Click right to search. Move the mouse cursor over a node to display its name.");
        southPanel.add("Center", (Component)commentLabel);
        final JCheckBox labelBox = new JCheckBox("Show all names.", false);
        labelBox.addChangeListener((ChangeListener)new ChangeListener() {
            public void stateChanged(final ChangeEvent e) {
                canvas.setLabelEnabled(labelBox.isSelected());
            }
        });
        southPanel.add("East", (Component)labelBox);
        this.getContentPane().add("South", (Component)southPanel);
    }
}
