package HospitalSystem;

public class Gynaecology {
    private Doctor doctor;
    private Nurse nurse;
    private Patient patient;
    private Equipment equipment;

    public Gynaecology() {
    }

    public Gynaecology(Doctor doctor, Nurse nurse, Patient patient, Equipment equipment) {
        this.doctor = doctor;
        this.nurse = nurse;
        this.patient = patient;
        this.equipment = equipment;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return "HospitalSystem.Gynaecology{" +
                "doctor=" + doctor +
                ", nurse=" + nurse +
                ", patient=" + patient +
                ", equipment=" + equipment +
                '}';
    }
}



