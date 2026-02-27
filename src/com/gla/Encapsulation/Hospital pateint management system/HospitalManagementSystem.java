
import java.util.ArrayList;
import java.util.List;

public class HospitalManagementSystem {

    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();
        
        InPatient p1 = new InPatient(101, "Rahul", 30, 5, 2000);
        OutPatient p2 = new OutPatient(102, "Priya", 25, 500);

        p1.addRecord("Appendicitis");
        p2.addRecord("Fever");

        patients.add(p1);
        patients.add(p2);

        for (Patient p : patients) {

            p.getPatientDetails();
            System.out.println("Bill : " + p.calculateBill());

            MedicalRecord m = (MedicalRecord) p;
            m.viewRecords();

            System.out.println("----------------------------");
        }

    }
    
}
