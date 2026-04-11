
package com.gla.generics-collections;

import java.util.*;

public class AnimalUtil {
    public static void printAnimals(List<? extends Animal> list) {
        for (Animal a : list)
            System.out.println(a.getClass().getSimpleName());
    }
}
