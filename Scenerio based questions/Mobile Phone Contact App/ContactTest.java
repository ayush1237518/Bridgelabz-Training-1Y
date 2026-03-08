
package com.gla;
public class ContactTest {

    public static void main(String[] args) {

        Contact c1 = new Contact("Rahul", "9876543210");
        Contact c2 = new BusinessContact("Amit", "9876500000", "TCS");

        c1.display();
        c2.display();
    }
}
