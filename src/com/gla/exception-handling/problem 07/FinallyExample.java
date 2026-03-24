package com.gla.exception-handling.problem7;

public class FinallyExample {
    public static void main(String[] args) {

        try {
            int a = 10, b = 0;
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        } finally {
            System.out.println("Operation completed");
        }
    }
}