import java.util.regex.*;
public class LanguageExtraction {
    public static void main(String[] args) {

        String text = "I love Java, Python, JavaScript and Go";
        String regexp = "Java|Python|JavaScript|Go";

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}