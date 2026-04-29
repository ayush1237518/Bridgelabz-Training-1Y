package com.gla;

public class Driver {

    private String driverId;
    private String name;
    private RouteLinkedList<Checkpoint> routeHistory;

    public Driver(String driverId, String name) {
        this.driverId     = driverId;
        this.name         = name;
        this.routeHistory = new RouteLinkedList<>();
    }

    public String getDriverId()   { return driverId; }
    public String getName()       { return name; }
    public RouteLinkedList<Checkpoint> getRouteHistory() { return routeHistory; }


    public void addCheckpoint(Checkpoint checkpoint) {
        routeHistory.addCheckpoint(checkpoint);
    }

    public boolean removeCheckpoint(String checkpointId) {
        return routeHistory.removeCheckpoint(checkpointId);
    }


    public Checkpoint findCheckpoint(String checkpointId) {
        return routeHistory.findCheckpoint(checkpointId);
    }

    public void printRouteSummary() {
        System.out.println("Driver: " + driverId + " – " + name);
        System.out.println("Route Summary:");
        routeHistory.printRoute();

        boolean consistent = routeHistory.isConsistentRoute();
        if (consistent) {
            System.out.println("Critical Route Check: All required checkpoints present");
        } else {
            System.out.println("Critical Route Check: WARNING – one or more critical checkpoints are missing!");
        }
    }
}
