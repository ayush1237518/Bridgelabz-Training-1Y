import java.util.regex.*;
public class EmailExtraction {
    public static void main(String[] args) {

        String text = "Contact us at support@example.com and info@company.org";
        String regexp = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}