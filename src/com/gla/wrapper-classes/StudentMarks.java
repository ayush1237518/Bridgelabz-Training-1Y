
package com.gla.wrapper-classes;

import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {

        String[] inputs = {"85", "95", "88", "null", "abc"};

        ArrayList<Integer> list = new ArrayList<>();

        for (String s : inputs) {
            try {
                if (!s.equals("null")) {
                    list.add(Integer.parseInt(s));
                }
            } catch (NumberFormatException e) {
                // ignore invalid
            }
        }

        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }

        double avg = (double) sum / list.size();

        System.out.println("Average Marks: " + avg);
    }
}
