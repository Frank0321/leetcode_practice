/**
 * https://www.javatips.net/api/smile-master/math/src/main/java/smile/stat/hypothesis/FTest.java
 */

package com.example.leetcode_practice.other.LinearRegression.Method;

public class FTest {
	
	/**
     * The degree of freedom of f-statistic.
     */
    public int df1, df2;

    /**
     * f-statistic
     */
    public double f;

    /**
     * p-value
     */
    public double pvalue;
    
    /**
     *  A small number close to the smallest representable floating point number.
     */
    private static final double FPMIN = 1e-300;
    
    /**
     * Lanczos Gamma Function approximation - small gamma
     */
    private static final double LANCZOS_SMALL_GAMMA = 5.0;

    /**
     * Lanczos Gamma Function approximation - Coefficients
     */
    private static final double[] LANCZOS_COEFF = {1.000000000190015, 76.18009172947146, -86.50532032941677, 24.01409824083091, -1.231739572450155, 0.1208650973866179E-2, -0.5395239384953E-5};
    
    /**
     * Lanczos Gamma Function approximation - N (number of coefficients - 1)
     */
    private static final int LANCZOS_N = 6;
    
    /**
     * Constructor.
     */
    private FTest(double f, int df1, int df2, double pvalue) {
        this.f = f;
        this.df1 = df1;
        this.df2 = df2;
        this.pvalue = pvalue;
    }

    /**
     * Test if the arrays x and y have significantly different variances.
     * Small values of p-value indicate that the two arrays have significantly
     * different variances.
     */
    public static FTest test(double[] x, double[] y) {
        int n1 = x.length;
        int n2 = y.length;

        double var1 = var(x);
        double var2 = var(y);

        int df1, df2;
        double f;

        // Make F the ratio of the larger variance to the smaller one.
        if (var1 > var2) {
            f = var1 / var2;
            df1 = n1 - 1;
            df2 = n2 - 1;
        } else {
            f = var2 / var1;
            df1 = n2 - 1;
            df2 = n1 - 1;
        }

        double p = 2.0 * regularizedIncompleteBetaFunction(0.5 * df2, 0.5 * df1, df2 / (df2 + df1 * f));
        if (p > 1.0) {
            p = 2.0 - p;
        }

        return new FTest(f, df1, df2, p);
    }

    
	private static double regularizedIncompleteBetaFunction(double alpha, double beta, double x) {
	      if (x < 0.0 || x > 1.0) {
	            throw new IllegalArgumentException("Invalid x: " + x);
	        }

	        double ibeta = 0.0;
	        if (x == 0.0) {
	            ibeta = 0.0;
	        } else {
	            if (x == 1.0) {
	                ibeta = 1.0;
	            } else {
	                // Term before continued fraction
	                ibeta = Math.exp(lgamma(alpha + beta) - lgamma(alpha) - lgamma(beta) + alpha * Math.log(x) + beta * Math.log(1.0D - x));
	                // Continued fraction
	                if (x < (alpha + 1.0) / (alpha + beta + 2.0)) {
	                    ibeta = ibeta * incompleteFractionSummation(alpha, beta, x) / alpha;
	                } else {
	                    // Use symmetry relationship
	                    ibeta = 1.0 - ibeta * incompleteFractionSummation(beta, alpha, 1.0 - x) / beta;
	                }
	            }
	        }
	        return ibeta;
	}

	private static double lgamma(double x) {
		double xcopy = x;
        double fg = 0.0;
        double first = x + LANCZOS_SMALL_GAMMA + 0.5;
        double second = LANCZOS_COEFF[0];

        if (x >= 0.0) {
            if (x >= 1.0 && x - (int) x == 0.0) {
                fg = logFactorial((int) x - 1);
            } else {
                first -= (x + 0.5) * Math.log(first);
                for (int i = 1; i <= LANCZOS_N; i++) {
                    second += LANCZOS_COEFF[i] / ++xcopy;
                }
                fg = Math.log(Math.sqrt(2.0 * Math.PI) * second / x) - first;
            }
        } else {
            fg = Math.PI / (gamma(1.0 - x) * Math.sin(Math.PI * x));

            if (fg != 1.0 / 0.0 && fg != -1.0 / 0.0) {
                if (fg < 0) {
                    throw new IllegalArgumentException("The gamma function is negative");
                } else {
                    fg = Math.log(fg);
                }
            }
        }
        return fg;
	}
	
