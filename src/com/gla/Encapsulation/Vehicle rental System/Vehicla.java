
/**
 * Abstract base class for vehicles.
 */
abstract class Vehicle {

    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        setVehicleNumber(vehicleNumber);
        setType(type);
        setRentalRate(rentalRate);
    }

    // ---------- Encapsulation with validation ----------

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        if (vehicleNumber == null || vehicleNumber.isEmpty())
            throw new IllegalArgumentException("Invalid vehicle number");
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type == null || type.isEmpty())
            throw new IllegalArgumentException("Invalid type");
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        if (rentalRate < 0)
            throw new IllegalArgumentException("Invalid rental rate");
        this.rentalRate = rentalRate;
    }

    
    
    public abstract double calculateRentalCost(int days);

    
    public void getVehicleDetails() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Type           : " + type);
        System.out.println("Rate per day   : " + rentalRate);
    }
    
}
