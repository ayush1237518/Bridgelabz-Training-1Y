
import java.util.Scanner;

public class DistanceConversion02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        double distanceInYards = distanceInFeet / 3;

        double distanceInMiles = distanceInYards / 1760;

        System.out.println("The distance in yards is: " + distanceInYards);
        System.out.println("while the distance in miles is: " + distanceInMiles);

        
    }
}
