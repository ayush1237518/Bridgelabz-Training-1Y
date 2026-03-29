
package com.gla.multithreading;

public class Ticket extends Thread {
    private int id;
    private String type;

    public Ticket(int id, String type) {
        this.id = id;
        this.type = type;
    }

    @Override
    public void run() {
        System.out.println("Processing Ticket " + id + " (" + type + ")");

        try {
            int time = (int)(Math.random() * 5 + 1);
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Completed Ticket " + id);
    }
}
