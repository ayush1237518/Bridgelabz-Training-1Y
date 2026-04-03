
package com.gla.wrapper-classes;

public class SafeParse {

    public static int safeParseInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(safeParseInt("123"));
        System.out.println(safeParseInt("abc"));
        System.out.println(safeParseInt("45.6"));
        System.out.println(safeParseInt("0"));
    }
}
