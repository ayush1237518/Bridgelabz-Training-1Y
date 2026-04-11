
package com.gla.generics-collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Storage<Electronics> storage = new Storage<>();
        storage.add(new Electronics());
        storage.displayItems();

        List<Groceries> list = Arrays.asList(new Groceries(), new Groceries());
        Storage.displayAll(list);
    }
}
