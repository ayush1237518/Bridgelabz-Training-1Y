
package com.gla.arrays;

import java.util.Scanner;

public class ReplaceWord {

    public static String replace(String text, String oldWord, String newWord) {
        String result = "";
        int i = 0;

        while (i <= text.length() - oldWord.length()) {
            boolean match = true;

            for (int j = 0; j < oldWord.length(); j++) {
                if (text.charAt(i + j) != oldWord.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                result = result + newWord;
                i = i + oldWord.length();
            } else {
                result = result + text.charAt(i);
                i++;
            }
        }

        while (i < text.length()) {
            result = result + text.charAt(i);
            i++;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String oldWord = sc.next();
        String newWord = sc.next();

        System.out.println(replace(text, oldWord, newWord));
    }
}
