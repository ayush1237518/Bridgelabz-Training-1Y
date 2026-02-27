
abstract class Vehicle {

    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        setVehicleId(vehicleId);
        setDriverName(driverName);
        setRatePerKm(ratePerKm);
    }

    
    public String getVehicleId() {
        return vehicleId;
    }


    public void setVehicleId(String vehicleId) {
        if (vehicleId == null || vehicleId.isEmpty())
            throw new IllegalArgumentException("Invalid vehicle ID");
        this.vehicleId = vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        if (driverName == null || driverName.isEmpty())
            throw new IllegalArgumentException("Invalid driver name");
        this.driverName = driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        if (ratePerKm <= 0)
            throw new IllegalArgumentException("Invalid rate");
        this.ratePerKm = ratePerKm;
    }

   
    public abstract double calculateFare(double distance);

    
    public void getVehicleDetails() {
        System.out.println("Vehicle ID  : " + vehicleId);
        System.out.println("Driver Name : " + driverName);
        System.out.println("Rate/km     : " + ratePerKm);
    }
}
