
package com.gla;
class Contact {

    String name;
    String phoneNumber;

    Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    void display() {
        System.out.println("Name: " + name + ", Phone: " + phoneNumber);
    }
}
