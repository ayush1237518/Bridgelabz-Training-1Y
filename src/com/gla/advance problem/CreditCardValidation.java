import java.util.regex.*;

public class CreditCardValidation {
    public static void main(String[] args) {

        String card = "4123456789012345";
        String regexp = "^(4|5)[0-9]{15}$";

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(card);

        if (matcher.matches()) {
            System.out.println("Valid Card");
        } else {
            System.out.println("Invalid Card");
        }
    }
}
