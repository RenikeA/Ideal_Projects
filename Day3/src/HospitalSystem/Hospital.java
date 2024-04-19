package HospitalSystem;

public class Hospital {
    private Department department;

    public Hospital() {
    }

    public Hospital(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "HospitalSystem.Hospital{" +
                "department=" + department +
                '}';
    }
}
