
package com.gla.arrays;

import java.util.Scanner;

public class UpperCaseConversion {

    public static String toUpperCaseUsingCharAt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result = result + ch;
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
        String text = sc.nextLine();

        String userUpper = toUpperCaseUsingCharAt(text);
        String builtInUpper = text.toUpperCase();

        boolean result = compareUsingCharAt(userUpper, builtInUpper);

        System.out.println(userUpper);
        System.out.println(builtInUpper);

        if (result) {
            System.out.println("Same result");
        } else {
            System.out.println("Different result");
        }
    }
}
