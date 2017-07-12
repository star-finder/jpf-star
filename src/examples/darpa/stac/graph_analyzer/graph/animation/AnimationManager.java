package darpa.stac.graph_analyzer.graph.animation;

import java.awt.*;
import darpa.stac.graph_analyzer.logging.*;
import java.util.*;

public class AnimationManager implements Runnable
{
    public static int TIMEOUT;
    Vector actions;
    protected static Component m_view;
    private static AnimationManager s_this;
    
    private AnimationManager() {
        this.actions = new Vector(10);
    }
    
    public static synchronized void init(final Component view) {
        if (AnimationManager.s_this == null) {
            AnimationManager.m_view = view;
            AnimationManager.s_this = new AnimationManager();
            final Thread t = new Thread((Runnable)AnimationManager.s_this);
            t.setPriority(1);
            t.start();
        }
        else {
            LogFactory.getLog(null).info("AnimationManager already intialized!");
        }
    }
    
    public static synchronized void addAction(final AnimationAction na) {
        AnimationManager.s_this.actions.addElement((Object)na);
    }
    
    public void run() {
        while (true) {
            if (this.actions.size() == 0) {
                try {
                    Thread.currentThread();
                    Thread.sleep((long)AnimationManager.TIMEOUT);
                }
                catch (Exception ex) {}
            }
            else {
                this.applyAll();
                AnimationManager.m_view.repaint();
                try {
                    Thread.currentThread();
                    Thread.yield();
                }
                catch (Exception ex2) {}
            }
        }
    }
    
    private synchronized void applyAll() {
        final Enumeration e = this.actions.elements();
        while (e.hasMoreElements()) {
            final AnimationAction a = (AnimationAction)e.nextElement();
            if (a.apply()) {
                this.actions.removeElement((Object)a);
            }
        }
    }
    
    static {
        AnimationManager.TIMEOUT = 100;
        AnimationManager.m_view = null;
        AnimationManager.s_this = null;
    }
}
