package com.gla;
public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("D1204", "Kavita Nair");

        driver.addCheckpoint(
                new DeliveryCheckpoint("CP01", "Warehouse A", 30.0, 40.0, 50.0)
        );

        driver.addCheckpoint(
                new FuelCheckpoint("CP02", "Pump 12", 25.0, 20.0, 20.0)
        );

        driver.addCheckpoint(
                new RestCheckpoint("CP03", "Motel X", 20.0, 30.0, 35.0)
        );

        driver.addCheckpoint(
                new DeliveryCheckpoint("CP04", "Client Hub", 45.0, 60.0, 75.0)
        );

        driver.printReport();

        System.out.println();
        System.out.println("--- Additional Operations ---");

        Checkpoint found = driver.findCheckpoint("CP02");
        System.out.println("findCheckpoint(\"CP02\"): "
                + (found != null ? found.getLocationName() : "Not found"));

        boolean removed = driver.removeCheckpoint("CP99");
        System.out.println("removeCheckpoint(\"CP99\") [non-existent]: " + removed);

        driver.removeCheckpoint("CP02");
        System.out.println("After removing FuelCheckpoint (CP02):");
        System.out.println("  isConsistent() → " +
                (driver.isRouteConsistent()
                        ? "All required checkpoints present"
                        : "MISSING critical checkpoints!"));
    }
}

