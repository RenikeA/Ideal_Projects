import java.util.List;

public interface CommandLineService {
    void performCommands(String[] commandLineArgument, List<String> todoList, String errorMessage);
    void basicDisplayImplementation(List<String> todoList);
}
