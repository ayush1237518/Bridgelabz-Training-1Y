package com.gla.exception-handling.problem4;

public class ArrayAccess {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        try {
            int index = 5;
            System.out.println("Value: " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}