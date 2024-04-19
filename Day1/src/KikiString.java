public class KikiString
{
    private String name = "kiki";
    private String country = "Nigeria";
    private int id = 9;

    public KikiString() {
    }

    public KikiString(String name, String country, int id) {
        this.name = name;
        this.country = country;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
