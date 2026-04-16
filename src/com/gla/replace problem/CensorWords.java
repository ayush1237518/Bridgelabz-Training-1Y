import java.util.regex.*;
public class CensorWords {
    public static void main(String[] args) {

        String text = "This is a damn bad example with stupid words";
        String regexp = "damn|stupid";

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(text);

        String result = matcher.replaceAll("****");
        System.out.println(result);
    }
}