package lch.project.todolist.model.Dto.Out;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDate;

@Data
public class AccountConfigOutDTO {
    private Long id;
    private String name;
    private String definition;
    private Long accountNatureId;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
