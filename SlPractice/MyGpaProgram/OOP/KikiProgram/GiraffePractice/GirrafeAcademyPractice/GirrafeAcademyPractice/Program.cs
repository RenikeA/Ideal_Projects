using System.ComponentModel.DataAnnotations;
using System.ComponentModel.Design;

namespace GirrafeAcademyPractice
 {
    class Practice
    {
       static void Main(string[] args) // where we write our codes and execute the codes 

        {
           // Console.WriteLine(GetMonth(2));


           //Console.ReadLine();

            Console.WriteLine("enter a number:");
            double num1 = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("enter operator:");
            string operators = Console.ReadLine();

            Console.WriteLine("enter a number:");
            double num2 = Convert.ToDouble(Console.ReadLine());

            if (operators == "+")
            {
                Console.WriteLine(num1 + num2);
            }

            else if (operators == "-")
            {
                Console.WriteLine(num1 - num2);
            }
            else if (operators == "*")
            {
                Console.WriteLine(num1 * num2);
            }
            else if (operators == "/")
            {
                Console.WriteLine(num1 / num2);
            }
            else
            {
                Console.WriteLine("INVALID OPERATOR!");
            };
            Console.ReadLine();





            //IF STATEMENT

            bool isFemale = false;
            bool isFat = false;

            if (isFemale && isFat)
            {
                Console.WriteLine("you are a fat female");

            }
            else if (isFemale && !isFat)
            {
                Console.WriteLine("you are a slim female");
            }
            else if (!isFemale && isFat)
            {
                Console.WriteLine("you are not a female, but you are fat ");
            }
            else
            {
                Console.WriteLine("you are not female and not fat ");
            }

            int CharacterAge;//Declaring a value  
            CharacterAge = 35;// assigning a value 
            string CharacterName = "Banke";




            Console.WriteLine("There was a girl named " + CharacterName);
            Console.WriteLine("she was" + " " + CharacterAge + "years old");
            Console.WriteLine("she really liked moi moi ");
            Console.WriteLine("But didn't want to accept that she likes moimoi");

            CharacterName = "ifeoma";
            Console.WriteLine(CharacterName + " " + "hears about it ");
            Console.WriteLine(CharacterName + " " + "encourages it");
            Console.ReadLine();

            Console.ReadKey();

        }
        static string GetMonth(int MonthNo)
        {
            string MonthName;
            switch (MonthNo) 
            {
                case 0:
                    MonthName = "january;"
                        ; break;
                case 1:
                    MonthName = "february;"
                        ; break;

                case 2:
                    MonthName = "march;"
                        ; break;

                case 3:
                    MonthName = "april;"
                        ; break;

                case 4:
                    MonthName = "may;"
                        ; break;
                case 5:
                    MonthName = "june;"
                        ; break;

                case 6:
                    MonthName = "july;"
                        ; break;

                case 7:
                    MonthName = "august;"
                        ; break;

                case 8:
                    MonthName = "september;"
                        ; break;

                case 9:
                    MonthName = "october;"
                        ; break;

                case 10:
                    MonthName = "november;"
                        ; break;

                case 11:
                    MonthName = "december;"
                        ; break;
                default:

                    MonthName = "invalid month name";
                    break;
            }




            return MonthName;
        }
    }
}
