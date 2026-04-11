
package com.gla.generics-collections;

public class Main {
    public static void main(String[] args) {
        MarketplaceProduct<String> p = new MarketplaceProduct<>(1000);
        DiscountUtil.applyDiscount(p,10);
        System.out.println(p.price);
    }
}
