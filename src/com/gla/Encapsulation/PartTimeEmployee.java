
 class PartTimeEmployee extends Employee implements Department {

    private String department;
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, double baseSalary,
                            int hoursWorked, double hourlyRate) {
        super(id, name, baseSalary);
        setHoursWorked(hoursWorked);
        setHourlyRate(hourlyRate);
    }
    
    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        if (hoursWorked < 0)
            throw new IllegalArgumentException("Hours cannot be negative");
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Rate cannot be negative");
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department : " + department;
    }
    
}
