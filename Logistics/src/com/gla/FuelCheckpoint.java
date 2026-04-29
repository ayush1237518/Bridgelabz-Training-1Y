package com.gla;

public class FuelCheckpoint extends Checkpoint {

    private static final double FLAT_PENALTY = 10.0;

    public FuelCheckpoint(String checkpointId, String locationName,
                          double distanceFromLast,
                          double expectedDuration, double actualDuration) {
        super(checkpointId, locationName, distanceFromLast, expectedDuration, actualDuration);
    }


    @Override
    public boolean isCritical() {
        return true; // fuel stops are always critical
    }

    @Override
    public String getType() {
        return "Fuel";
    }


    @Override
    public double calculatePenalty() {
        return isDelayed() ? FLAT_PENALTY : 0.0;
    }
}