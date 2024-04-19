using mosh;
using mosh.Math;
using System;
using System.ComponentModel.Design;
/*
namespace Variables
{ 
    class Program 
    { 
        static void Main(string[] args)
        {





            var number = 2; // variable, 2 is the assingment .....assigned number 
            var count = 10;
            var totalprice = 20.95f;// float ... takes a precision on interger no 
            var character = 'A'; // character 
            var firstname = "kiki";//text
            var boy = false;// true or false 

            Console.WriteLine(number); 
            Console.WriteLine( count);
            Console.WriteLine(totalprice);  
            Console.WriteLine(character);
            Console.WriteLine(firstname);
            Console.WriteLine(boy); 
        }
    
    
    
    
    
    
    
    
    }

}


var number = "1234";
int i = Convert.ToInt32(number);// to convert string to integer with convert.ToInt32.


var list = new List<string>
            {
                "ore",
                "kiki",
                "abike"
            };

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
*/


namespace typeconversion
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine( "how many rows?: ");
            int rows = Convert.ToInt32( Console.ReadLine() );

            Console.WriteLine("how many colums ?: ");
            int colums = Convert.ToInt32( Console.ReadLine() ); 

            Console.WriteLine("what symbols?:");
            String symbol = Console.ReadLine();

            for (int i = 0; i <rows; i ++ )
            {
                for (int j = 0; j <colums; j ++)
                {
                    Console.WriteLine(symbol);
                }
                Console.WriteLine();
            }
        }
            }

       }     
/* Calculatormosh calculatormosh = new Calculatormosh(); // non static 
             calculatormosh.Add(5,6);


             MathsOperations mathsoperations = new MathsOperations(); // static 
             mathsoperations.Divide(16, 4);

            Double total = CheckOut(3.99, 5.75, 15 , 1.00); // the checkout is not making the program run 
            Console.WriteLine(total);
            Console.ReadKey();

            
               



            // byte b = 1; 
            //int i = b;
            //Console.WriteLine(i);
            Testing testing = new Testing(); // Declare a n object (Instance of a class) so we can access the classes methods
            testing.Tester("PRINTED THIS TEXT"); // Use the method "Tester" in the Testing Class using the object we created
            int sum = numbers(1, 3); // how to call a method that was created in the same class
            Console.WriteLine(sum); // Printing the value returned in our method to the console
            Console.WriteLine(numbers(1, 3)); // Printing the vqalue returned without having to assign it to a variable
        }

     public static int numbers (int y, int x) // Create a static method numbers to add 2 integer values and return their sum
        {
            int sum = y + x;
            return sum;
        }
    }
}
// non compatible conversion type 

/*var number = "12345";
int i = Convert.ToInt32(number);
Console.WriteLine( i)
  */


