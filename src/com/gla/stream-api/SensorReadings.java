import java.util.*;

public class SensorReadings {
    public static void main(String[] args) {

        List<Integer> readings = Arrays.asList(30, 60, 80, 40);

        readings.stream()
                .filter(r -> r > 50)
                .forEach(System.out::println);
    }
}
