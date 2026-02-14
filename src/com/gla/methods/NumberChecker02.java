
package com.gla.methods;

import java.util.Scanner;

public class NumberChecker02 {

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

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }
        return sum;
    }

    public static double sumOfSquares(int[] digits) {
        double sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int n, int[] digits) {
        int sum = sumOfDigits(digits);
        if (sum == 0) return false;
        return Math.abs(n) % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10];

        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]]++;
        }

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) count++;
        }

        int[][] result = new int[count][2];
        int k = 0;

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                result[k][0] = i;
                result[k][1] = freq[i];
                k++;
            }
        }
        return result;
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

        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: " + sumOfSquares(digits));
        System.out.println("Harshad Number: " + isHarshadNumber(number, digits));

        int[][] freq = digitFrequency(digits);

        System.out.println("Digit\tFrequency");
        for (int i = 0; i < freq.length; i++) {
            System.out.println(freq[i][0] + "\t" + freq[i][1]);
        }

    }
    
}
