
 class Car extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Car(String number, double rate, String policyNo) {
        super(number, "Car", rate);
        this.insurancePolicyNumber = policyNo;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    
    
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.10;  
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + insurancePolicyNumber;
    }
}
