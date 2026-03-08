
package com.gla.methods;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    public void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {



        Person p1 = new Person("Amit", 22);
        Person p2 = new Person(p1);

        p1.display();
        p2.display();
    }
    
}
