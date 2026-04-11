
package com.gla.generics-collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Mobile> list = Arrays.asList(new Mobile(10000), new Mobile(20000));
        System.out.println(PriceUtil.calculateTotal(list));
    }
}
