
 import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("UP32AB1234", 2000, "CAR123"));
        vehicles.add(new Bike("UP32CD5678", 800, "BIKE456"));
        vehicles.add(new Truck("UP32EF9012", 5000, "TRUCK789"));

        int days = 5;
        
        for (Vehicle v : vehicles) {

            v.getVehicleDetails();

            double rentalCost = v.calculateRentalCost(days);
            System.out.println("Rental Cost (" + days + " days): " + rentalCost);

            Insurable ins = (Insurable) v;
            System.out.println("Insurance Cost: " + ins.calculateInsurance());
            System.out.println(ins.getInsuranceDetails());

            System.out.println("-----------------------------");
        }

    }
    
}
