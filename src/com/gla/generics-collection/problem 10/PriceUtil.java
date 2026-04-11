
package com.gla.generics-collections;

import java.util.*;

public class PriceUtil {
    public static double calculateTotal(List<? extends Product> list){
        double total=0;
        for(Product p:list) total+=p.getPrice();
        return total;
    }
}
