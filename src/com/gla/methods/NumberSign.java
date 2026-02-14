
package com.gla.methods;

import java.util.Scanner;

public class NumberSign {

    public static int checkNumber(int n) {
        if (n > 0) return 1;
        if (n < 0) return -1;
        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int result = checkNumber(num);

        if (result == 1) {
            System.out.println("Positive");
        } else if (result == -1) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

    }
    
}
