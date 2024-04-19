//Console.WriteLine("hello, what's your name?");
//var name = Console.ReadLine();
//Console.WriteLine($"Your name is {name}");



//Console.WriteLine("how are you ?");
//var greeting = Console.ReadLine();
//Console.WriteLine($" Fine {greeting} ");
//// No space should be between string interpolation 


//Console.WriteLine("input your name ");
//var chris = Console.ReadLine();
//Console.WriteLine($"My name is {chris}");

string word = "Delusion";
string Word= word.Substring(0, 5);// Taking position 0 and five characters 
string newword = word.Substring(7);

Console.WriteLine(Word);

string fruits = "apple,banana, pineapple, orange";
string[] Fruit = fruits.Split(',');
foreach (var fruitss in Fruit)
{
    Console.WriteLine(fruitss);
}

string names = "obasanjo";
string[] Myname = names.Split("a");
foreach (var names2 in Myname)
{
    Console.WriteLine(names2);
}

static int Countwords(string s)
{
    var splitWord = s.Split(" ");
    return splitWord.Length;
}

Console.WriteLine("Enter words :");
var wordEntered = Console.ReadLine();

var count = Countwords(wordEntered);
Console.WriteLine(count);

//var greeting = Console.ReadLine();


// collection
   
