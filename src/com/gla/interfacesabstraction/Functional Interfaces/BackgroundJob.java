
package com.gla.interfaces-abstraction;

public class BackgroundJob {
    public static void main(String[] args) {

        Runnable job = () -> {
            System.out.println("Background task is running...");
        };

        Thread thread = new Thread(job);
        thread.start();
    }
}
