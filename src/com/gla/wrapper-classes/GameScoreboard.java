
package com.gla.wrapper-classes;

public class GameScoreboard {
    public static void main(String[] args) {

        Integer[] scores = {10, null, 20, null, 30};

        int notPlayed = 0;
        int total = 0;

        for (Integer score : scores) {
            if (score == null) {
                notPlayed++;
            } else {
                total += score;
            }
        }

        System.out.println("Not Played: " + notPlayed);
        System.out.println("Total Score: " + total);
    }
}
