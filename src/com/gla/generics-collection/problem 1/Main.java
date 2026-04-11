
package com.gla.generics-collections;

public class Main {
    public static void main(String[] args) {
        Box<Integer> b = new Box<>();
        b.set(10);
        System.out.println(b.get());
    }
}
