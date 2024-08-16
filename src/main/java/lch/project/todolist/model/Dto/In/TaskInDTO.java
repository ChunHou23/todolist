package lch.project.todolist.model.Dto.In;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TaskInDTO {
    @JsonProperty(value = "task_name")
    private String taskName;
    @JsonProperty(value = "priority")
    private Integer priority;
}
