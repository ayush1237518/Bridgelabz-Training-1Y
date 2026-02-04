
import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number > 0) {
            long factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }

            System.out.println("The factorial is");
            System.out.println(factorial);
        } else {
            System.out.println("Please enter a natural number.");
        }


    }
}
