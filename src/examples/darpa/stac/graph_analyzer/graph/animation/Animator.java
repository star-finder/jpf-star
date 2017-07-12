package darpa.stac.graph_analyzer.graph.animation;

import darpa.stac.graph_analyzer.graph.*;
import java.awt.*;

public class Animator
{
    public static void init(final Component c) {
    }
    
    public static void flash(final Node n, final int num) {
        AnimationManager.addAction(new FlashAction(n, num, 100));
    }
    
    public static void move(final Node n, final double x, final double y) {
        AnimationManager.addAction(new MoveAction(n, x, y, 1000));
    }
    
    public static void fade(final Node n, final Color fill, final Color border) {
        AnimationManager.addAction(new FadeAction(n, fill, border, 1000));
    }
    
    public static void scale(final Node n, final double w, final double h) {
        AnimationManager.addAction(new ScaleAction(n, w, h, 1000));
    }
}
