using Week4Assignment;

class Program
{
    static void Main()
    {
        List<Car> carList = new List<Car>
        {
            new Car { CarId = 1, Model = "Toyota Camry" },
            new Car { CarId = 2, Model = "Honda Accord" },
            new Car { CarId = 3, Model = "Ford Mustang" },
            new Car { CarId = 4, Model = "Chevrolet Silverado" },
            new Car { CarId = 5, Model = "Nissan Altima" }
        };

        List<Sale> saleList = new List<Sale>
        {
            new Sale{ SaleId = 1, CarId = 3, Quantity = 10 },
            new Sale{ SaleId = 2, CarId = 2, Quantity = 20 },
            new Sale{ SaleId = 3, CarId = 3, Quantity = 500 },
            new Sale{ SaleId = 4, CarId = 4, Quantity = 20 },
            new Sale{ SaleId = 5, CarId = 3, Quantity = 100 },
            new Sale{ SaleId = 6, CarId = 1, Quantity = 50 }
        };

        var result = from car in carList
                     join sale in saleList on car.CarId equals sale.CarId
                     select new
                     {
                         CarId = car.CarId,
                         Model = car.Model,
                         Quantity = sale.Quantity
                     };

        Console.WriteLine("Car ID\tModel\t\t\tQuantity");
        Console.WriteLine("-------------------------------------------");

        foreach (var item in result)
        {
            Console.WriteLine($"{item.CarId}\t{item.Model}\t\t{item.Quantity}");
        }

        //states and capital

        List<State> states = new List<State>
        {
            new State("Abia", "Umuahia"),
            new State("Adamawa", "Yola"),
            new State("Akwa Ibom", "Uyo"),
            new State("Anambra", "Awka"),
            new State("Bauchi", "Bauchi"),
            new State("Bayelsa", "Yenagoa"),
            new State("Benue", "Makurdi"),
            new State("Borno", "Maiduguri"),
            new State("Cross River", "Calabar"),
            new State("Delta", "Asaba"),
            new State("Ebonyi", "Abakaliki"),
            new State("Edo", "Benin City"),
            new State("Ekiti", "Ado Ekiti"),
            new State("Enugu", "Enugu"),
            new State("Gombe", "Gombe"),
            new State("Imo", "Owerri"),
            new State("Jigawa", "Dutse"),
            new State("Kaduna", "Kaduna"),
            new State("Kano", "Kano"),
            new State("Katsina", "Katsina"),
            new State("Kebbi", "Birnin Kebbi"),
            new State("Kogi", "Lokoja"),
            new State("Kwara", "Ilorin"),
            new State("Lagos", "Ikeja"),
            new State("Nasarawa", "Lafia"),
            new State("Niger", "Minna"),
            new State("Ogun", "Abeokuta"),
            new State("Ondo", "Akure"),
            new State("Osun", "Oshogbo"),
            new State("Oyo", "Ibadan"),
            new State("Plateau", "Jos"),
            new State("Rivers", "Port Harcourt"),
            new State("Sokoto", "Sokoto"),
            new State("Taraba", "Jalingo"),
            new State("Yobe", "Damaturu"),
            new State("Zamfara", "Gusau")
        };

        var groupedStates = states.GroupBy(state => state.Name.ToUpper()[0])
                                  .OrderBy(group => group.Key);

        foreach (var group in groupedStates)
        {
            Console.WriteLine($"Group {group.Key} - {group.Count()}");
            Console.WriteLine("----------------------");
            foreach (var state in group)
            {
                Console.WriteLine(state.Name);
            }
            Console.WriteLine();



            List<string> stateList = new List<string>
        {
        "Abia", "Adamawa","Akwa-Ibom", "Anambra","Bauchi","Bayelsa",
        "Benue","Borno","Cross River", "Delta", "ebonyi","Edo",
        "Ekiti","Enugu", "Gombe","Imo","Jigawa","Kaduna","Kano","Katsina",
        "Kano","Ogun","Osun","Oyo","Plateau","Rivers","Sokoto","Taraba","Yobe",
        "Zamfara"
        };


            int groupsize = 3; //the size of the each group

            // linq to group the state
            var groupStates = states.Select((state, index) => new { state, index })
                .GroupBy(item => item.index / groupsize, item => item.state);

            //grouped states
            Console.WriteLine($"Group of state in sets of {groupsize}:");
            Console.WriteLine("========================");

            foreach (var group1 in groupStates)
            {
                Console.WriteLine(string.Join(",", group));
                Console.WriteLine("----------------------------------");
            }



        }

        { }
    }
}

