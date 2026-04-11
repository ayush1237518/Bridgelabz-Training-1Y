
package com.gla.generics-collections;

import java.util.*;

public class Cart<T> {
    List<T> items = new ArrayList<>();

    public void addItem(T item){ items.add(item); }
    public void removeItem(T item){ items.remove(item); }

    public void displayItems(){
        for(T i:items) System.out.println(i);
    }
}
