
package com.gla.methods;

import java.util.Scanner;

public class StudentScoreCard {

    public static int[][] generatePCM(int n) {
        int[][] marks = new int[n][3];

        for (int i = 0; i < n; i++) {
            marks[i][0] = 10 + (int)(Math.random() * 90);
            marks[i][1] = 10 + (int)(Math.random() * 90);
            marks[i][2] = 10 + (int)(Math.random() * 90);
        }
        return marks;
    }

    public static double[][] calculateStats(int[][] marks) {
        double[][] result = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = avg;

            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }

    public static String[] getGradeAndRemarks(double percent) {

        if (percent >= 80)
            return new String[]{"A", "Level 4 above agency-normalized standards"};

        else if (percent >= 70)
            return new String[]{"B", "Level 3 at agency-normalized standards"};

        else if (percent >= 60)
            return new String[]{"C", "Level 2 below but approaching agency-normalized standards"};

        else if (percent >= 50)
            return new String[]{"D", "Level 1 well below agency-normalized standards"};

        else if (percent >= 40)
            return new String[]{"E", "Level 1- to below agency-normalized standards"};

        else
            return new String[]{"F", "Remedial standards"};
    }

    public static void display(int[][] marks, double[][] stats) {

        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPercent\tGrade\tRemarks");

        for (int i = 0; i < marks.length; i++) {

            String[] gradeInfo = getGradeAndRemarks(stats[i][2]);

            System.out.println(
                    marks[i][0] + "\t" +
                            marks[i][1] + "\t" +
                            marks[i][2] + "\t" +
                            (int)stats[i][0] + "\t" +
                            stats[i][1] + "\t" +
                            stats[i][2] + "\t" +
                            gradeInfo[0] + "\t" +
                            gradeInfo[1]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] marks = generatePCM(n);
        double[][] stats = calculateStats(marks);

        display(marks, stats);
    }
    
}
