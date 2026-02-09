
package com.gla.arrays;

import java.util.Scanner;

public class PalindromeCheck {

    public static boolean isPalindromeLogic1(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeLogic2(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeLogic2(text, start + 1, end - 1);
    }

    public static char[] reverseUsingCharAt(String text) {
        char[] rev = new char[text.length()];
        int k = 0;

        for (int i = text.length() - 1; i >= 0; i--) {
            rev[k++] = text.charAt(i);
        }
        return rev;
    }

    public static boolean isPalindromeLogic3(String text) {
        char[] original = text.toCharArray();
        char[] reverse = reverseUsingCharAt(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println(isPalindromeLogic1(text));
        System.out.println(isPalindromeLogic2(text, 0, text.length() - 1));
        System.out.println(isPalindromeLogic3(text));
    }
}
