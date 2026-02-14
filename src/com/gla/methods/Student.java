
package com.gla.methods;

public class Student {

    String name;
    int rollNumber;
    int marks;

    String calculateGrade() {
        if (marks >= 80) return "A";
        else if (marks >= 60) return "B";
        else if (marks >= 40) return "C";
        else return "Fail";
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {

        Student s = new Student();

        s.name = "Rahul";
        s.rollNumber = 12;
        s.marks = 75;

        s.display();
    }
}
