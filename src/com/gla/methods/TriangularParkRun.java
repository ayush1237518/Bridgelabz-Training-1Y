
package com.gla.methods;

import java.util.Scanner;

public class TriangularParkRun {

    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double distance = 5000;
        return distance / perimeter;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        double rounds = calculateRounds(side1, side2, side3);

        System.out.println("Number of rounds needed: " + rounds);
    }
    
}
