package Day2;

public class mainStore {
    public static void main(String[] args) {

        Store kikiStore = new Store();
        Store kikiStoreA = new Store();
        Store kikiStoreB = new Store();
        Store kikiStoreC = new Store();
        Store kikiStoreD = new Store();
        Store kikiStoreE = new Store();

        Categories electronics = new Categories();
        electronics.setType(new Type("philips", 89_000,13,
                false, new Items(30_000,"3_12_2025","20_3_2022") ));
        kikiStore.setCategories(electronics);

        Categories fashion = new Categories();
                fashion.setType (new Type("Moray",50_000,14,true,
                new Items(18_000,"23_4_2025","2_4_8")));
                kikiStoreA.setCategories(fashion);

        Categories accessories = new Categories();
        accessories.setType (new Type("karl",50_000,14,true,
                new Items(10_000,"null","16_03_24")));
        kikiStoreB.setCategories(accessories);

        Categories groceries = new Categories();
        groceries.setType (new Type("groceries",50_000,14,true,
                new Items(18_000,"23_4_2025","2_4_8")));
        kikiStoreC.setCategories(groceries);

        Categories vegetables = new Categories();
        vegetables.setType (new Type("Lettuce",350,0,true,
                new Items(100,"null","18_03_24")));
        kikiStoreD.setCategories(vegetables);

        Categories freshMeats = new Categories();
        freshMeats.setType (new Type("freshy",1_500,14,true,
                new Items(18_000,"18_3_2024","15_03_24")));
        kikiStoreE.setCategories(freshMeats);

    }

}
