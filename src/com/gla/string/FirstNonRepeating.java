
package com.gla.arrays;

import java.util.Scanner;

public class FirstNonRepeating {

    public static char findFirstNonRepeating(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '\0';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        char ch = findFirstNonRepeating(text);

        if (ch != '\0') {
            System.out.println(ch);
        } else {
            System.out.println("No non-repeating character");
        }
    }
}
