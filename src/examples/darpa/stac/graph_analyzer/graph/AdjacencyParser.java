package darpa.stac.graph_analyzer.graph;

import darpa.stac.graph_analyzer.logging.*;
import java.io.*;

public class AdjacencyParser
{
    public static AdjacencyMatrix parse(final InputStream s) throws IOException, FileFormatException {
        final StreamTokenizer st = new StreamTokenizer(s);
        st.commentChar(35);
        st.parseNumbers();
        st.eolIsSignificant(true);
        st.wordChars(40, 40);
        st.wordChars(41, 41);
        st.wordChars(95, 95);
        st.wordChars(39, 39);
        int numCols = 0;
        int val;
        while ((val = st.nextToken()) != 10) {
            if (val != -3 && val != -2) {
                final String err = new StringBuilder().append("Parse error, line ").append(st.lineno()).append(" : Expected string header for column ").append(numCols).append(".").toString();
                throw new FileFormatException(err);
            }
            final String cname = (val == -3) ? st.sval : String.valueOf(st.nval);
            ++numCols;
        }
        final AdjacencyMatrix mat = new AdjacencyMatrix(numCols);
        for (int y = 0; y < numCols; ++y) {
            val = st.nextToken();
            if (val != -3) {
                final String err2 = new StringBuilder().append("Parse error, line ").append(st.lineno()).append(" : Expected row header.").toString();
                throw new FileFormatException(err2);
            }
            for (int x = 0; x <= y; ++x) {
                val = st.nextToken();
                if (val != -2) {
                    final String err3 = new StringBuilder().append("Parse error, line ").append(st.lineno()).append(" : Expected integer edge weight, column ").append(x).append(".").toString();
                    throw new FileFormatException(err3);
                }
                mat.values[x][y] = (mat.values[y][x] = (int)st.nval);
            }
            String label = new String();
            while ((val = st.nextToken()) != 10) {
                if (val == -3) {
                    label = label + " " + st.sval;
                }
                else if (val == -2) {
                    label = label + " " + String.valueOf(st.nval);
                }
                else {
                    if (val != -1) {
                        final String err4 = new StringBuilder().append("Parse error, line ").append(st.lineno()).append(" : Expected string label.").toString();
                        throw new FileFormatException(err4);
                    }
                    if (y == numCols - 1) {
                        mat.names[y] = label;
                        return mat;
                    }
                    final String err4 = new StringBuilder().append("Parse error, line ").append(st.lineno()).append(" : Premature EOF.").toString();
                    throw new FileFormatException(err4);
                }
            }
            mat.names[y] = label;
        }
        if ((val = st.nextToken()) != -1) {
            final String warn = new StringBuilder().append("Warning, line ").append(st.lineno()).append(" : Ignoring extra information at end of file").toString();
            LogFactory.getLog(null).info(warn);
        }
        return mat;
    }
}
