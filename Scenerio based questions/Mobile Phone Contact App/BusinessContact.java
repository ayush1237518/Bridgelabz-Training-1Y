
package com.gla;
class BusinessContact extends Contact {

    String companyName;

    BusinessContact(String name, String phoneNumber, String companyName) {
        super(name, phoneNumber);
        this.companyName = companyName;
    }

    void display() {
        System.out.println(
                "Name: " + name.toUpperCase() +
                        ", Phone: " + phoneNumber +
                        ", Company: " + companyName
        );
    }
}
