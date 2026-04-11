
package com.gla.generics-collections;

import java.util.*;

public class Storage<T extends WarehouseItem> {
    List<T> items = new ArrayList<>();

    public void add(T item){
        items.add(item);
    }

    public void displayItems(){
        for(T item:items){
            System.out.println(item.getClass().getSimpleName());
        }
    }

    public static void displayAll(List<? extends WarehouseItem> list){
        for(WarehouseItem w:list){
            System.out.println(w.getClass().getSimpleName());
        }
    }
}
