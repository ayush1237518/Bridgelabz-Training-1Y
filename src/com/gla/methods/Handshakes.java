
package com.gla.methods;

import java.util.Scanner;

public class Handshakes {

    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfStudents = sc.nextInt();
        int result = calculateHandshakes(numberOfStudents);

        System.out.println("Maximum number of handshakes: " + result);
    }
    
}
