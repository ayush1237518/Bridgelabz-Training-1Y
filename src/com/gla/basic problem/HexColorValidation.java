import java.util.regex.*;
public class HexColorValidation {
    public static void main(String[] args) {

        String regexp = "^#[A-Fa-f0-9]{6}$";

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher("#FFA500");

        if (matcher.matches()) {
            System.out.println("Valid Hex Color");
        } else {
            System.out.println("Invalid Hex Color");
        }
    }
}