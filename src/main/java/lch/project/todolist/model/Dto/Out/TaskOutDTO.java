package lch.project.todolist.model.Dto.Out;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDate;

@Data
public class TaskOutDTO {
    private Long id;
    private Long userId;
    private String name;
    private Integer priority;
    private Integer status;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}

