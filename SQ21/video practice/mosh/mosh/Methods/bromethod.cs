using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace mosh.Methods
{
    internal class Bromethod
    {
        static void jjjj()
        {
            // method = perform a section of code ,whenever its called "invoked",.
            //         benefit = let's reuse code without wrriting it multipletimes.

            
            string name = "kiki"; // argument , string variable =string is the data type
            int age = 23; // int variable = int is the datatype

            singHappyBirthday(name , age );
            
            Console.ReadKey();


        } // NEW METHOD from the main method to invoke , by creating a unique and decriptive name and what it does .
        static void singHappyBirthday(string kiki, int yearsOld)
        {
            Console.WriteLine("happy birthday to you ");
            Console.WriteLine("happy birthday to you ");
            Console.WriteLine("happy birthday dear " + "Kiki"); // string name
            Console.WriteLine("you are " + 23 + "years Old");
        }
    }
}
 