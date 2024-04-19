using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace mosh.Methods
{
     class Returnmethod
    {
        static void method ()
        {
            // return = returns data back to the place where a method is invoked 

            // first declare the variable that you need

            double x;
            double y;
            double result;

            Console.WriteLine(" Enter in number 1:");
            x = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("Enter in number 2:");
            y = Convert.ToDouble(Console.ReadLine());
            result = Multiply(x, y);
            Console.WriteLine(result);

            Returnmethod multiply; 
            

           
             

            Console.ReadKey();
        }

        static double Multiply( double x , double y ) // datatype  used here = double , replace the void to any datatype you are returning, in this case it is "double"
        {
            double z = x * y;
            return z;
            // or 
            return   x * y;
        }
    }
}
