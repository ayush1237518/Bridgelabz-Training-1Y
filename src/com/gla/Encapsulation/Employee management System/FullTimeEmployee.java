
class FullTimeEmployee extends Employee implements Department {

    private String department;
    private double fixedBonus;

    public FullTimeEmployee(int id, String name, double baseSalary, double fixedBonus) {
        super(id, name, baseSalary);
        setFixedBonus(fixedBonus);
    }

    public double getFixedBonus() {
        return fixedBonus;
    }

    public void setFixedBonus(double fixedBonus) {
        if (fixedBonus < 0)
            throw new IllegalArgumentException("Bonus cannot be negative");
        this.fixedBonus = fixedBonus;
    }
    
    @Override
    public double calculateSalary() {
        return getBaseSalary() + fixedBonus;
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
