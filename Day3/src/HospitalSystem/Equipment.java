package HospitalSystem;

public class Equipment {
    private String name;
    private String department;
    private double modelID;
    private String size;

    public Equipment() {
    }

    public Equipment(String name, String department, double modelID, String size) {
        this.name = name;
        this.department = department;
        this.modelID = modelID;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getModelID() {
        return modelID;
    }

    public void setModelID(double modelID) {
        this.modelID = modelID;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "HospitalSystem.Equipment{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", modelID=" + modelID +
                ", size='" + size + '\'' +
                '}';
    }
}
