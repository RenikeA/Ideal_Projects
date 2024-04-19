package Day2;

public class  Borrowers extends Person{
   private boolean isStudent;
   int workDays;
   public Borrowers(){}

   public Borrowers(boolean isStudent, int workDays) {
      this.isStudent = isStudent;
      this.workDays = workDays;
   }

   public boolean isStudent() {
      return isStudent;
   }

   public void setStudent(boolean student) {
      isStudent = student;
   }

   public int getWorkDays() {
      return workDays;
   }

   public void setWorkDays(int workDays) {
      this.workDays = workDays;
   }
}
