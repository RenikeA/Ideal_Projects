package HospitalSystem;

public class Department {
    private Optometry optometry;
    private  Gynaecology gynaecology;
    private Medicine medicine ;

    public Optometry getOptometry() {
        return optometry;
    }

    public void setOptometry(Optometry optometry) {
        this.optometry = optometry;
    }

    public Gynaecology getGynaecology() {
        return gynaecology;
    }

    public void setGynaecology(Gynaecology gynaecology) {
        this.gynaecology = gynaecology;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    @Override
    public String toString() {
        return "HospitalSystem.Department{" + '\n' +
                "optometry=" + optometry + '\n' +
                "HospitalSystem.Gynaecology=" + gynaecology + '\n' +
                "HospitalSystem.Medicine=" + medicine +
                '}';
    }
}
