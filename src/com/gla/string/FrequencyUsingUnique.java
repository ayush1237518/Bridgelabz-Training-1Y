
package com.gla.arrays;

import java.util.Scanner;

public class FrequencyUsingUnique {

    public static char[] uniqueCharacters(String text) {
        char[] temp = new char[text.length()];
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
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

        char[] unique = new char[count];
        for (int i = 0; i < count; i++) {
            unique[i] = temp[i];
        }
        return unique;
    }

    public static String[][] frequency(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] data = frequency(text);

        System.out.println("Character\tFrequency");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + Integer.parseInt(data[i][1]));
        }
    }
}
