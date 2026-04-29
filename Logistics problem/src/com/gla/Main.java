package com.gla;

public class Main {
    public static void main(String[] args) {

        Driver driver = new Driver("D1204", "Kavita Nair");

        DeliveryCheckpoint c1 = new DeliveryCheckpoint(
                "CP001", "Warehouse A",
                30.0,
                30.0,
                40.0
        );


        FuelCheckpoint c2 = new FuelCheckpoint(
                "CP002", "Pump 12",
                20.0,
                15.0,
                15.0
        );


        RestCheckpoint c3 = new RestCheckpoint(
                "CP003", "Motel X",
                40.0,
                20.0,
                60.0
        );

        DeliveryCheckpoint c4 = new DeliveryCheckpoint(
                "CP004", "Client Hub",
                30.0,
                45.0,
                60.0
        );


        driver.addCheckpoint(c1);
        driver.addCheckpoint(c2);
        driver.addCheckpoint(c3);
        driver.addCheckpoint(c4);

        driver.printRouteSummary();


        System.out.println("\n--- Removing a critical checkpoint (CP001) ---");
        driver.removeCheckpoint("CP001");


        System.out.println("\nDriver: " + driver.getDriverId() + " – " + driver.getName());
        System.out.println("Route Summary:");
        driver.getRouteHistory().printRoute();

        boolean consistent = driver.getRouteHistory().isConsistentRoute();
        System.out.println("Critical Route Check: " +
                (consistent ? "All required checkpoints present"
                        : "WARNING – one or more critical checkpoints are missing!"));
    }
}