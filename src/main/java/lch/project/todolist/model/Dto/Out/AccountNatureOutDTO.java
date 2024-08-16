package lch.project.todolist.model.Dto.Out;

import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDate;

@Data
public class AccountNatureOutDTO {
    private Long id;
    private String name;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
