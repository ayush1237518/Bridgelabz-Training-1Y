
package com.gla.interfaces-abstraction;

import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {

        Function<String, Integer> lengthChecker = str -> str.length();

        System.out.println(lengthChecker.apply("Hello"));
        System.out.println(lengthChecker.apply("This is a long message"));
    }
}
