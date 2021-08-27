package duke.utils;

import duke.tasks.Task;

import duke.exceptions.InvalidTaskIDException;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<Task>();
    }

    public void add(Task t) {
        this.taskList.add(t);
    }

    public void delete(int index) throws InvalidTaskIDException {
        if (index >= 0 && index < this.taskList.size()) {
            this.taskList.remove(index);
        } else {
            throw new InvalidTaskIDException();
        }
    }

    public Task get(int index) throws InvalidTaskIDException {
        if (index >= 0 && index < this.taskList.size()) {
            return this.taskList.get(index);
        } else {
            throw new InvalidTaskIDException();
        }
    }

    public void markAsCompleted(int index) throws InvalidTaskIDException {
        if (index >= 0 && index < this.taskList.size()) {
            this.taskList.get(index).markAsCompleted();
        } else {
            throw new InvalidTaskIDException();
        }
    }

    public int getSize() {
        return this.taskList.size();
    }

    @Override
    public String toString() {
        List<String> stringsArray = new ArrayList<>();
        for (Task t : this.taskList) {
            stringsArray.add(t.toString());
        }
        String tasks = String.join("\n", stringsArray);
        return "Current List:\n" + "---------------\n" + tasks;
    }
}