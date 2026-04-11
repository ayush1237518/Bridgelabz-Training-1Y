
package com.gla.generics-collections.problem08;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(new Dog(),new Dog());
        AnimalUtil.printAnimals(dogs);
    }
}
