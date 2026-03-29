
package com.gla.multithreading;

public class Order implements Runnable {
    private int orderId;
    private String restaurant;
    private int deliveryTime;

    public Order(int orderId, String restaurant, int deliveryTime) {
        this.orderId = orderId;
        this.restaurant = restaurant;
        this.deliveryTime = deliveryTime;
    }

    @Override
    public void run() {
        System.out.println("Order " + orderId + " picked up from " + restaurant);

        try {
            Thread.sleep(deliveryTime * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Order " + orderId + " delivered by " + Thread.currentThread().getName());
    }
}
