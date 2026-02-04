
import java.util.Scanner;

public class Operators{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum = " + sum);
        
        int sub = num1 - num2 ;
        
         System.out.println("Subtraction = " + sub);
        
        double mul = num1 * num2;
        
          System.out.println("multiply = " + mul);
          
          double  div = num1 / num2 ;
          
          
         System.out.println("divition = " + div);
                    
        
        
    }
    
}
