
package com.gla.wrapper-classes;

import java.util.ArrayList;

public class CollectionsWrapper {
    public static void main(String[] args) {

        double[] prices = {10.5, 20.0, 35.75, 5.5};

        ArrayList<Double> list = new ArrayList<>();

        for (double p : prices) {
            list.add(p);
        }

        double max = Double.MIN_VALUE;
        double sum = 0;

        for (Double val : list) {
            if (val > max) {
                max = val;
            }
            sum += val;
        }

        double avg = sum / list.size();

        System.out.println("Highest: " + max);
        System.out.println("Average: " + avg);
    }
}
