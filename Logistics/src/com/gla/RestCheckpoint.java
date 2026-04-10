package com.gla;

public class RestCheckpoint extends Checkpoint {

    public RestCheckpoint(String checkpointId,
                          String locationName,
                          double distanceFromLast,
                          double expectedDuration,
                          double actualDuration) {
        super(checkpointId, locationName,
                distanceFromLast, expectedDuration, actualDuration);
    }

    @Override
    public boolean isCritical() {
        return false;
    }

    @Override
    public String getType() {
        return "RestCheckpoint";
    }

    @Override
    public double calculatePenalty() {
        return isDelayed() ? getDelay() * 0.5 : 0.0;
    }
}
