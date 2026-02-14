
package com.gla.methods;

public class Circle {

    double radius;

    double area() {
        return Math.PI * radius * radius;
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }

    void display() {
        System.out.println("Area: " + area());
        System.out.println("Circumference: " + circumference());
    }

    public static void main(String[] args) {

        Circle c = new Circle();
        c.radius = 7;

        c.display();
    }
}
