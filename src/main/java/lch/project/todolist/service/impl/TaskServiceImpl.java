package lch.project.todolist.service.impl;

import lch.project.todolist.model.Dto.In.TaskInDTO;
import lch.project.todolist.model.Task;
import lch.project.todolist.repository.TaskRepository;
import lch.project.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTaskById(Long taskId) {
        return taskRepository.findById(taskId).orElse(null);
    }

    @Override
    public List<Task> getTaskByUserIdAndTaskStatus(Long userId, Integer taskStatus) {
        return taskRepository.findByUserIdAndTaskStatus(userId, taskStatus);
    }

    @Override
    public Task insertNewTask(Task task) {
        return taskRepository.save(task);
    }
}
