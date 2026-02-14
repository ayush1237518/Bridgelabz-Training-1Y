
package com.gla.methods;

import java.util.Scanner;

public class SumNaturalRecursive {

    public static int sumRecursive(int n) {
        if (n <= 1) return n;
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter a natural number");
            return;
        }

        int r1 = sumRecursive(n);
        int r2 = sumFormula(n);

        System.out.println("Sum using recursion: " + r1);
        System.out.println("Sum using formula: " + r2);

        if (r1 == r2) {
            System.out.println("Both results are same");
        } else {
            System.out.println("Results are different");
        }

    }
    
}
