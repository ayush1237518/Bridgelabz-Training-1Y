
package com.gla.arrays;

import java.util.Scanner;

public class CompareStrings {

    public static int compare(String s1, String s2) {
        int len = s1.length() < s2.length() ? s1.length() : s2.length();

        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i);
            }
        }
        return s1.length() - s2.length();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int result = compare(s1, s2);

        if (result < 0) {
            System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
        } else if (result > 0) {
            System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographical order");
        } else {
            System.out.println("Both strings are equal");
        }
    }
}
