package lch.project.todolist.model.Dto.Out;

import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDate;

@Data
public class UserOutDTO {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private Integer age;
    private Long accountNatureId;
    private LocalDate birthday;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
