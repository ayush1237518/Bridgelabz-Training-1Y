
package com.gla;
class EngineeringStudent extends Student {

    String branch;

    EngineeringStudent(int rollNo, String name, int marks, String branch) {
        super(rollNo, name, marks);
        this.branch = branch;
    }

    String getStudentInfo() {
        return name + " - " + branch;
    }
}
