package by.it.sergeev.jd01_04;

public class Util {
    public static double maxIntArray(double[] mas){
        if (0 == mas.length)
        {
            return Integer.MAX_VALUE;
        }
        else
        {
            double max = mas[0];
            for (double m:mas)
            {
                if (max < m) max = m;
            }
            return max;
        }
    }
    public static double minIntArray(double[] mas){
        if (0 == mas.length)
        {
            return Integer.MIN_VALUE;
        }
        else
        {
            double min = mas[0];
            for (double m:mas)
            {
                if (min > m) min = m;
            }
            return min;
        }
    }
    public static double[] sortIntArray(double[] mas, boolean upDirection)
    {
        for (int i = 0; i < mas.length - 1; i++)
            for (int j= 0; j<mas.length - i - 1; j++)
                if ((upDirection && mas [j] > mas[j + 1])||(!upDirection && mas [j] < mas[j + 1]))
                {
                    double m=mas[j];
                    mas[j]=mas[j + 1];
                    mas[j + 1]=m;
                }
        return mas;
    }
    public static double[] arrayMulArray(double[][] x,double[] y)
    {
        double[] z = new double[x.length];
        for (int i = 0; i < x.length; i++)
            for (int j=0; j < y.length; j++)
                z[i] = z[i] + x[i][j]*y[j];
        return z;
    }
    public static double[][] arrayMulArray(double[][] x,double[][] y)
    {
        double[][] z = new double[x.length][y[0].length];
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < y[0].length; j++)
                for (int k = 0; k < y.length; k++)
                z[i][j] = z[i][j] + x[i][k]*y[k][j];
        return z;
    }
    private static double determinant = 1;
    public static double[] findRoot (double[][] mA, double [] mY, boolean showSteps)
    {
        int n = mA.length;
        double[][] m = new double[n][n+1];
        for (int row = 0; row < n; row++)
            for (int col = 0; col < n; col++)
            m[row][col]=mA[row][col];

        for (int row = 0; row < n; row++)
            m[row][n] = mY [row];
        if (showSteps) InOut.arrayPrint2D(m, "m");
        if (showSteps) InOut.arrayPrint2D(m);
        double k;

        for (int diag = 0; diag < n - 1; diag++)
        {
            for (int row = diag+1; row < n; row++)
            {
                k = m[row][diag]/m[diag][diag];
                for (int col = 0; col < n + 1; col++)
                    m[row][col] = m[row][col]-m[diag][col]*k;
            }
        }

        ///
        determinant =1;
            for (int diag = 0; diag < n; diag++)
        {
            determinant = determinant*m[diag][diag];
        }

        for (int diag = n -1; diag > 0; diag--)
        {
            for (int row = 0; row < diag; row++)
            {
                k = m[row][diag]/m[diag][diag];
                for (int col = 0; col < n + 1; col ++)
                    m[row][col] = m[row][col] - m[diag][col]*k;
            }
            if (showSteps) InOut.arrayPrint2D(m);
        }

        for (int i = 0; i < n; i++)
        {
            k=1/m[i][i];
            for (int j = 0; j < n+1; j++)
                m[i][j] = m[i][j]*k;
        }
        if (showSteps) InOut.arrayPrint2D(m);
        double[] x = new double[n];
        for (int i = 0; i < n; i++)
            x[i] = m[i][n];
        return x;
    }
    public static double findDeterminant (double[][]m)
    {
        return determinant;
    }
}
