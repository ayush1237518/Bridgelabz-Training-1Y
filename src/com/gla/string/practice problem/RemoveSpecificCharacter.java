
package com.gla.arrays;

import java.util.Scanner;

public class RemoveSpecificCharacter {

    public static String removeChar(String text, char remove) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != remove) {
                result = result + text.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char remove = sc.next().charAt(0);

        System.out.println("Modified String: \"" + removeChar(text, remove) + "\"");
    }
}
