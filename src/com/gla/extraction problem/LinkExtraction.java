import java.util.regex.*;
public class LinkExtraction {
    public static void main(String[] args) {

        String text = "Visit https://google.com and http://example.org";
        String regexp = "https?://[\\w.-]+";

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}