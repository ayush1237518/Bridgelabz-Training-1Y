
package com.gla.interfaces-abstraction;

import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {

        Predicate<Double> alert = temp -> temp > 37.5;

        System.out.println(alert.test(36.5));
        System.out.println(alert.test(38.2));
    }
}
