
package com.gla.methods;

public class Product {

    String productName;
    double price;

    static int totalProducts = 0;

    Product(String name, double price) {
        this.productName = name;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println(productName + " " + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {

        Product p1 = new Product("Pen", 10);
        Product p2 = new Product("Book", 50);

        p1.displayProductDetails();
        p2.displayProductDetails();

        Product.displayTotalProducts();
    }
}
