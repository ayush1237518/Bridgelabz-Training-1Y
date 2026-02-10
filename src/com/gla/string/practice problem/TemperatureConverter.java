
package com.gla.arrays;

import java.util.Scanner;

public class TemperatureConverter {

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double temp = sc.nextDouble();
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println(fahrenheitToCelsius(temp));
        } else if (choice == 2) {
            System.out.println(celsiusToFahrenheit(temp));
        }
    }
}
