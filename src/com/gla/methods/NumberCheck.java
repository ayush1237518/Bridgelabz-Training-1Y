
package com.gla.methods;

import java.util.Scanner;

public class NumberCheck {

    public static boolean isPositive(int n) {
        return n >= 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int n1, int n2) {
        if (n1 > n2) return 1;
        if (n1 == n2) return 0;
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (isPositive(arr[i])) {
                if (isEven(arr[i])) {
                    System.out.println(arr[i] + " Positive Even");
                } else {
                    System.out.println(arr[i] + " Positive Odd");
                }
            } else {
                System.out.println(arr[i] + " Negative");
            }
        }

        int result = compare(arr[0], arr[arr.length - 1]);

        if (result == 1) {
            System.out.println("First element is greater than last");
        } else if (result == 0) {
            System.out.println("First element is equal to last");
        } else {
            System.out.println("First element is less than last");
        }

    }
    
}
