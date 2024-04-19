package HospitalSystem;

public class Patient extends Persons{
    private double bills;
    private int cardNo;
    private boolean hasAppointment;
    private char bloodGroup;
    private String genotype;

    public Patient() {
    }

    public Patient(String name, String idNumber, int age, String gender, String nationality, double bills,
                   int cardNo, boolean hasAppointment, char bloodGroup, String genotype) {
        super(name, idNumber, age, gender, nationality);
        this.bills = bills;
        this.cardNo = cardNo;
        this.hasAppointment = hasAppointment;
        this.bloodGroup = bloodGroup;
        this.genotype = genotype;
    }

    public double getBills() {
        return bills;
    }

    public void setBills(double bills) {
        this.bills = bills;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public boolean isHasAppointment() {
        return hasAppointment;
    }

    public void setHasAppointment(boolean hasAppointment) {
        this.hasAppointment = hasAppointment;
    }

    public char getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(char bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getGenotype() {
        return genotype;
    }

    public void setGenotype(String genotype) {
        this.genotype = genotype;
    }

    @Override
    public String toString() {
        return "HospitalSystem.Patient{" +
                "bills=" + bills +
                ", cardNo=" + cardNo +
                ", hasAppointment=" + hasAppointment +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", genotype='" + genotype + '\'' +
                '}' + super.toString();
    }
}
