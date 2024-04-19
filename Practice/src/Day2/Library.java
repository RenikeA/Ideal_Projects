package Day2;

public class Library {
    private Librarian liberian1;
    private Cleaners cleaners1;
    private Borrowers borrowers;
    public Library (){}

    public Library(Librarian liberian1, Cleaners cleaners1, Borrowers borrowers) {
        this.liberian1 = liberian1;
        this.cleaners1 = cleaners1;
        this.borrowers = borrowers;
    }

    public Librarian getLiberian1() {
        return liberian1;
    }

    public void setLiberian1(Librarian liberian1) {
        this.liberian1 = liberian1;
    }

    public Cleaners getCleaners1() {
        return cleaners1;
    }

    public void setCleaners1(Cleaners cleaners1) {
        this.cleaners1 = cleaners1;
    }

    public Borrowers getBorrowers() {
        return borrowers;
    }

    public void setBorrowers(Borrowers borrowers) {
        this.borrowers = borrowers;
    }
}
