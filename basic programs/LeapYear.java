
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Leap year calculation is valid only for year 1582 and above.");
        } else {

            if (year % 400 == 0) {
                System.out.println("Year is a Leap Year.");
            } else if (year % 100 == 0) {
                System.out.println("Year is not a Leap Year.");
            } else if (year % 4 == 0) {
                System.out.println("Year is a Leap Year.");
            } else {
                System.out.println("Year is not a Leap Year.");
            }

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Year is a Leap Year.");
            } else {
                System.out.println("Year is not a Leap Years.");
            }
        }

        
    }
}
