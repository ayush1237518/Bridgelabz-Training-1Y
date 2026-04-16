import java.util.regex.*;
public class DateExtraction {
    public static void main(String[] args) {

        String text = "Dates: 12/05/2023, 15/08/2024";
        String regexp = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}