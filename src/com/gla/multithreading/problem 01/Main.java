
package com.gla.multithreading;

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Prashant");

        Thread premium = new Thread(new UserThread(acc, "Premium"));
        Thread regular = new Thread(new UserThread(acc, "Regular"));
        Thread basic = new Thread(new UserThread(acc, "Basic"));

        premium.setPriority(10);
        regular.setPriority(5);
        basic.setPriority(1);

        premium.start();
        regular.start();
        basic.start();
    }
}
