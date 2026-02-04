
package com.gla.arrays;

import java.util.Scanner;

public class TwoDArray
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int r, c;
        System.out.println("Enter rows");
        r = sc.nextInt();
        System.out.println("Enter columns");
        c = sc.nextInt();

        int a[][] = new int[r][c];


        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }


        int arr[] = new int[r * c];
        int k = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[k] = a[i][j];
                k++;
            }
        }

        System.out.println("1D Array elements");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }ss
    }
}
