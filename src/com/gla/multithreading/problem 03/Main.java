
package com.gla.multithreading;

public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Order(1, "Dominos", 3), "Agent-1");
        Thread t2 = new Thread(new Order(2, "KFC", 2), "Agent-2");
        Thread t3 = new Thread(new Order(3, "Burger King", 4), "Agent-3");

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(3);

        t1.start();
        t2.start();
        t3.start();
    }
}
