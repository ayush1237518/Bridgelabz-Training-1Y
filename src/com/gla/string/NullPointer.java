
package com.gla.arrays;


public class NullPointerDemo {

    public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }

    public static void main(String[] args) {

        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception generated");
        }

        handleException();
    }
}
