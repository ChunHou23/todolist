package lch.project.todolist.service;

import lch.project.todolist.model.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAllTask();
    Task getTaskById(Long taskId);
    List<Task> getTaskByUserId(Long userId);
    Task insertNewTask(Task task);
}
