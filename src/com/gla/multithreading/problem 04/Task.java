
package com.gla.multithreading;

public class Task implements Runnable {
    private String taskName;
    private int delay;

    public Task(String taskName, int delay) {
        this.taskName = taskName;
        this.delay = delay;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(delay);
            System.out.println(taskName + " started by " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
