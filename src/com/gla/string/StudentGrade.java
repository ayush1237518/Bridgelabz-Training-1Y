
package com.gla.arrays;

import java.util.Scanner;

public class StudentGrade {

    public static int[][] generatePCM(int n) {
        int[][] pcm = new int[n][3];
        for (int i = 0; i < n; i++) {
            pcm[i][0] = 10 + (int) (Math.random() * 90);
            pcm[i][1] = 10 + (int) (Math.random() * 90);
            pcm[i][2] = 10 + (int) (Math.random() * 90);
        }
        return pcm;
    }

    public static double[][] calculateStats(int[][] pcm) {
        double[][] stats = new double[pcm.length][3];

        for (int i = 0; i < pcm.length; i++) {
            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            stats[i][0] = total;
            stats[i][1] = Math.round(avg * 100.0) / 100.0;
            stats[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return stats;
    }

    public static String[] calculateGrade(double[][] stats) {
        String[] grade = new String[stats.length];

        for (int i = 0; i < stats.length; i++) {
            double p = stats[i][2];

            if (p >= 80) grade[i] = "A (Level 4, above agency-normalized standards)";
            else if (p >= 70) grade[i] = "B (Level 3, at agency-normalized standards)";
            else if (p >= 60) grade[i] = "C (Level 2, below, but approaching agency-normalized standards)";
            else if (p >= 50) grade[i] = "D (Level 1, well below agency-normailized standards)";
            else if (p >= 40) grade[i] = "E (Level 1-, too below agency-normailized standards)";
            else if (p >= 40) grade[i] = "R (Remedial standards)";

        }
        return grade;
    }

    public static void display(int[][] pcm, double[][] stats, String[] grade) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        for (int i = 0; i < pcm.length; i++) {
            System.out.println(
                    pcm[i][0] + "\t" +
                            pcm[i][1] + "\t" +
                            pcm[i][2] + "\t" +
                            (int) stats[i][0] + "\t" +
                            stats[i][1] + "\t" +
                            stats[i][2] + "\t" +
                            grade[i]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();

        int[][] pcm = generatePCM(students);
        double[][] stats = calculateStats(pcm);
        String[] grade = calculateGrade(stats);

        display(pcm, stats, grade);
    }
}
