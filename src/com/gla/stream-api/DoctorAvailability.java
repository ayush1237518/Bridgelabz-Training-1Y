import java.util.*;

class Doctor {
    String name;
    String specialty;
    boolean weekendAvailable;

    Doctor(String name, String specialty, boolean weekendAvailable) {
        this.name = name;
        this.specialty = specialty;
        this.weekendAvailable = weekendAvailable;
    }

    public String toString() {
        return name + " - " + specialty;
    }
}

public class DoctorAvailability {
    public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr A", "Cardiology", true),
                new Doctor("Dr B", "Neurology", false),
                new Doctor("Dr C", "Orthopedic", true)
        );

        doctors.stream()
                .filter(d -> d.weekendAvailable)
                .sorted((d1, d2) -> d1.specialty.compareTo(d2.specialty))
                .forEach(System.out::println);
    }
}
