
package com.gla.arrays;

import java.util.Scanner;

public class StringLength {

    public static int findLengthUsingCharAt(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
            return count;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        int userLength = findLengthUsingCharAt(text);
        int builtInLength = text.length();

        System.out.println(userLength);
        System.out.println(builtInLength);
    }
}
