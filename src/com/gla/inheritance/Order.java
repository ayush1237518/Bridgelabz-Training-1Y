
 package com.gla.inheritance;

class Order {

    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {

    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order Shipped, Tracking No: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {

    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order Delivered on " + deliveryDate;
    }
}

public class OrderTest {

    public static void main(String[] args) {

        Order o = new Order(1, "10 Feb");
        ShippedOrder s = new ShippedOrder(2, "11 Feb", "TRK123");
        DeliveredOrder d = new DeliveredOrder(3, "12 Feb", "TRK456", "15 Feb");

        System.out.println(o.getOrderStatus());
        System.out.println(s.getOrderStatus());
        System.out.println(d.getOrderStatus());
    }
}
