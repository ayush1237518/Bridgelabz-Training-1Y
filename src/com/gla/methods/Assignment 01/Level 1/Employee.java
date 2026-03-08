
package com.gla.methods;

public class Employee {

    String name;
    int id;
    double salary;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        Employee e = new Employee();

        e.name = "Amit";
        e.id = 101;
        e.salary = 50000;

        e.display();
    }
}
