package abstraction;
class BMW extends Car {

    @Override
    void brand() {
        System.out.println("Brand: BMW");
    }

    @Override
    void wheels() {
        super.wheels();
    }

    @Override
     public void start() {
        System.out.println("Car starts");
    }

    @Override
    public void fuelType() {
        System.out.println("Fuel: Diesel");
    }
}
