import java.util.*;
import java.util.stream.*;

public class NameUppercase {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("prashant", "rahul", "amit");

        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        upperNames.forEach(System.out::println);
    }
}
