import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        List<String>listOfNames = Arrays.asList("Home", "Hello", "People", "Hope", "Hogwarts");
//        for (int i = listOfNames.size()-1; i>0; i--){
//            System.out.println(listOfNames.get(i));
//        for (int i = 0; i <listOfNames.size(); i++) {

             List<Object> listOfNames = Arrays.asList("Home", "Hello", true, "Hope", 1);
            for (Object name: listOfNames){
                System.out.println(name);
            }
            int n = 10;
            if (n > 10)
                System.out.println(">10");
            else if (n==10)
                    System.out.println("=10");
                else
                    System.out.println("<10");
    }

          // SWITCH , TO MAKE A DECISION IN JAVA

}
