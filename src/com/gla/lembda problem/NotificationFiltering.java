import java.util.*;
import java.util.function.Predicate;

public class NotificationFiltering {
    public static void main(String[] args) {

        List<String> alerts = Arrays.asList(
                "Emergency Alert",
                "General Update",
                "Critical Alert",
                "Reminder"
        );

        Predicate<String> importantAlerts =
                alert -> alert.contains("Alert");

        System.out.println("Filtered Alerts:");
        alerts.stream()
                .filter(importantAlerts)
                .forEach(System.out::println);
    }
}
