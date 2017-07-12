package darpa.stac.image_processor.mathematics;

import darpa.stac.image_processor.image.utilities.*;

public class Mathematics
{
    private static final double Z255_inv = 0.00392156862745098;
    private static final double Z255_e_revert = 93.80925749833975;
    private static final int[] accuracy;
    
    private static double lgamma(final double x) {
        final double tmp = (x - 0.5) * Math.log(x + 4.5) - (x + 4.5);
        final double ser = 1.0 + 76.18009173 / x - 86.50532033 / (x + 1.0) + 24.014092822 / (x + 2.0) - 1.231739516 / (x + 3.0) + 0.00120858003 / (x + 4.0) - 5.36382E-6 / (x + 5.0);
        return tmp + Math.log(ser * Math.sqrt(6.283185307179586));
    }
    
    private static double factorial(final double x) {
        return Math.exp(lgamma(x + 1.0));
    }
    
    private static double exp(final int x, final int n) {
        double exp_n = 0.0;
        for (int i = 0; i < n; ++i) {
            final double aDouble = Math.pow(x * 0.00392156862745098, (double)n);
            final double aDouble2 = 1.0 / factorial(n);
            exp_n += aDouble * aDouble2;
        }
        return exp_n;
    }
    
    public static int intensify(final int a, final int r, final int g, final int b) {
        final int acc = Mathematics.accuracy[(r + g + b) % 255];
        return ARGB.toARGB(a, (int)(93.80925749833975 * exp(r, acc)), (int)(93.80925749833975 * exp(g, acc)), (int)(93.80925749833975 * exp(b, acc)));
    }
    
    static {
        accuracy = new int[257];
        for (int n = 0; n <= 256; ++n) {
            final double v = 1.0 / Math.tan(Math.abs(30 - n) * 0.00392156862745098 + 0.001);
            Mathematics.accuracy[n] = 4 + (int)v;
        }
    }
}
