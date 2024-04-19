package Day2;

public class Cleaners extends Person{
    boolean isActive;
    int cleaningDays;
    boolean isFluentInEnglish;
    double yearsOfExperience;
    boolean isFemale;
    public Cleaners(){}

    public Cleaners(boolean isActive, int cleaningDays, boolean isFluentInEnglish, double yearsOfExperience, boolean isFemale) {
        this.isActive = isActive;
        this.cleaningDays = cleaningDays;
        this.isFluentInEnglish = isFluentInEnglish;
        this.yearsOfExperience = yearsOfExperience;
        this.isFemale = isFemale;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getCleaningDays() {
        return cleaningDays;
    }

    public void setCleaningDays(int cleaningDays) {
        this.cleaningDays = cleaningDays;
    }

    public boolean isFluentInEnglish() {
        return isFluentInEnglish;
    }

    public void setFluentInEnglish(boolean fluentInEnglish) {
        isFluentInEnglish = fluentInEnglish;
    }

    public double getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(double yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }
}
