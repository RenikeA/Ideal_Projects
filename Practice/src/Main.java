import java.text.NumberFormat;
import java.util.Arrays;

public class Main{
    public static void main(String []args){
        //int age = 30;
        //String name = "kiki";
       // System.out.println(age + " ," + name );

        // byte age =30;
        // long viewsCount = 2_090_984_67l;
        // float price = 10.34 or 10.00f;
        // char letter = 'A' , 'B';
        // boolean isFemale = true / false ;

        //primitive type
         // byte age = 40;// primitive type we don't need to allocate memory
       // Date now = new Date ();// reference type need to allocate memory, used for a complex type.
        //now.setTime(222L);
       // System.out.println(now);
        //byte z = 1;
       // byte y = z;
        //a = 4;
        //Point point1= new Point (1, 1);
         //Point point2 = point1;
        //point1.x= 3;



       // WORKING WITH STRINGS
        String name = "kiki" + "," + "!!";
        System.out.println(name.endsWith("!!"));
        System.out.println(name.startsWith("!!"));
        System.out.println(name.length());
        System.out.println(name.indexOf("k"));
        System.out.println(name.indexOf("phi"));//  it tells us at what a index a specific char is inside of a string
        System.out.println(name.replace("phi", "ki"));// replace a new char or string
        System.out.println(name.toLowerCase());// capital letter
        System.out.println(name.toUpperCase()); //small letter
        System.out.println(name.trim());// get rid of white spaces
        System.out.println(name.contains("kiki")); // tells us whether or not the sting word "kiki" contains kiki returns true or false
        System.out.println(name.charAt(2));// allow us to specify a index in a string and would tell us what character position it is in a string
        System.out.println(name.lastIndexOf("i"));
        System.out.println(name.substring(2, 3));// allows us grab a specific part of our string (3) the index we ant to stop grabbing a character
        /* escape sequences
        String name1 = " hello \"sunbo\"";
        String name3 = "c:\\mac\\... ";
        String nam = "c:\nmac\\... ";// new line
        String na = "c:\tmac\\... ";// tab
        System.out.println(name1);

        //Arrays is a reference type (= new )is needed
        int [] numbers = new int [10];
        numbers [0]=1;
        numbers [1]=2;
        numbers [2]=3;
        numbers [3]=4;
        numbers [4]=6;
        numbers [5]=7;
        numbers [6]=8;
        numbers [7]=9;
        System.out.println(Arrays.toString(numbers));*/


        //int [] numberss = {1,2,3,4,5,6,7,8};
        //Arrays.sort(numberss);
       // System.out.println(numberss.length);

        //Multi dimensional Array = deepTostring to print multidimensional arrays
        ///int [][][] No  = new int [2][3][4];
       // No [0][0][1]=1;
        int [][] Num = {{1,2,3,}, {4,5,6},{6,7,8}};
        System.out.println(Arrays.deepToString(Num));

        //constant
        final float PI = 3.11f; // to create a constant use "FINAL"

        // IMPLICIT CASTING
        //byte > short > int > long > float > double
        double x = 1.1;
        double y= (int ) x + 2 ; // explicit casting can only happen in compatible numbers .
        // wrapper classes double x = 1.1;
          //String x= "1";
           //double y= Integer.parseInt (x )+ 2 ; showing error

        // Formatting Numbers
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(178919.789);
        System.out.println(result);

        System.out.println(" there was a an old lady");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        //VAR
        String CharacterName = "kiki";
        int Age = 60;
        System.out.println("once upon a time there was a  lady named " + CharacterName);
        System.out.println("she is " + Age );
        String CharactersName = "Septa";
       int age = 70;


        System.out.println(" there once a man called " + CharacterName);
        System.out.println(" he was  " + Age + " " + "yearsold" );

        //USER INPUT
      //  Scanner keyboardInput =new Scanner(System.in);
        //System.out.print("Enter Your Country Name :");
       // String Name = keyboardInput.nextLine ();
       // System.out.println("Hello" + " " +Name + "! ");

       // System.out.print("Enter your state:");
       // String state = keyboardInput.nextLine();
       // System.out.println("hello,thats your " + " " + Name + " " + state);

        // calculator

       // Scanner keyboardInput1 =new Scanner(System.in);
       // System.out.println("Enter a number:");// user input
        //double number1 = keyboardInput1.nextDouble();
        //System.out.println("Enter a number:");//
        //double number2 = keyboardInput1.nextDouble();

       // String [] friends = {"morayo", "kiki", "temitope"};
       // System.out.println(friends [0]);
        //System.out.println(friends[2]);
        //friends [2] = " tinuke";

        // calling the Method

        //sayHi("kiki" , 56);// sayHi method
        //sayHi("Temitope", 45);// sayHi method
        //sayHi("Banke", 34);// sayHi method
        //sayHi("Philly", 38);// sayHi method

        //cube(6);
        //int mycube = cube (3);
       // System.out.println(mycube);

        //boolean isFemale = true; //  VARIABLE
        //boolean isTall = true;
            //if (isFemale && isTall){
                //System.out.println("you are a Tall female");
           // }else if(isFemale && !isTall) {
                //System.out.println("you are a female and tall");
           // }else
                //System.out.println("you are a male");

    }
            //METHODS
    //public static void sayHi(String name, int age) {
        //System.out.println("Hello" + name + ", you are " + " " + age +"years old " );
        //System.out.println("Hello" + name);
    }
    //RETURN STATEMENT
  //  public static int cube(int NumToCube){
      //  return (NumToCube * NumToCube * NumToCube);
        // if you want to the value to be returned in string , first change the value on the method to "String" and also type return = "Returned Value;"
        // if you want to return to boolean  do  the same thing with string and the return value would be = return true ;.


        // IF STATEMENT
       // I wake up
            //    if am hungry
             //   i eat breakfast

        // i go out
        //if its sunny
                //i bring out my umbrella
               // else i put on my shade.

   // }
//}


