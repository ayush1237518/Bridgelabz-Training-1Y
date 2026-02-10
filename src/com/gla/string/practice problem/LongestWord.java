
package com.gla.arrays;

import java.util.Scanner;

public class LongestWord {

    public static String findLongestWord(String text) {
        String longest = "";
        String word = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == ' ') {
                if (word.length() > longest.length()) {
                    longest = word;
                }
                word = "";
            } else {
                word = word + ch;
            }
        }

        if (word.length() > longest.length()) {
            longest = word;
        }

        return longest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println(findLongestWord(text));
    }
}
