package com.gla.generics-collections;

import java.util.*;

public class NumberUtil {
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) sum += n.doubleValue();
        return sum;
    }
}
