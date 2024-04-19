package Day2;

public class Main {

    public static void main(String[] args) {
        Cleaners philip = new Cleaners();
        philip.setName("philip");
        Librarian kiki = new Librarian();
        kiki.setName("kiki");
        Borrowers max = new Borrowers();
        max.setName("max");
        Library mylibrary = new Library();
        philip.setName("mylibrary");

        mylibrary.setLiberian1(kiki);
        mylibrary.setCleaners1(philip);
        mylibrary.setBorrowers(max);





    }
}
