
package com.gla.multithreading;

public class Main {
    public static void main(String[] args) {

        Thread entry = new Thread(new Task("Student Entry", 0));
        Thread paper = new Thread(new Task("Question Paper Distribution", 5000));
        Thread attendance = new Thread(new Task("Attendance", 10000));
        Thread collection = new Thread(new Task("Answer Sheet Collection", 15000));

        paper.setPriority(10);
        attendance.setPriority(8);
        entry.setPriority(5);
        collection.setPriority(7);

        entry.start();
        paper.start();
        attendance.start();
        collection.start();
    }
}
