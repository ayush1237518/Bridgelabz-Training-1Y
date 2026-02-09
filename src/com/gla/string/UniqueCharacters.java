
package com.gla.arrays;

import java.util.Scanner;

public class UniqueCharacters {

    public static int findLength(String text) {
        int c = 0;
        try {
            while (true) {
                text.charAt(c);
                c++;
            }
        } catch (RuntimeException e) {
            return c;
        }
    }

    public static char[] findUnique(String text) {
        int len = findLength(text);
        char[] temp = new char[len];
        int count = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (ch == text.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                temp[count++] = ch;
            }
        }

        char[] result = new char[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        char[] unique = findUnique(text);

        for (int i = 0; i < unique.length; i++) {
            System.out.print(unique[i] + " ");
        }
    }
}
