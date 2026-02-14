
package com.gla.methods;

public class MatrixAdvanced {

    public static double[][] createRandomMatrix(int n) {
        double[][] m = new double[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                m[i][j] = (int)(Math.random() * 5) + 1;

        return m;
    }

    public static double[][] transpose(double[][] m) {
        int n = m.length;
        double[][] t = new double[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                t[j][i] = m[i][j];

        return t;
    }

    public static double det2x2(double[][] m) {
        return m[0][0]*m[1][1] - m[0][1]*m[1][0];
    }

    public static double det3x3(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1])
                - m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0])
                + m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    public static double[][] inverse2x2(double[][] m) {
        double det = det2x2(m);

        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1]/det;
        inv[0][1] = -m[0][1]/det;
        inv[1][0] = -m[1][0]/det;
        inv[1][1] = m[0][0]/det;

        return inv;
    }

    public static void display(double[][] m) {
        for (double[] row : m) {
            for (double v : row)
                System.out.print(v + " ");
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        double[][] m2 = createRandomMatrix(2);
        double[][] m3 = createRandomMatrix(3);

        System.out.println("2x2 Matrix:");
        display(m2);

        System.out.println("Transpose:");
        display(transpose(m2));

        System.out.println("Determinant 2x2: " + det2x2(m2));
        System.out.println("Inverse 2x2:");
        display(inverse2x2(m2));

        System.out.println("3x3 Matrix:");
        display(m3);

        System.out.println("Determinant 3x3: " + det3x3(m3));
    }
    
}
