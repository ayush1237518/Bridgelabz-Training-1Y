
import java.util.ArrayList;
import java.util.List;

public class RideHailingApp {

    public static void main(String[] args) {

        List<Vehicle> rides = new ArrayList<>();

        Car car = new Car("C101", "Rahul", 15);
        Bike bike = new Bike("B202", "Amit", 10);
        Auto auto = new Auto("A303", "Suresh", 12);

        car.updateLocation("City Center");
        bike.updateLocation("Railway Station");
        auto.updateLocation("Mall Road");

        rides.add(car);
        rides.add(bike);
        rides.add(auto);

        double distance = 10;  

        
        for (Vehicle v : rides) {

            v.getVehicleDetails();
            System.out.println("Fare : " + v.calculateFare(distance));

            GPS gps = (GPS) v;
            System.out.println("Location : " + gps.getCurrentLocation());

            System.out.println("--------------------------");
        }
    }
}
