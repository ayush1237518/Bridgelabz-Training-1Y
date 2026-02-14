
package com.gla.methods;

import java.util.Scanner;

public class CollinearPoints {

    public static boolean isCollinearSlope(double x1, double y1,
                                           double x2, double y2,
                                           double x3, double y3) {

        return (y2 - y1) * (x3 - x1) == (y3 - y1) * (x2 - x1);
    }

    public static boolean isCollinearArea(double x1, double y1,
                                          double x2, double y2,
                                          double x3, double y3) {

        double area = 0.5 * (x1 * (y2 - y3)
                + x2 * (y3 - y1)
                + x3 * (y1 - y2));

        return area == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        System.out.println("Using Slope Method: " +
                isCollinearSlope(x1, y1, x2, y2, x3, y3));

        System.out.println("Using Area Method: " +
                isCollinearArea(x1, y1, x2, y2, x3, y3));
    }
    
}
