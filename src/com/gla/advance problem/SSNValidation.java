import java.util.regex.*;

public class SSNValidation {
    public static void main(String[] args) {

        String ssn = "123-45-6789";
        String regexp = "^\\d{3}-\\d{2}-\\d{4}$";

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(ssn);

        if (matcher.matches()) {
            System.out.println("Valid SSN");
        } else {
            System.out.println("Invalid SSN");
        }
    }
}
