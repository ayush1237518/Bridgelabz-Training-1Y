
package com.gla;
class Student {

    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    String calculateGrade() {

        if (marks >= 80)
            return "A";
        else if (marks >= 60)
            return "B";
        else
            return "C";
    }
}
