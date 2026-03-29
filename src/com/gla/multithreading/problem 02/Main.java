
package com.gla.multithreading;

public class Main {
    public static void main(String[] args) {
        Thread temp = new Thread(new Device("Temperature Sensor", 5000));
        Thread camera = new Thread(new Device("Security Camera", 3000));
        Thread light = new Thread(new Device("Light Controller", 4000));
        Thread door = new Thread(new Device("Door Lock", 6000));

        camera.setPriority(10);
        temp.setPriority(7);
        light.setPriority(5);
        door.setPriority(5);

        temp.start();
        camera.start();
        light.start();
        door.start();
    }
}
