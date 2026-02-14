
package com.gla.methods;

public class CartItem {

    String itemName;
    double price;
    int quantity;

    void addItem(String name, double p, int q) {
        itemName = name;
        price = p;
        quantity = q;
    }

    void removeItem() {
        quantity = 0;
    }

    void displayTotalCost() {
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {

        CartItem c = new CartItem();

        c.addItem("Laptop", 50000, 1);
        c.displayTotalCost();

        c.removeItem();
        c.displayTotalCost();
    }
}
