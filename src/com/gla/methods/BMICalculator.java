
package com.gla.methods;

import java.util.Scanner;

public class BMICalculator {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightMeters = data[i][1] / 100.0;
            data[i][2] = weight / (heightMeters * heightMeters);
        }
    }

    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi < 18.5) status[i] = "Underweight";
            else if (bmi < 25) status[i] = "Normal";
            else if (bmi < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        return status;
    }

    public static void display(double[][] data, String[] status) {
        System.out.println("Weight\tHeight\tBMI\tStatus");
        for (int i = 0; i < data.length; i++) {
            System.out.println(
                    data[i][0] + "\t" +
                            data[i][1] + "\t" +
                            data[i][2] + "\t" +
                            status[i]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] persons = new double[10][3];

        for (int i = 0; i < persons.length; i++) {
            persons[i][0] = sc.nextDouble();
            persons[i][1] = sc.nextDouble();
        }

        calculateBMI(persons);
        String[] status = getBMIStatus(persons);
        display(persons, status);
        
    }

}
