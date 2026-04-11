
package com.gla.generics-collections.problem07;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Number> dest = new ArrayList<>();
        List<Integer> src = Arrays.asList(1,2,3);
        ListUtil.copyList(dest,src);
        System.out.println(dest);
    }
}
