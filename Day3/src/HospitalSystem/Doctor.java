package HospitalSystem;

public class Doctor extends Persons{
    private String specialty;
    private int yearsOfExperience;
    private String degree;
    private boolean isAvailable;

    public Doctor() {
    }

    public Doctor(String name, String idNumber, int age, String gender, String nationality, String specialty,
                  int yearsOfExperience, String degree, boolean isAvailable) {
        super(name, idNumber, age, gender, nationality);
        this.specialty = specialty;
        this.yearsOfExperience = yearsOfExperience;
        this.degree = degree;
        this.isAvailable = isAvailable;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "HospitalSystem.Doctor{" +
                "specialty='" + specialty + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", degree='" + degree + '\'' +
                ", isAvailable=" + isAvailable +
                '}'+super.toString();
    }
}
