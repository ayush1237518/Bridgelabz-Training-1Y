import java.util.regex.*;
public class CapitalWordsExtraction {
    public static void main(String[] args) {

        String text = "The Eiffel Tower is in Paris and New York";
        String regexp = "\\b[A-Z][a-z]*\\b";

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}