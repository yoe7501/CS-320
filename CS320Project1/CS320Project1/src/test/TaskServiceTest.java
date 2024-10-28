package test;

import org.junit.jupiter.api.Test;

import task.Task;
import task.TaskService;

import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {

    @Test
    public void testAddTask() {
        TaskService service = new TaskService();
        Task task = new Task("54321", "Write Code", "Write unit tests for the project");
        service.addTask(task);
        assertEquals(task, service.getTask("54321"));
    }

    @Test
    public void testDeleteTask() {
        TaskService service = new TaskService();
        Task task = new Task("54321", "Write Code", "Write unit tests for the project");
        service.addTask(task);
        service.deleteTask("54321");
        assertNull(service.getTask("54321"));
    }

    @Test
    public void testUpdateTask() {
        TaskService service = new TaskService();
        Task task = new Task("54321", "Write Code", "Write unit tests for the project");
        service.addTask(task);
        service.updateTask("54321", "Test Code", "Update tests");
        assertEquals("Test Code", service.getTask("54321").getName());
        assertEquals("Update tests", service.getTask("54321").getDescription());
    }
}
