
import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

     
        int quotient = number1 / number2;
        int remainder = number1 % number2;

 
        System.out.println("The Quotient is: " + quotient);
        System.out.println("The Remainder is: " + remainder);
        System.out.println("of two numbers " + number1 + " and " + number2);

        
    }
    
}