	   /**
     * log of factorial of n
     */
    public static double logFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(String.format("n has to be nonnegative: %d", n));
        }

        double f = 0.0;
        for (int i = 2; i <= n; i++) {
            f += Math.log(i);
        }

        return f;
    }
	
   public static double gamma(double x) {
        double xcopy = x;
        double first = x + LANCZOS_SMALL_GAMMA + 0.5;
        double second = LANCZOS_COEFF[0];
        double fg = 0.0;

        if (x >= 0.0) {
            if (x >= 1.0 && x - (int) x == 0.0) {
                fg = factorial((int) x - 1);
            } else {
                first = Math.pow(first, x + 0.5) * Math.exp(-first);
                for (int i = 1; i <= LANCZOS_N; i++) {
                    second += LANCZOS_COEFF[i] / ++xcopy;
                }
                fg = first * Math.sqrt(2.0 * Math.PI) * second / x;
            }
        } else {
            fg = -Math.PI / (x * gamma(-x) * Math.sin(Math.PI * x));
        }
        return fg;
    }
   
   public static double factorial(int n) {
       if (n < 0) {
           throw new IllegalArgumentException("n has to be nonnegative.");
       }

       double f = 1.0;
       for (int i = 2; i <= n; i++) {
           f *= i;
       }

       return f;
   }

	private static double incompleteFractionSummation(double alpha, double beta, double x) {
	       
		final int MAXITER = 500;
        final double EPS = 3.0E-7;

        double aplusb = alpha + beta;
        double aplus1 = alpha + 1.0;
        double aminus1 = alpha - 1.0;
        double c = 1.0;
        double d = 1.0 - aplusb * x / aplus1;
        if (Math.abs(d) < FPMIN) {
            d = FPMIN;
        }
        d = 1.0 / d;
        double h = d;
        double aa = 0.0;
        double del = 0.0;
        int i = 1, i2 = 0;
        boolean test = true;
        while (test) {
            i2 = 2 * i;
            aa = i * (beta - i) * x / ((aminus1 + i2) * (alpha + i2));
            d = 1.0 + aa * d;
            if (Math.abs(d) < FPMIN) {
                d = FPMIN;
            }
            c = 1.0 + aa / c;
            if (Math.abs(c) < FPMIN) {
                c = FPMIN;
            }
            d = 1.0 / d;
            h *= d * c;
            aa = -(alpha + i) * (aplusb + i) * x / ((alpha + i2) * (aplus1 + i2));
            d = 1.0 + aa * d;
            if (Math.abs(d) < FPMIN) {
                d = FPMIN;
            }
            c = 1.0 + aa / c;
            if (Math.abs(c) < FPMIN) {
                c = FPMIN;
            }
            d = 1.0 / d;
            del = d * c;
            h *= del;
            i++;
            if (Math.abs(del - 1.0) < EPS) {
                test = false;
            }
            if (i > MAXITER) {
                test = false;
            }
        }
        return h;
	}

	private static double var(double[] x) {
		
		 if (x.length < 2) {
	            throw new IllegalArgumentException("Array length is less than 2.");
	        }
	
	        double sum = 0.0;
	        double sumsq = 0.0;
	        for (double xi : x) {
	            sum += xi;
	            sumsq += xi * xi;
	        }
	
	        int n = x.length - 1;
	        return sumsq / n - (sum / x.length) * (sum / n);
	    }
		

}
