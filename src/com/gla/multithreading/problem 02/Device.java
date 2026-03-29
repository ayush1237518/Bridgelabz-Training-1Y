
package com.gla.multithreading;

public class Device implements Runnable {
    private String name;
    private int interval;

    public Device(String name, int interval) {
        this.name = name;
        this.interval = interval;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " running cycle " + i);

            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
