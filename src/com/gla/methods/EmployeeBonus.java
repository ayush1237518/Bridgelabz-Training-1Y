
package com.gla.methods;

public class EmployeeBonus {

    public static double[][] generateSalaryAndService(int n) {
        double[][] data = new double[n][2];

        for (int i = 0; i < n; i++) {
            data[i][0] = 10000 + (int)(Math.random() * 90000);
            data[i][1] = 1 + (int)(Math.random() * 10);
        }
        return data;
    }

    public static double[][] calculateNewSalaryAndBonus(double[][] data) {
        double[][] result = new double[data.length][3];

        for (int i = 0; i < data.length; i++) {
            double oldSalary = data[i][0];
            double years = data[i][1];

            double rate = (years > 5) ? 0.05 : 0.02;
            double bonus = oldSalary * rate;
            double newSalary = oldSalary + bonus;

            result[i][0] = oldSalary;
            result[i][1] = newSalary;
            result[i][2] = bonus;
        }
        return result;
    }

    public static void displaySummary(double[][] result) {

        double totalOld = 0;
        double totalNew = 0;
        double totalBonus = 0;

        System.out.println("Old Salary\tNew Salary\tBonus");

        for (int i = 0; i < result.length; i++) {
            System.out.println((int)result[i][0] + "\t\t" +
                    (int)result[i][1] + "\t\t" +
                    (int)result[i][2]);

            totalOld += result[i][0];
            totalNew += result[i][1];
            totalBonus += result[i][2];
        }

        System.out.println();
        System.out.println("Total Old Salary: " + (int)totalOld);
        System.out.println("Total New Salary: " + (int)totalNew);
        System.out.println("Total Bonus Paid: " + (int)totalBonus);
    }

    public static void main(String[] args) {

        double[][] data = generateSalaryAndService(10);
        double[][] result = calculateNewSalaryAndBonus(data);
        displaySummary(result);
    }
    
}
