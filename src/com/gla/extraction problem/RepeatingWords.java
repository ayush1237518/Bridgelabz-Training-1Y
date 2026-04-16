import java.util.regex.*;
public class RepeatingWords {
    public static void main(String[] args) {

        String text = "This is is a repeated repeated word test";
        String regexp = "\\b(\\w+)\\s+\\1\\b";

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}