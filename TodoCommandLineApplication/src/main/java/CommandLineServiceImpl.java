import java.util.List;

public class CommandLineServiceImpl implements CommandLineService{

    @Override
    public void performCommands(String[] commandLineArgument, List<String> todoList, String errorMessage) {
        if (todoList.isEmpty()){
            System.out.println("Please add a task first.\n");
        }
        if (commandLineArgument.length != 2) {
            System.out.println(errorMessage);
        } else if (commandLineArgument[0].equalsIgnoreCase("COMPLETE")) {
            int index = Integer.parseInt(commandLineArgument[1]) - 1;
            String completedTask = todoList.get(index);
            todoList.set(index, completedTask + " *");

        } else if (commandLineArgument[0].equalsIgnoreCase("DELETE")) {
            int index = Integer.parseInt(commandLineArgument[1]);
            todoList.remove(index - 1);
        }
    }

    @Override
    public void basicDisplayImplementation(List<String> todoList){
        if (todoList.isEmpty()) {
            System.out.println("Please add a task to start your todo list or enter 'close' to terminate program: \n");
        }
        else{
            todoList.forEach(task -> {
                System.out.println(todoList.indexOf(task)+1+" "+task);
            });
            System.out.println("\nEnter command or add task here: ");
        }
    }
}
