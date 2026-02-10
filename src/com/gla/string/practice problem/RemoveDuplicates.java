
package com.gla.arrays;

import java.util.Scanner;

public class RemoveDuplicates {

    public static String removeDuplicates(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (ch == text.charAt(j)) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                result = result + ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println(removeDuplicates(text));
    }
}
