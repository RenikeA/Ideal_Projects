package HospitalSystem;

public abstract class Persons {
    private String name;
    private String idNumber;
    private int age;
    private String gender;
    private String Nationality;

    public Persons() {
    }

    public Persons(String name, String idNumber, int age, String gender, String nationality) {
        this.name = name;
        this.idNumber = idNumber;
        this.age = age;
        this.gender = gender;
        Nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String  gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    @Override
    public String toString() {
        return "HospitalSystem.Persons{" +
                "name='" + name + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", Nationality='" + Nationality + '\'' +
                '}';
    }
}
