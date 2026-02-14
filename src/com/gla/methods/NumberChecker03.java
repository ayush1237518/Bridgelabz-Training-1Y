
package com.gla.methods;

import java.util.Scanner;

public class NumberChecker03 {

    public static int countDigits(int n) {
        n = Math.abs(n);
        if (n == 0) return 1;

        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static int[] getDigitsArray(int n) {
        int size = countDigits(n);
        int[] digits = new int[size];

        n = Math.abs(n);
        for (int i = size - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        int k = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            rev[k++] = arr[i];
        }
        return rev;
    }

    public static boolean compareArrays(int[] a, int[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static boolean isPalindromeNumber(int[] digits) {
        int[] reversed = reverseArray(digits);
        return compareArrays(digits, reversed);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int count = countDigits(number);
        int[] digits = getDigitsArray(number);

        System.out.println("Digit Count: " + count);

        System.out.print("Digits: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        int[] reversed = reverseArray(digits);
        System.out.print("Reversed Digits: ");
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i] + " ");
        }
        System.out.println();

        System.out.println("Palindrome Number: " + isPalindromeNumber(digits));
        System.out.println("Duck Number: " + isDuckNumber(digits));
    }
    
}
