import java.util.regex.*;
public class LicensePlateValidation {
    public static void main(String[] args) {

        String regexp = "^[A-Z]{2}[0-9]{4}$";

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher("AB1234");

        if (matcher.matches()) {
            System.out.println("Valid Plate");
        } else {
            System.out.println("Invalid Plate");
        }
    }
}