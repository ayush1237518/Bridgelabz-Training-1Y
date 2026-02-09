package com.gla.arrays;

import java.util.Scanner;

public class WordLength2D {

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
            return count;
        }
    }

    public static String[] splitUsingCharAt(String text) {
        int words = 1;
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') {
                words++;
            }
        }

        String[] result = new String[words];
        String word = "";
        int index = 0;

        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') {
                result[index++] = word;
                word = "";
            } else {
                word = word + text.charAt(i);
            }
        }
        result[index] = word;

        return result;
    }

    public static String[][] getWordLength2D(String[] words) {
        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }

        return data;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitUsingCharAt(text);
        String[][] result = getWordLength2D(words);

        System.out.println("Word\tLength");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + Integer.parseInt(result[i][1]));
        }
    }
}