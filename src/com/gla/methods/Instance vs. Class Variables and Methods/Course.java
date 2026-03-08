
package com.gla.methods;
public class Course {

    String courseName;
    int duration;
    double fee;

    static String instituteName = "GLA University";

    Course(String name, int duration, double fee) {
        this.courseName = name;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println(courseName + " " + duration + " " + fee + " " + instituteName);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {

        Course c1 = new Course("Java", 6, 5000);
        c1.displayCourseDetails();

        Course.updateInstituteName("New Institute");

        c1.displayCourseDetails();
    }
}
