package hospital_junit_project;

import java.util.ArrayList;
import java.util.List;

class Patient {
    private int patientId;
    private String name;
    private int age;
    private String gender;
    private String phone,address;
    private List<Appointment> appointments;
    private List<MedicalRecord> medicalRecords;
    private List<Billing> billings;

    public Patient(int patientId, String name, int age, String gender, String phone , String address) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.appointments = new ArrayList<>();
        this.medicalRecords = new ArrayList<>();
        this.billings = new ArrayList<>();
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public void addMedicalRecord(MedicalRecord medicalRecord) {
        medicalRecords.add(medicalRecord);
    }

    public void addBilling(Billing billing) {
        billings.add(billing);
    }

    public void updateDetails(String address, String phone) {
        this.address = address;
        this.phone = phone;
    }
    
    public MedicalRecord getMedicalRecordById(int recordID) {
        for (MedicalRecord record : medicalRecords) {
            if (record.getRecordID() == recordID) {
                return record;
            }
        }
        return null;
    }

    
    public List<MedicalRecord> getMedicalRecords() {
        return medicalRecords;
    }

}










