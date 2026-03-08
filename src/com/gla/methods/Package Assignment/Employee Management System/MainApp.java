
package com.company.main;

import com.company.hr.Employee;
import com.company.payroll.Payroll;

public class MainApp {

    public static void main(String[] args) {

        Employee emp = new Employee(1,"Rahul","IT",50000);

        Payroll p = new Payroll();
        double finalSalary = p.calculateBonus(emp);

        System.out.println("Employee: "+emp.getName());
        System.out.println("Department: "+emp.getDepartment());
        System.out.println("Salary after bonus: "+finalSalary);
    }
}
