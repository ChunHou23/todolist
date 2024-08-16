package lch.project.todolist.controller;

import lch.project.todolist.model.Dto.In.TaskInDTO;
import lch.project.todolist.model.Dto.Out.TaskOutDTO;
import lch.project.todolist.model.Task;
import lch.project.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping("/add")
    public TaskOutDTO addNewTask(@RequestBody TaskInDTO taskInDTO) {
        Task task = new Task();
        task.setName(taskInDTO.getTaskName());
        task.setPriority(taskInDTO.getPriority());
        task.setStatus(1);
        task.setUserId(1L);
        task.setCreatedAt(LocalDate.now());
        task.setUpdatedAt(LocalDate.now());

        Task newTask = taskService.insertNewTask(task);

        TaskOutDTO taskOutDTO = new TaskOutDTO();
        taskOutDTO.setId(newTask.getId());
        taskOutDTO.setUserId(newTask.getUserId());
        taskOutDTO.setName(newTask.getName());
        taskOutDTO.setStatus(newTask.getStatus());
        taskOutDTO.setPriority(newTask.getPriority());
        taskOutDTO.setCreatedAt(newTask.getCreatedAt());
        taskOutDTO.setUpdatedAt(newTask.getUpdatedAt());

        return taskOutDTO;
    }
}
