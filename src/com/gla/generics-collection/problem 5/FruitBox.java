
package com.gla.generics-collections;

public class FruitBox<T extends Fruit> {
    public void add(T f) {
        System.out.println("Added: " + f.getClass().getSimpleName());
    }
}
