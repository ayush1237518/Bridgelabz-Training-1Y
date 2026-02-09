
package com.gla.arrays;

import java.util.Scanner;

public class ShortestLongestWord {

    public static int findLength(String s) {
        int c = 0;
        try {
            while (true) {
                s.charAt(c);
                c++;
            }
        } catch (RuntimeException e) {
            return c;
        }
    }

    public static String[] splitUsingCharAt(String text) {
        int words = 1;
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') {
                words++;
            }
        }

        String[] arr = new String[words];
        String word = "";
        int k = 0;

        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') {
                arr[k++] = word;
                word = "";
            } else {
                word = word + text.charAt(i);
            }
        }
        arr[k] = word;
        return arr;
    }

    public static String[][] wordWithLength(String[] words) {
        String[][] data = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }
        return data;
    }

    public static int[] shortestLongest(String[][] data) {
        int min = Integer.parseInt(data[0][1]);
        int max = Integer.parseInt(data[0][1]);
        int minIndex = 0, maxIndex = 0;

        for (int i = 1; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);
            if (len < min) {
                min = len;
                minIndex = i;
            }
            if (len > max) {
                max = len;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitUsingCharAt(text);
        String[][] data = wordWithLength(words);
        int[] result = shortestLongest(data);

        System.out.println("Shortest Word: " + data[result[0]][0]);
        System.out.println("Longest Word: " + data[result[1]][0]);
    }
}
