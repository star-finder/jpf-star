package darpa.stac.graph_analyzer.graph;

import java.util.*;

public class Matrix implements Cloneable
{
    public int[][] values;
    
    public Matrix(final int w, final int h) {
        this.values = null;
        this.values = new int[w][h];
        for (int i = 0; i < w; ++i) {
            for (int j = 0; j < h; ++j) {
                this.values[i][j] = 0;
            }
        }
    }
    
    public Object clone() {
        final int w = this.values.length;
        final int h = this.values[0].length;
        final Matrix m = new Matrix(w, h);
        for (int i = 0; i < h; ++i) {
            for (int j = 0; j < w; ++j) {
                m.values[i][j] = this.values[i][j];
            }
        }
        return m;
    }
    
    public Vector eigenVectors() {
        final Vector result = new Vector();
        final Matrix trans = this.transpose();
        return null;
    }
    
    public Matrix transpose() {
        final int w = this.values.length;
        final int h = this.values[0].length;
        final Matrix dup = new Matrix(h, w);
        for (int i = 0; i < h; ++i) {
            for (int j = 0; j < w; ++j) {
                dup.values[j][i] = this.values[i][j];
            }
        }
        return dup;
    }
    
    public int determinant() {
        return 0;
    }
    
    public void multScalar(final int scalar) {
        final int w = this.values.length;
        for (int h = this.values[0].length, i = 0; i < h; ++i) {
            for (int j = 0; j < w; ++j) {
                final int[] array = this.values[i];
                final int n = j;
                array[n] *= scalar;
            }
        }
    }
    
    public String toString() {
        String s = new String();
        final int w = this.values.length;
        for (int h = this.values[0].length, i = 0; i < h; ++i) {
            for (int j = 0; j < w; ++j) {
                s = s + " " + this.values[i][j];
            }
            s += "\n";
        }
        return s;
    }
}
