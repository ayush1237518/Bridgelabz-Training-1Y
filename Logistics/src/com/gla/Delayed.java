package com.gla;
public class Delayed{
    public boolean Delayed() {
        return actualDuration > expectedDuration;
    }

    public double getDelay() {
        return Math.max(0, actualDuration - expectedDuration);
    }

    public abstract boolean isCritical();

    public abstract String getType();

    public abstract double calculatePenalty();
}