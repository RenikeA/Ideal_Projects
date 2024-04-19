import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main extends CommandLineServiceImpl{
    public static void main(String[] args) {

        String errorMessage = "Input a valid command!\n";
        List<String> todoList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Main mainInstance = new Main();
        String inputString = "";

        System.out.println("INSTRUCTIONS:\n 1. TYPE YOUR TASK AND HIT 'ENTER' TO ADD" +
                " \n 2. 'CLOSE' TERMINATES THE PROGRAM " +
                "\n 3. 'COMPLETE' FOLLOWED BY THE TASK NUMBER MARKS A TASK AS DONE I.E COMPLETE 1" +
                "\n 1. 'DELETE' FOLLOWED BY THE TASK NUMBER DELETES A TASK I.E DELETE 1" +
                "\n");

        while(!inputString.equalsIgnoreCase("close")){
        mainInstance
                .basicDisplayImplementation(todoList);
        inputString = input.nextLine();

        if (inputString.toUpperCase().contains("COMPLETE")||inputString.toUpperCase().contains("DELETE")){
            String[] command = inputString.split(" ");
            mainInstance
                    .performCommands(command,
                    todoList,
                    errorMessage);
            continue;
        }
        if (inputString.isBlank()){
            continue;
        }
        todoList.add(inputString.toUpperCase());
        }
    }
}
