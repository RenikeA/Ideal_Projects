package HospitalSystem;

public class Nurse extends Persons{
    private  double salary;
    private String qualification;    private String shiftDays;

    private String bodyType;

    public Nurse() {
    }

    public Nurse(String name, String idNumber, int age, String  gender, String nationality,
                 double salary, String shiftDays, String qualification, String bodyType) {
        super(name, idNumber, age, gender, nationality);
        this.salary = salary;
        this.shiftDays = shiftDays;
        this.qualification = qualification;
        this.bodyType = bodyType;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getShiftDays() {
        return shiftDays;
    }

    public void setShiftDays(String shiftDays) {
        this.shiftDays = shiftDays;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "HospitalSystem.Nurse{" +
                "salary=" + salary +
                ", shiftDays='" + shiftDays + '\'' +
                ", qualification='" + qualification + '\'' +
                ", bodyType='" + bodyType + '\'' +
                '}'+ super.toString();
    }
}
