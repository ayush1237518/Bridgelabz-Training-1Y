
package com.gla.methods;

import java.util.Scanner;

public class SumNaturalNumbers {

    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = findSum(n);

        System.out.println("Sum of " + n + " natural numbers is " + result);
    }
    
}
