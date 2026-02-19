
import java.util.ArrayList;
import java.util.List;


public class EmployeeManagementSystem {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        
        FullTimeEmployee full = new FullTimeEmployee(101, "Rahul", 50000, 10000);
        full.assignDepartment("IT");


        PartTimeEmployee part = new PartTimeEmployee(102, "Priya", 20000, 40, 300);
        part.assignDepartment("HR");


        employees.add(full);
        employees.add(part);

        for (Employee emp : employees) {

            emp.displayDetails();
            System.out.println("Total Salary : " + emp.calculateSalary());

           
            Department dept = (Department) emp;
            System.out.println(dept.getDepartmentDetails());

            System.out.println("----------------------------");
        }

    }
    
}
