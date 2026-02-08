package com.gla.string;

public class CharArrayComparison {
    public static char[] getCharsUsingMethod(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    public static boolean compareCharArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) {
            return false;
        }

        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        char[] userArray = getCharsUsingMethod(text);
        char[] builtInArray = text.toCharArray();

        boolean result = compareCharArrays(userArray, builtInArray);

        for (char c : userArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        for (char c : builtInArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        if (result) {
            System.out.println("Same result");
        } else {
            System.out.println("Different result");
        }
    }
}
