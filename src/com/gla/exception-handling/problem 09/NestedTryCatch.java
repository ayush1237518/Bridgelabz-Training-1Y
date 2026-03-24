package com.gla.exception-handling.problem9;

public class NestedTryCatch {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        try {
            int index = 5;

            try {
                int value = arr[index];
                int result = value / 0;
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}