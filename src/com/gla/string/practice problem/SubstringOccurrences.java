
package com.gla.arrays;

import java.util.Scanner;

public class SubstringOccurrences {

    public static int countOccurrences(String text, String sub) {
        int count = 0;

        for (int i = 0; i <= text.length() - sub.length(); i++) {
            boolean match = true;

            for (int j = 0; j < sub.length(); j++) {
                if (text.charAt(i + j) != sub.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String sub = sc.nextLine();

        System.out.println(countOccurrences(text, sub));
    }
}
