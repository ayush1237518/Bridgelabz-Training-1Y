package com.gla;


public class RestCheckpoint extends Checkpoint {

    private static final double PENALTY_THRESHOLD_MINUTES = 30.0;
    private static final double PENALTY_RATE              = 0.5;

    public RestCheckpoint(String checkpointId, String locationName,
                          double distanceFromLast,
                          double expectedDuration, double actualDuration) {
        super(checkpointId, locationName, distanceFromLast, expectedDuration, actualDuration);
    }

    @Override
    public boolean isCritical() {
        return false; // rest stops are optional
    }

    @Override
    public String getType() {
        return "Rest";
    }


    @Override
    public double calculatePenalty() {
        double delay = delayMinutes();
        if (delay <= PENALTY_THRESHOLD_MINUTES) return 0.0;
        return delay * PENALTY_RATE;
    }
}