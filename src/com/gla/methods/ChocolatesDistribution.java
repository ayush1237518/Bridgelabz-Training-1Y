
package com.gla.methods;

import java.util.Scanner;

public class ChocolatesDistribution {

    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int eachChild = number / divisor;
        int remaining = number % divisor;

        return new int[]{eachChild, remaining};
    }

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfChocolates = sc.nextInt();
        int numberOfChildren = sc.nextInt();

        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        System.out.println("Chocolates each child gets: " + result[0]);
        System.out.println("Remaining chocolates: " + result[1]);
    }
}
