
package com.gla.methods;

import java.util.Scanner;

public class NumberChecker01 {

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
        int count = countDigits(n);
        int[] digits = new int[count];

        n = Math.abs(n);
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrongNumber(int n, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], power);
        }
        return sum == Math.abs(n);
    }

    public static int[] findLargestSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest) {
                second = largest;
                largest = digits[i];
            } else if (digits[i] > second && digits[i] != largest) {
                second = digits[i];
            }
        }
        return new int[]{largest, second};
    }

    public static int[] findSmallestSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < smallest) {
                second = smallest;
                smallest = digits[i];
            } else if (digits[i] < second && digits[i] != smallest) {
                second = digits[i];
            }
        }
        return new int[]{smallest, second};
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

        System.out.println("Duck Number: " + isDuckNumber(digits));
        System.out.println("Armstrong Number: " + isArmstrongNumber(number, digits));

        int[] large = findLargestSecondLargest(digits);
        int[] small = findSmallestSecondSmallest(digits);

        System.out.println("Largest: " + large[0]);
        System.out.println("Second Largest: " + large[1]);

        System.out.println("Smallest: " + small[0]);
        System.out.println("Second Smallest: " + small[1]);
    }
    
}
