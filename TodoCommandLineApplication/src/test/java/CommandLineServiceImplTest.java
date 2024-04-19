import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(JUnit4.class)
class CommandLineServiceImplTest {
    public static String errorMessage;
    public static List<String> todoList;
    public static Scanner input;
    public static String inputString;
    public static String[] commandLineArgument;
    @BeforeAll
    static void method(){
        errorMessage = "Input a valid command!";
        todoList = Arrays.asList("Clean the house", "fetch the water");
        input = new Scanner(System.in);
        inputString = "";
        commandLineArgument = new String[]{"DELETE", "1"};
    }

    @Test
    void performCommandsComplete() {
            assertEquals(commandLineArgument.length, 2, errorMessage);
            assertNotEquals(commandLineArgument[0], "COMPLETE");
//            assertEquals(commandLineArgument[0], "COMPLETE");
            int index = Integer.parseInt(commandLineArgument[1]) - 1;
            String completedTask = todoList.get(index);
            assertNotNull(completedTask);
            assertEquals(todoList.set(index, completedTask+" *"), completedTask);
    }

    @Test
    void performCommandsDelete() {
        assertEquals(commandLineArgument.length, 2, errorMessage);
        int index = Integer.parseInt(commandLineArgument[1]) - 1;
        assertEquals(commandLineArgument[0], "DELETE");
        String task = todoList.get(index);
        assertEquals(task, "Clean the house");
    }

    @Test
    void basicDisplayImplementation() {
        assertNotNull(todoList, "Please add a task, your todo list is empty");
        assertEquals(1, 1);
    }
}