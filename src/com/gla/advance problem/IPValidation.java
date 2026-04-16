import java.util.regex.*;

public class IPValidation {
    public static void main(String[] args) {

        String ip = "192.168.1.1";
        String regexp = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.)){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(ip);

        if (matcher.matches()) {
            System.out.println("Valid IP");
        } else {
            System.out.println("Invalid IP");
        }
    }
}

