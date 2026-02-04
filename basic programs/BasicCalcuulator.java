
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        double number1, number2;

        Scanner input = new Scanner(System.in);

        number1 = input.nextDouble();
        number2 = input.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        System.out.println(
            "The addition, subtraction, multiplication and division value of 2 numbers\n" +
            number1 + " and " + number2 + " is " +
            addition + ", " + subtraction + ", " + multiplication + ", and " + division
        );

    }
}
