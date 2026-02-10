
package com.gla.arrays;

import java.util.Scanner;

public class NumberGuessingGame {

    public static int generateGuess(int low, int high) {
        return low + (int) (Math.random() * (high - low + 1));
    }

    public static String getFeedback(Scanner sc) {
        return sc.next();
    }

    public static void updateRange(String feedback, int guess, int[] range) {
        if (feedback.equals("low")) {
            range[0] = guess + 1;
        } else if (feedback.equals("high")) {
            range[1] = guess - 1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int low = 1;
        int high = 100;
        int guess;
        String feedback;

        System.out.println("Think of a number between 1 and 100");

        while (true) {
            guess = generateGuess(low, high);
            System.out.println("Computer guess: " + guess);
            System.out.println("Enter feedback (low / high / correct):");

            feedback = getFeedback(sc);

            if (feedback.equals("correct")) {
                System.out.println("Computer guessed correctly!");
                break;
            }

            int[] range = {low, high};
            updateRange(feedback, guess, range);
            low = range[0];
            high = range[1];
        }
    }
}
