namespace video_practice
{
    internal class Program
    {
        public static void Main(string[] args) {

            Class1 class1 = new Class1();
           var add = class1.Add(4, 8);
           var name= class1.Words("kiki");

            Console.WriteLine(name);
            Console.WriteLine(add);    

           /* char[] grades = ['A', 'B', 'C', 'D', 'E', 'F'];

            Console.WriteLine("hi, please enter a score");
            var score = float.Parse(Console.ReadLine());

            char myGrade = 'A';

            if (score >= 70)
            {
                myGrade = grades[0];
            }
            else if (score >= 60)
            {
                myGrade = grades[1];

            }
            else if (score >= 50)
            {
                myGrade = grades[2];

            }
            else if (score >= 45)
            {
                myGrade = grades[3];

            }
            else if (score >= 40)
            {
                myGrade = grades[4];

            } 
            else if (score >= 0)
            {
                myGrade = grades[5];
            }

            Console.WriteLine($"your grade is {myGrade}");*/

        }

    }
 
}









/*if (score >= 69 && score <= 60); 
Console.WriteLine("B");

if (score < 50 && score >= 59) ;
 Console.WriteLine("C");

if (score > 49 && score <= 45) ;
Console.WriteLine("D");

if (score >= 44) ;
Console.WriteLine("try harder");

else 

{
    
}*/