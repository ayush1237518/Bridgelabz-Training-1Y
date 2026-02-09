
package com.gla.arrays;

import java.util.Scanner;

public class VotingEligibility {

    public static int[] getAges(int n) {
        int[] ages = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }
        return ages;
    }

    public static String[][] checkVoting(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    public static void display(String[][] data) {
        System.out.println("Age\tCanVote");
        for (int i = 0; i < data.length; i++) {
            System.out.println(
                    Integer.parseInt(data[i][0]) + "\t" +
                            Boolean.parseBoolean(data[i][1])
            );
        }
    }

    public static void main(String[] args) {

        int[] ages = getAges(10);
        String[][] result = checkVoting(ages);
        display(result);
    }
}
