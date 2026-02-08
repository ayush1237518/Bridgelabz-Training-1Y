
package com.gla.arrays;

import java.util.Scanner;

public class SubstringComparison {

    public static String substringUsingCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result = result + str.charAt(i);
        }
        return result;
    }

    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String charAtSubstring = substringUsingCharAt(text, start, end);
        String builtInSubstring = text.substring(start, end);

        boolean result = compareUsingCharAt(charAtSubstring, builtInSubstring);

        System.out.println(charAtSubstring);
        System.out.println(builtInSubstring);

        if (result) {
            System.out.println("Same result");
        } else {
            System.out.println("Different result");
        }
    }
}
