package com.gla;

public class Driver  {
    private String driverId;
    private String name;
    private RouteLinkedList<Checkpoint> routeHistory;

    public Driver(String driverId, String name) {
        this.driverId = driverId;
        this.name = name;
        this.routeHistory = new RouteLinkedList<>();
    }

    public String getDriverId() {
        return driverId;
    }

    public String getName() {
        return name;
    }

    public RouteLinkedList<Checkpoint> getRouteHistory() {
        return routeHistory;
    }

    public void addCheckpoint(Checkpoint checkpoint) {
        routeHistory.addCheckpoint(checkpoint);
    }

    public boolean removeCheckpoint(String checkpointId) {
        return routeHistory.removeCheckpoint(checkpointId);
    }

    public Checkpoint findCheckpoint(String checkpointId) {
        return routeHistory.findCheckpoint(checkpointId);
    }

    public double getTotalDistance() {
        return routeHistory.computeTotalDistance();
    }

    public double getTotalPenalty() {
        return routeHistory.computeTotalPenalty();
    }
    public double getRouteScore() {
        return getTotalDistance() - getTotalPenalty();
    }
    public boolean isRouteConsistent() {
        return routeHistory.isConsistent();
    }
    public void printReport() {
        System.out.println("Driver: " + driverId + " \u2013 " + name);
        System.out.println("Route Summary:");
        routeHistory.printRoute();
        System.out.printf("Total Distance: %.1f km%n", getTotalDistance());
        System.out.printf("Total Penalty: %.1f%n",    getTotalPenalty());
        System.out.printf("Route Score: %.1f%n",      getRouteScore());
        System.out.println("Critical Route Check: " +
                (isRouteConsistent()
                        ? "All required checkpoints present"
                        : "MISSING critical checkpoints!"));
    }
}
