using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace mosh.Array
{
    class BroArr

    {

        static void arr()
        {
            string[] Cars = { "Gwagon", " Cardillac", "Rangerover" };
            Cars[0] = "Benz"; // to update your array, so instead of starting with gwagon [0]it start with benz.

            /* Console.WriteLine(Cars[0]); // write line statement for each individual variables
             Console.WriteLine(Cars[1]);
             Console.WriteLine(Cars[2]);
            

            // how to declare an array with fixed size

            String[] Car= new string[4];

           // update the value of the size 
            cars [0] ="Gwagon" ;
            cars [1]= "cardillac" ;
            cars [2]= "Rangerover" ;
            cars [3]= "Bemz" ;
            
            */


            // creating a for loop
            for (int i = 0; i < Cars.Length; i++)// int i equals 0 , we will continue this as long as i is less than the length.
            {
                Console.WriteLine(Cars[i]);

                // foreach loop = simpler way to iterate over an array , but it's less flexible 
            }

            foreach( string car in Cars) 
            {
                Console.WriteLine(car);
            }


            Console.ReadKey();


        }
        
        
        
    }
}
