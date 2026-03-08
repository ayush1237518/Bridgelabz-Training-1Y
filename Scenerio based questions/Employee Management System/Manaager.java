
package com.gla;
class Manager extends Employee {

    String department;

    Manager(int empId, String name, String department) {
        super(empId, name);
        this.department = department;
    }

    String generateEmail() {
        return name.toLowerCase() + "." + department.toLowerCase() + "@company.com";
    }
}
