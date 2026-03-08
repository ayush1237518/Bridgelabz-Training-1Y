
package com.gla.methods;

public class Vehicle {

    String ownerName;
    String vehicleType;

    static double registrationFee = 1000;

    Vehicle(String owner, String type) {
        ownerName = owner;
        vehicleType = type;
    }

    void displayVehicleDetails() {
        System.out.println(ownerName + " " + vehicleType + " Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {

        Vehicle v = new Vehicle("Aman", "Car");
        v.displayVehicleDetails();

        Vehicle.updateRegistrationFee(1500);
        v.displayVehicleDetails();
    }
}
