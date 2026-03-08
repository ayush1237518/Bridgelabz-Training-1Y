
package com.gla;
public class OrderTest {

    public static void main(String[] args) {

        Order o1 = new RegularOrder(1, 500);
        Order o2 = new PremiumOrder(2, 500);

        System.out.println("Regular Order Bill: " + o1.calculateBill());
        System.out.println("Premium Order Bill: " + o2.calculateBill());
    }
}
