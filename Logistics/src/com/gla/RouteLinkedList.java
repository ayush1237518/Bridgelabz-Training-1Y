package com.gla;

public class RouteLinkedList<T extends Checkpoint> {

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }


    private Node<T> head;
    private int size;

    public RouteLinkedList() {
        head = null;
        size = 0;
    }


    public void addCheckpoint(T checkpoint) {
        if (checkpoint == null) throw new IllegalArgumentException("Checkpoint cannot be null.");

        Node<T> newNode = new Node<>(checkpoint);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }


    public boolean removeCheckpoint(String checkpointId) {
        if (head == null) return false;

        // Special case: removing the head node
        if (head.data.getCheckpointId().equals(checkpointId)) {
            head = head.next;
            size--;
            return true;
        }

        Node<T> current = head;
        while (current.next != null) {
            if (current.next.data.getCheckpointId().equals(checkpointId)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        return false; // not found
    }


    public T findCheckpoint(String checkpointId) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.getCheckpointId().equals(checkpointId)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }


    public double computeTotalDistance() {
        double total = 0.0;
        Node<T> current = head;
        while (current != null) {
            total += current.data.getDistanceFromLast();
            current = current.next;
        }
        return total;
    }


    public double computeTotalPenalty() {
        double total = 0.0;
        Node<T> current = head;
        while (current != null) {
            total += current.data.calculatePenalty();
            current = current.next;
        }
        return total;
    }


    public double computeRouteScore() {
        return computeTotalDistance() - computeTotalPenalty();
    }


    public boolean isConsistentRoute() {
        boolean hasCritical = false;
        Node<T> current = head;
        while (current != null) {
            if (current.data.isCritical()) {
                hasCritical = true;
                // Re-look up by ID to confirm it is still reachable in the list
                if (findCheckpoint(current.data.getCheckpointId()) == null) {
                    return false;
                }
            }
            current = current.next;
        }
        return hasCritical; // false if there are no critical checkpoints at all
    }


    public void printRoute() {
        int index = 1;
        Node<T> current = head;
        while (current != null) {
            System.out.println(index + ". " + current.data.toString());
            index++;
            current = current.next;
        }
        double totalDistance = computeTotalDistance();
        double totalPenalty  = computeTotalPenalty();
        double routeScore    = computeRouteScore();

        System.out.printf("Total Distance: %.1f km%n", totalDistance);
        System.out.printf("Total Penalty: %.1f%n",    totalPenalty);
        System.out.printf("Route Score: %.1f%n",      routeScore);
    }


    public int size()      { return size; }
    public boolean isEmpty(){ return size == 0; }
}