
package com.gla.methods;

import java.util.Scanner;

public class NumberChecker05 {

    public static int sumOfProperDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum;
    }

    public static boolean isPerfect(int n) {
        return n > 0 && sumOfProperDivisors(n) == n;
    }

    public static boolean isAbundant(int n) {
        return sumOfProperDivisors(n) > n;
    }

    public static boolean isDeficient(int n) {
        return sumOfProperDivisors(n) < n;
    }

    public static int factorial(int x) {
        int f = 1;
        for (int i = 1; i <= x; i++) f *= i;
        return f;
    }

    public static boolean isStrong(int n) {
        int sum = 0;
        int temp = n;

        while (temp > 0) {
            int d = temp % 10;
            sum += factorial(d);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println("Perfect: " + isPerfect(number));
        System.out.println("Abundant: " + isAbundant(number));
        System.out.println("Deficient: " + isDeficient(number));
        System.out.println("Strong: " + isStrong(number));
    }
    
}
