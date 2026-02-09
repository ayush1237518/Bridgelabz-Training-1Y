
package com.gla.arrays;

import java.util.Scanner;

public class CharacterFrequency {

    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] != 0) {
                count++;
                freq[text.charAt(i)] = -freq[text.charAt(i)];
            }
        }

        String[][] result = new String[count][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            int f = freq[text.charAt(i)];
            if (f < 0) {
                result[index][0] = String.valueOf(text.charAt(i));
                result[index][1] = String.valueOf(-f);
                freq[text.charAt(i)] = 0;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] data = findFrequency(text);

        System.out.println("Character\tFrequency");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + Integer.parseInt(data[i][1]));
        }
    }
}
