
package com.gla.generics-collections;

public class Main {
    public static void main(String[] args) {
        Cart<String> cart = new Cart<>();
        cart.addItem("Laptop");
        cart.displayItems();
    }
}
