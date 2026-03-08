
package com.gla;
public class EmployeeTest {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Rahul");
        Employee e2 = new Manager(2, "Amit", "HR");

        System.out.println(e1.generateEmail());
        System.out.println(e2.generateEmail());
    }
}
