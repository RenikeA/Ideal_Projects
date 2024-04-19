package Day2;

public class Items {

    private double costPerUnit;
    private String expiryDate;
    private String Date;
    public Items() {
    }

    public Items(double costPerUnit, String expiryDate, String date) {
        this.costPerUnit = costPerUnit;
        this.expiryDate = expiryDate;
        Date = date;
    }

    public double getCostPerUnit() {
        return costPerUnit;
    }

    public void setCostPerUnit(double costPerUnit) {
        this.costPerUnit = costPerUnit;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
