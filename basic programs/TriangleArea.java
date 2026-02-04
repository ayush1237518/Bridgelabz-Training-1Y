
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        double base, height;

        Scanner input = new Scanner(System.in);

        base = input.nextDouble();
        height = input.nextDouble();

        double areaInSqInches = 0.5 * base * height;

        double areaInSqCm = areaInSqInches * 6.4516;

        System.out.println(
            "The area of the triangle in square inches is " + areaInSqInches +
            " and the area of the triangle in square centimeters is " + areaInSqCm
        );
        
    } 
}
