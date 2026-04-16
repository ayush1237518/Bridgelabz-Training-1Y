import java.util.regex.*;
public class CurrencyExtraction {
    public static void main(String[] args) {

        String text = "Price is $45.99 and discount is 10.50";
        String regexp = "\\$?\\d+(\\.\\d+)?";

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}