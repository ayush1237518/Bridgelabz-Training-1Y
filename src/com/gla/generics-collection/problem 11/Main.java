
package com.gla.generics-collections;

public class Main {
    public static void main(String[] args) {
        FleetManager<Truck> fm = new FleetManager<>();
        fm.addVehicle(new Truck());
        fm.addVehicle(new Truck());
        fm.showFleet();
    }
}
