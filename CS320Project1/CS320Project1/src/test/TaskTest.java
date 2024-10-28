package test;

import org.junit.jupiter.api.Test;

import task.Task;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    @Test
    public void testTaskConstructor() {
        Task task = new Task("54321", "Write Code", "Write unit tests for the project");
        assertEquals("54321", task.getTaskId());
        assertEquals("Write Code", task.getName());
        assertEquals("Write unit tests for the project", task.getDescription());
    }

    @Test
    public void testInvalidTask() {
        assertThrows(IllegalArgumentException.class, () -> new Task(null, "Write Code", "Description"));
        assertThrows(IllegalArgumentException.class, () -> new Task("12345678901", "Write Code", "Description"));
    }
}
