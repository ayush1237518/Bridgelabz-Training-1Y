
package com.gla.methods;

import java.util.Scanner;

public class MatrixOperations {

    public static int[][] createRandomMatrix(int r, int c) {
        int[][] m = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = (int)(Math.random() * 10);

        return m;
    }

    public static int[][] add(int[][] A, int[][] B) {
        int[][] C = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                C[i][j] = A[i][j] + B[i][j];

        return C;
    }

    public static int[][] subtract(int[][] A, int[][] B) {
        int[][] C = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                C[i][j] = A[i][j] - B[i][j];

        return C;
    }

    public static int[][] multiply(int[][] A, int[][] B) {
        int[][] C = new int[A.length][B[0].length];

        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < B[0].length; j++)
                for (int k = 0; k < B.length; k++)
                    C[i][j] += A[i][k] * B[k][j];

        return C;
    }

    public static void display(int[][] m) {
        for (int[] row : m) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] A = createRandomMatrix(r, c);
        int[][] B = createRandomMatrix(r, c);

        System.out.println("Matrix A:");
        display(A);

        System.out.println("Matrix B:");
        display(B);

        System.out.println("Addition:");
        display(add(A, B));

        System.out.println("Subtraction:");
        display(subtract(A, B));

        if (c == r) {
            System.out.println("Multiplication:");
            display(multiply(A, B));
        } else {
            System.out.println("Multiplication not possible (dimension mismatch)");
        }

    }
    
}
