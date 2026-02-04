
import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) {   
            int sum = number * (number + 1) / 2;

            System.out.println("The sum of");
            System.out.println("natural numbers is");
            System.out.println(sum);
        } else {
            System.out.println("The number");
            System.out.println("is not a natural number");
        }
    }
}
