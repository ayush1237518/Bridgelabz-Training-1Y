
import java.util.Scanner;

public class TotalPriceCalculator02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice);
        System.out.println("if the quantity " + quantity);
        System.out.println("and unit price is INR " + unitPrice);  
    }
}
