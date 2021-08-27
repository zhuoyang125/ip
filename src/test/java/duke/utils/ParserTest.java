package duke.utils;

import duke.exceptions.DukeException;
import duke.tasks.ToDo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParserTest {
    @Test
    public void parseInput_validTodoCommand_success() throws DukeException {
        TaskList taskList = new TaskList();
        Parser parser = new Parser();
        parser.parseInput(taskList, "todo make lunch");
        String expected = "Current List:\n" + "---------------\n" +
                "ToDo: make lunch [ ]";
        assertEquals(expected, taskList.toString());
    }

    @Test
    public void parseInput_validDeleteCommand_success() throws DukeException {
        TaskList taskList = new TaskList();
        ToDo todo = new ToDo("make lunch");
        taskList.add(todo);
        Parser parser = new Parser();
        parser.parseInput(taskList, "delete 1");
        String expected = "Current List:\n" + "---------------\n";
        assertEquals(expected, taskList.toString());
    }
}