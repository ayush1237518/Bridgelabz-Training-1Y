
class Car extends Vehicle implements GPS {

    private String location;

    public Car(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }


    @Override
    public String getCurrentLocation() {
        return location;
    }

    
    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}
