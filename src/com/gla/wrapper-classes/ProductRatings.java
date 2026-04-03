
package com.gla.wrapper-classes;

import java.util.*;

public class ProductRatings {
    public static void main(String[] args) {

        int[] arr = {4, 5, 3};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, null, 4));

        ArrayList<Integer> combined = new ArrayList<>();

        for (int i : arr) {
            combined.add(i);
        }

        for (Integer i : list) {
            if (Objects.nonNull(i)) {
                combined.add(i);
            }
        }

        int sum = 0;
        for (Integer i : combined) {
            sum += i;
        }

        double avg = (double) sum / combined.size();

        System.out.println("Average Rating: " + avg);
    }
}
