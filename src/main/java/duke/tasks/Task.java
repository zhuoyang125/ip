package duke.tasks;

/**
 * The Task class encapsulates a task.
 */
public abstract class Task {
    /** Name of the task */
    private String taskname;

    /** Whether the task is completed or not */
    private boolean isCompleted;

    public Task(String taskname) {
        this.taskname = taskname;
        this.isCompleted = false;
    }

    /**
     * Mark the task as completed.
     */
    public void markAsCompleted() {
        this.isCompleted = true;
    }

    /**
     * Returns whether the task is completed or not.
     *
     * @return Boolean value of whether the task is completed.
     */
    public boolean getCompleted() {
        return this.isCompleted;
    }

    /**
     * Returns the name of the task.
     *
     * @return A string of the name of the task.
     */
    public String getTaskName() {
        return this.taskname;
    }

    @Override
    public String toString() {
        return this.taskname + " " + (this.isCompleted ? "[X]" : "[ ]");
    }
}
