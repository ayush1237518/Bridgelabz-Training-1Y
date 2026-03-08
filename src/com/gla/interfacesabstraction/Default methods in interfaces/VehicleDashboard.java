
package com.gla.interfaces-abstraction;

interface VehicleDashboard {

    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery percentage: 80%");
    }
}

class ElectricVehicle implements VehicleDashboard {

    public void displaySpeed() {
        System.out.println("Speed: 60 km/h");
    }
}
