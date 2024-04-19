package HospitalSystem;

public class Optometry {
    private Doctor doctors;

    private Nurse nurse;

    private Patient patient;
    private  Equipment equipment;

    public Optometry() {
    }

    public Optometry(Doctor doctors, Nurse nurse, Patient patient, Equipment equipment) {
        this.doctors = doctors;
        this.nurse = nurse;
        this.patient = patient;
        this.equipment = equipment;
    }

    public Doctor getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctor doctors) {
        this.doctors = doctors;
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
        return "HospitalSystem.Optometry{" +
                "doctors=" + doctors +
                ", nurse=" + nurse +
                ", patient=" + patient +
                ", equipment=" + equipment +
                '}';
    }
}
