
package com.gla.generics-collections;

public class DiscountUtil {
    public static <T extends MarketplaceProduct<?>> void applyDiscount(T product, double percentage){
        product.price -= product.price * percentage / 100;
    }
}
