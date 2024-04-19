package Day2;

import Day2.Categories;
import Day2.Type;

public class Store {
    private Day2.Categories Categories;


    public Store() {
    }

    public Store(Categories categories, Type type) {
        this.Categories = categories;

    }

    public Categories getCategories() {
        return Categories;
    }

    public void setCategories(Categories categories) {
        Categories = categories;
    }
}


