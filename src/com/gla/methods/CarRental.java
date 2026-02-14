
package com.gla.methods;

public class CarRental {

    private String customerName;
    private String carModel;
    private int rentalDays;
    private double ratePerDay = 1000;

    public CarRental() {
        this("Customer", "Car", 1);
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateCost() {
        return rentalDays * ratePerDay;
    }

    public void display() {
        System.out.println(customerName + " " + carModel + " " + rentalDays);
        System.out.println("Total Cost: " + calculateCost());
    }

    public static void main(String[] args) {

        CarRental c = new CarRental("Aman", "SUV", 5);
        c.display();
    }
    
}
