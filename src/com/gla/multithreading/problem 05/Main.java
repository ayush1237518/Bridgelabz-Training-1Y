
package com.gla.multithreading;

public class Main {
    public static void main(String[] args) {

        Ticket t1 = new Ticket(1, "Critical Bug");
        Ticket t2 = new Ticket(2, "Feature Request");
        Ticket t3 = new Ticket(3, "General Query");

        t1.setPriority(10);
        t2.setPriority(4);
        t3.setPriority(2);

        t1.start();
        t2.start();
        t3.start();
    }
}
