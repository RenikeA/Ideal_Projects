package Day2;

public class Librarian extends Person {
      String section ;
    boolean isTrusting;
    String educationQualification;
    String nationality;
    int numOfBooks;
   public  Librarian(){}

    public Librarian(String section, boolean isTrusting, String educationQ, String nationality, int numOfBooks) {
        this.section = section;
        this.isTrusting = isTrusting;
        this.educationQualification = educationQ;
        this.nationality = nationality;
        this.numOfBooks = numOfBooks;
    }

    public Librarian(String name, int id, int phoneNum, String age, String state, String section, boolean isTrusting, String educationQ, String nationality, int numOfBooks) {
        super(name, id, phoneNum, age, state);
        this.section = section;
        this.isTrusting = isTrusting;
        this.educationQualification = educationQ;
        this.nationality = nationality;
        this.numOfBooks = numOfBooks;
    }

    public Librarian(String name, String section, boolean isTrusting, String educationQ, String nationality, int numOfBooks) {
        super(name);
        this.section = section;
        this.isTrusting = isTrusting;
        this.educationQualification = educationQ;
        this.nationality = nationality;
        this.numOfBooks = numOfBooks;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public boolean isTrusting() {
        return isTrusting;
    }

    public void setTrusting(boolean trusting) {
        isTrusting = trusting;
    }

    public String getEducationQualification() {
        return educationQualification;
    }

    public void setEducationQualification(String educationQualification) {
        this.educationQualification = educationQualification;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getNumOfBooks() {
        return numOfBooks;
    }

    public void setNumOfBooks(int numOfBooks) {
        this.numOfBooks = numOfBooks;
    }
}
