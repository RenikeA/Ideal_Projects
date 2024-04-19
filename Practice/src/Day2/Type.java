package Day2;

import Day2.Items;

public class Type {
    private String name;
    private double priceTag;
    private int noOfGoods;
    private Boolean isAvailable;
   private Items items;


    public Type() {
    }

    public Type(String name, double priceTag, int noOfGoods, Boolean isAvailable,Items items) {
        this.name = name;
        this.priceTag = priceTag;
        this.noOfGoods = noOfGoods;
        this.isAvailable = isAvailable;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceTag() {
        return priceTag;
    }

    public void setPriceTag(double priceTag) {
        this.priceTag = priceTag;
    }

    public int getNoOfGoods() {
        return noOfGoods;
    }

    public void setNoOfGoods(int noOfGoods) {
        this.noOfGoods = noOfGoods;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }
}
