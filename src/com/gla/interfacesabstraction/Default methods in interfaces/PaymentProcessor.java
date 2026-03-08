
package com.gla.interfaces-abstraction;

interface PaymentProcessor {

    void processPayment(double amount);

    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " processed");
    }
}
class PayPal implements PaymentProcessor {

    public void processPayment(double amount) {
        System.out.println("Payment processed via PayPal: ₹" + amount);
    }
}
