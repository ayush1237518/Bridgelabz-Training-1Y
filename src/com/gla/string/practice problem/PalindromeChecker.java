
package com.gla.arrays;

import java.util.Scanner;

public class PalindromeChecker {

    public static String takeInput(Scanner sc) {
        return sc.nextLine();
    }

    public static boolean isPalindrome(String text) {
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

    public static void displayResult(boolean result) {
        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = takeInput(sc);
        boolean result = isPalindrome(text);
        displayResult(result);
    }
}
