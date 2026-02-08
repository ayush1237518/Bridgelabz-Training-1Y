package com.gla.arrays;


import java.util.Scanner;

public class StringComparison {

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

        String str1 = sc.next();
        String str2 = sc.next();

        boolean charAtResult = compareUsingCharAt(str1, str2);
        boolean equalsResult = str1.equals(str2);

        System.out.println(charAtResult);
        System.out.println(equalsResult);

        if (charAtResult == equalsResult) {
            System.out.println("Same result");
        } else {
            System.out.println("Different result");
        }
    }
}