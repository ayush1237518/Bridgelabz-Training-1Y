
package com.gla.methods;

public class Item {

    String itemCode;
    String itemName;
    double price;

    void display() {
        System.out.println("Code: " + itemCode);
        System.out.println("Name: " + itemName);
        System.out.println("Price: " + price);
    }

    double totalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {

        Item i = new Item();

        i.itemCode = "I101";
        i.itemName = "Pen";
        i.price = 20;

        i.display();
        System.out.println("Total Cost: " + i.totalCost(5));
    }
}
