
package com.gla.wrapper-classes;

public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double d = 45.67;

        double primitiveDouble = d;
        int intValue = (int) primitiveDouble;

        System.out.println("Double: " + primitiveDouble);
        System.out.println("Int: " + intValue);
    }
}
