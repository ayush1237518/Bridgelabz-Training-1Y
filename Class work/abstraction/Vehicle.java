package abstraction;
interface Vehicle {
    void start();
    default void fuelType() {
        System.out.println("Petrol");
    }
}