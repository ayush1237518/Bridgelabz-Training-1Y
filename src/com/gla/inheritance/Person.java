
 package com.gla.inheritance;

interface Worker {
    void performDuties();
}

class Person {

    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Chef prepares food");
    }
}

class Waiter extends Person implements Worker {

    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Waiter serves customers");
    }
}

public class RestaurantTest {

    public static void main(String[] args) {

        Chef chef = new Chef("Amit", 101);
        Waiter waiter = new Waiter("Rahul", 102);

        chef.displayBasicInfo();
        chef.performDuties();

        System.out.println();

        waiter.displayBasicInfo();
        waiter.performDuties();
    }
}
