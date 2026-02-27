
 class Bike extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Bike(String number, double rate, String policyNo) {
        super(number, "Bike", rate);
        this.insurancePolicyNumber = policyNo;
    }

    
    
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05;   // 5% insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + insurancePolicyNumber;
    }
}

 class Bike extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Bike(String number, double rate, String policyNo) {
        super(number, "Bike", rate);
        this.insurancePolicyNumber = policyNo;
    }

    
    
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05;   // 5% insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + insurancePolicyNumber;
    }
}
