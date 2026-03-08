
package com.gla;
public class StudentTest {

    public static void main(String[] args) {

        EngineeringStudent s1 = new EngineeringStudent(1, "Rahul", 85, "CSE");

        System.out.println("Grade: " + s1.calculateGrade());
        System.out.println("Student Info: " + s1.getStudentInfo());
    }
}
