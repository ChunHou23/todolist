package lch.project.todolist.model.Dto.Out;

import lombok.Data;

import java.util.List;

@Data
public class UserInformationOutDTO {
    private UserOutDTO userInfo;
    private AccountNatureOutDTO accountNatureInfo;
    private List<AccountConfigOutDTO> accountConfigInfo;
    private List<TaskOutDTO> taskInfo;
}
