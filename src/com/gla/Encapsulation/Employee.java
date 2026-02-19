
abstract class Employee {

    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        setEmployeeId(employeeId);
        setName(name);
        setBaseSalary(baseSalary);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        if (employeeId <= 0)
            throw new IllegalArgumentException("Employee ID must be positive");
        this.employeeId = employeeId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Name cannot be empty");
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0)
            throw new IllegalArgumentException("Salary cannot be negative");
        this.baseSalary = baseSalary;
    }
   
    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + name);
        System.out.println("Base Salary : " + baseSalary);
    }
    
}
