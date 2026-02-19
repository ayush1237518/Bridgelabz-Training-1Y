
 package com.gla.inheritance;

class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {

    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Role: Teacher");
        displayBasicInfo();
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {

    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Role: Student");
        displayBasicInfo();
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {

    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println("Role: Staff");
        displayBasicInfo();
        System.out.println("Department: " + department);
    }
}

public class SchoolTest {

    public static void main(String[] args) {

        Teacher t = new Teacher("Amit", 35, "Mathematics");
        Student s = new Student("Rahul", 16, "10th Grade");
        Staff st = new Staff("Meena", 40, "Administration");

        t.displayRole();
        System.out.println();

        s.displayRole();
        System.out.println();

        st.displayRole();
    }
}
