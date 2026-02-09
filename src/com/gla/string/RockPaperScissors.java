
package com.gla.arrays;

import java.util.Scanner;

public class RockPaperScissors {

    public static String getComputerChoice() {
        int r = (int) (Math.random() * 3);
        if (r == 0) return "rock";
        if (r == 1) return "paper";
        return "scissors";
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";

        if (user.equals("rock") && comp.equals("scissors")) return "User";
        if (user.equals("rock") && comp.equals("paper")) return "Computer";

        if (user.equals("paper") && comp.equals("rock")) return "User";
        if (user.equals("paper") && comp.equals("scissors")) return "Computer";

        if (user.equals("scissors") && comp.equals("paper")) return "User";
        if (user.equals("scissors") && comp.equals("rock")) return "Computer";

        return "Invalid";
    }

    public static String[][] getStats(int userWin, int compWin, int games) {
        String[][] stats = new String[2][3];

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWin);
        stats[0][2] = String.valueOf((userWin * 100.0) / games);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWin);
        stats[1][2] = String.valueOf((compWin * 100.0) / games);

        return stats;
    }

    public static void display(String[][] games, String[][] stats) {

        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 0; i < games.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                            games[i][0] + "\t" +
                            games[i][1] + "\t\t" +
                            games[i][2]
            );
        }

        System.out.println("\nPlayer\tWins\tPercentage");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(
                    stats[i][0] + "\t" +
                            Integer.parseInt(stats[i][1]) + "\t" +
                            Double.parseDouble(stats[i][2])
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();

        String[][] gameResult = new String[games][3];
        int userWin = 0, compWin = 0;

        for (int i = 0; i < games; i++) {
            String user = sc.next().toLowerCase();
            String comp = getComputerChoice();
            String winner = findWinner(user, comp);

            gameResult[i][0] = user;
            gameResult[i][1] = comp;
            gameResult[i][2] = winner;

            if (winner.equals("User")) userWin++;
            if (winner.equals("Computer")) compWin++;
        }

        String[][] stats = getStats(userWin, compWin, games);
        display(gameResult, stats);
    }
}
