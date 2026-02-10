
package com.gla.arrays;

import java.util.Scanner;

public class MostFrequentCharacter {

    public static char mostFrequent(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char result = text.charAt(0);
        int max = freq[result];

        for (int i = 1; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] > max) {
                max = freq[ch];
                result = ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println("Most Frequent Character: '" + mostFrequent(text) + "'");
    }
}
