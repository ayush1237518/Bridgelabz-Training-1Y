
package com.gla.methods;

import java.util.Scanner;

public class NumberChecker04 {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;

        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }

    public static boolean isSpy(int n) {
        int sum = 0;
        int product = 1;
        int temp = Math.abs(n);

        if (temp == 0) product = 0;

        while (temp > 0) {
            int d = temp % 10;
            sum += d;
            product *= d;
            temp /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int n) {
        int square = n * n;
        int temp = n;

        while (temp > 0) {
            if (temp % 10 != square % 10) return false;
            temp /= 10;
            square /= 10;
        }
        return true;
    }

    public static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println("Prime: " + isPrime(number));
        System.out.println("Neon: " + isNeon(number));
        System.out.println("Spy: " + isSpy(number));
        System.out.println("Automorphic: " + isAutomorphic(number));
        System.out.println("Buzz: " + isBuzz(number));
    }
    
}
