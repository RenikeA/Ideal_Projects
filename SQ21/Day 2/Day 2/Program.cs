// See https://aka.ms/new-console-template for more information
using Day_2;

Console.WriteLine("Hello, World!");
int[] number = new int[4];
number = [0,1, 2, 3];
int[,] multi = new int[4, 5];
int[][] jagged = new int[4][];

courseMates[] courseMates =new courseMates[10];


courseMates[0] = new courseMates { Id = 1, name = "Ify" };
courseMates[1] = new courseMates { Id = 2, name = "kenny" };
courseMates[2] = new courseMates { Id = 3, name = "chris" };
courseMates[3] = new courseMates { Id = 4, name = "marks" };
courseMates[4] = new courseMates { Id = 5, name = "banke" };
courseMates[5] = new courseMates { Id = 6, name = "ore" };
courseMates[6] = new courseMates { Id = 7, name = "temitope" };
courseMates[7] = new courseMates { Id = 8, name = "ada" };
courseMates[8] = new courseMates { Id = 9, name = "philip" };
courseMates[9] = new courseMates { Id = 10, name = "ken" };

foreach(var coursemate in courseMates)
{
    Console.WriteLine(coursemate.name);
    Console.WriteLine(coursemate.Id);



}


