
package com.gla.arrays;

import java.util.Scanner;

public class FactorialRecursion {

    public static int takeInput(Scanner sc) {
        return sc.nextInt();
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void displayResult(int n, int result) {
        System.out.println("Factorial of " + n + " is " + result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = takeInput(sc);
        int result = factorial(n);
        displayResult(n, result);
    }
}
