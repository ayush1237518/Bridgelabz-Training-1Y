
package com.gla;
public class ProductTest {

    public static void main(String[] args) {

        Product p1 = new Product(1, "Laptop");
        Product p2 = new ElectronicProduct(2, "Smartphone", "Samsung");

        System.out.println(p1.isMatch("Lap"));
        System.out.println(p2.isMatch("Samsung"));
    }
}
