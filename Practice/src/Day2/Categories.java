package Day2;

import Day2.Type;

public class Categories {
    private String electronics;
    private String fashion;
    private String Accessories;
    private String Groceries;
    private String vegetables;
    private String freshMeat;
    private Type type;

    public Categories() {
    }

    public Categories(String electronics, String fashion, String accessories, String groceries,
                      String vegetables, String freshMeat, Type type) {
        this.electronics = electronics;
        this.fashion = fashion;
        Accessories = accessories;
        Groceries = groceries;
        this.vegetables = vegetables;
        this.freshMeat = freshMeat;
        this.type = type;
    }

    public String getElectronics() {
        return electronics;
    }

    public void setElectronics(String electronics) {
        this.electronics = electronics;
    }

    public String getFashion() {
        return fashion;
    }

    public void setFashion(String fashion) {
        this.fashion = fashion;
    }

    public String getAccessories() {
        return Accessories;
    }

    public void setAccessories(String accessories) {
        Accessories = accessories;
    }

    public String getGroceries() {
        return Groceries;
    }

    public void setGroceries(String groceries) {
        Groceries = groceries;
    }

    public String getVegetables() {
        return vegetables;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    public String getFreshMeat() {
        return freshMeat;
    }

    public void setFreshMeat(String freshMeat) {
        this.freshMeat = freshMeat;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
