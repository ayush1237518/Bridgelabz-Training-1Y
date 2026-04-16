import java.util.regex.*;
public class UsernameValidation {
    public static void main(String[] args) {

        String regexp = "^[A-Za-z][A-Za-z0-9_]{4,14}$";

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher("user_123");

        if (matcher.matches()) {
            System.out.println("Valid Username");
        } else {
            System.out.println("Invalid Username");
        }
    }
}