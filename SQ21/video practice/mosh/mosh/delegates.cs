namespace mosh.funcDay8

{
    internal class Delegates
    {
        static string FirstORDefault(Func<List<string>, string, string> search, List<string> list, string term)
        {
          return search(list, term);
        }


        static void delegator(string[] args)
        {
            var list = new List<string> { "Ore", "Kiki", "Abike" };

            Func<List<string>, string, string> search = delegate (List<string> list, string term)
            {
                foreach (var item in list)
                {
                    if (item == term)
                    {
                        return item;
                    }
                }
                return null;
            };

            Console.WriteLine(FirstORDefault(search, list, "Ore"));


        }
        

    }
   
        

}



