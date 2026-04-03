
package com.gla.wrapper-classes;

import java.util.ArrayList;

public class SensorLogger {

    public static void addValue(ArrayList<Double> list, double val) {
        list.add(val); // auto-boxing
    }

    public static void addValue(ArrayList<Double> list, Double val) {
        list.add(val);
    }

    public static void main(String[] args) {

        ArrayList<Double> data = new ArrayList<>();

        addValue(data, 25.5);
        addValue(data, Double.valueOf(30.2));

        for (Double d : data) {
            System.out.println(d); // auto-unboxing
        }
    }
}
