
 package com.gla.inheritance;

class Employee {

    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {

    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        System.out.println("Role: Manager");
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {

    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        System.out.println("Role: Developer");
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {

    int internshipDuration;

    Intern(String name, int id, double salary, int internshipDuration) {
        super(name, id, salary);
        this.internshipDuration = internshipDuration;
    }

    @Override
    void displayDetails() {
        System.out.println("Role: Intern");
        super.displayDetails();
        System.out.println("Internship Duration (months): " + internshipDuration);
    }
}

public class EmployeeTest {

    public static void main(String[] args) {

        Employee e1 = new Manager("Amit", 101, 60000, 5);
        Employee e2 = new Developer("Rahul", 102, 50000, "Java");
        Employee e3 = new Intern("Riya", 103, 15000, 6);

        e1.displayDetails();
        System.out.println();

        e2.displayDetails();
        System.out.println();

        e3.displayDetails();
    }
}
