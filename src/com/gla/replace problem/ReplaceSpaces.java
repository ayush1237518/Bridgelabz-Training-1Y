import java.util.regex.*;
public class ReplaceSpaces {
    public static void main(String[] args) {

        String text = "This   is   an   example";
        String regexp = "\\s+";

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(text);

        String result = matcher.replaceAll(" ");
        System.out.println(result);
    }
}