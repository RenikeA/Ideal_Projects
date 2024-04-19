
namespace Day6; // used to identify and refer object 
class car {// to create an object 
    string color = "green";// used for storing text 
    int speed = 100;
    
    static void main(string[] args)
    {
        car myCar = new car(); // ("new car " is an object )
        Console.WriteLine (myCar.color);
         Console.WriteLine (myCar.speed);   
    }

}