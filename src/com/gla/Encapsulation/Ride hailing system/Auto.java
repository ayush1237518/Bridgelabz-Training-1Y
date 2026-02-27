
class Auto extends Vehicle implements GPS {

    private String location;

    public Auto(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 20; 
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
