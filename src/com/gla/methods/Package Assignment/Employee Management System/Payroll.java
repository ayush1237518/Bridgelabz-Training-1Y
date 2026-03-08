
package com.company.payroll;

import com.company.hr.Employee;

public class Payroll {

    public double calculateBonus(Employee e){

        double bonus = e.getSalary() * 0.10;
        double newSalary = e.getSalary() + bonus;

        e.setSalary(newSalary);
        return newSalary;
    }
}
