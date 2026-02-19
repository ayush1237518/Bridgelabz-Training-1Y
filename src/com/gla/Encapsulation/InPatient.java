
 class InPatient extends Patient implements MedicalRecord {

    private int daysAdmitted;
    private double dailyCharge;


    public InPatient(int id, String name, int age,
                     int daysAdmitted, double dailyCharge) {
        super(id, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    
    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    @Override
    public void addRecord(String diagnosis) {
        setDiagnosis(diagnosis);
    }

    @Override
    public void viewRecords() {
        System.out.println("Diagnosis : " + getDiagnosis());
    }
    
}
