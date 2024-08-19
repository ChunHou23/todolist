package lch.project.todolist.business;

import lch.project.todolist.model.AccountConfig;
import lch.project.todolist.model.AccountNature;
import lch.project.todolist.model.Dto.Out.*;
import lch.project.todolist.model.Task;
import lch.project.todolist.model.User;
import lch.project.todolist.service.AccountConfigService;
import lch.project.todolist.service.AccountNatureService;
import lch.project.todolist.service.TaskService;
import lch.project.todolist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserBusiness {
    @Autowired
    private UserService userService;
    @Autowired
    private AccountConfigService accountConfigService;
    @Autowired
    private AccountNatureService accountNatureService;
    @Autowired
    private TaskService taskService;

    public UserInformationOutDTO getMockUserInformation(Long userId, Integer pageCode) {
        UserInformationOutDTO userInformationOutDTO = new UserInformationOutDTO();

        UserOutDTO userInfo = getUserInfo(1L);
        AccountNatureOutDTO userAccountNatureInfo = getAccountNatureInfo(userInfo.getAccountNatureId());
        List<AccountConfigOutDTO> userAccountConfigInfo = getAccountConfigInfo(userInfo.getAccountNatureId());
        List<TaskOutDTO> userTaskInfo = getTaskInfo(userInfo.getId(), pageCode);

        userInformationOutDTO.setUserInfo(userInfo);
        userInformationOutDTO.setAccountNatureInfo(userAccountNatureInfo);
        userInformationOutDTO.setAccountConfigInfo(userAccountConfigInfo);
        userInformationOutDTO.setTaskInfo(userTaskInfo);

        return userInformationOutDTO;
    }

    private UserOutDTO getUserInfo(Long userId) {
        User user = userService.getUserById(userId);
        UserOutDTO userOutDTO = new UserOutDTO();
        userOutDTO.setId(user.getId());
        userOutDTO.setAge(user.getAge());
        userOutDTO.setEmail(user.getEmail());
        userOutDTO.setName(user.getName());
        userOutDTO.setBirthday(user.getBirthday());
        userOutDTO.setPhone(user.getPhone());
        userOutDTO.setAccountNatureId(user.getAccountNatureId());
        userOutDTO.setCreatedAt(user.getCreatedAt());
        userOutDTO.setUpdatedAt(user.getUpdatedAt());

        return userOutDTO;
    }

    private AccountNatureOutDTO getAccountNatureInfo(Long natureId) {
        AccountNature accountNature = accountNatureService.getAccountNatureById(natureId);

        AccountNatureOutDTO accountNatureOutDTO = new AccountNatureOutDTO();
        accountNatureOutDTO.setId(accountNature.getId());
        accountNatureOutDTO.setName(accountNature.getName());
        accountNatureOutDTO.setCreatedAt(accountNature.getCreatedAt());
        accountNatureOutDTO.setUpdatedAt(accountNature.getUpdatedAt());

        return accountNatureOutDTO;
    }

    private List<AccountConfigOutDTO> getAccountConfigInfo(Long natureId) {
        List<AccountConfig> accountConfigList = accountConfigService.getAccountConfigByNatureId(natureId);
        List<AccountConfigOutDTO> accountConfigOutDTOList = new ArrayList<>();

        for (AccountConfig accountConfig : accountConfigList) {
            AccountConfigOutDTO accountConfigOutDTO = new AccountConfigOutDTO();
            accountConfigOutDTO.setId(accountConfig.getId());
            accountConfigOutDTO.setName(accountConfig.getName());
            accountConfigOutDTO.setDefinition(accountConfig.getDefinition());
            accountConfigOutDTO.setAccountNatureId(accountConfig.getAccountNatureId());
            accountConfigOutDTO.setCreatedAt(accountConfig.getCreatedAt());
            accountConfigOutDTO.setUpdatedAt(accountConfig.getUpdatedAt());

            accountConfigOutDTOList.add(accountConfigOutDTO);
        }
        return accountConfigOutDTOList;
    }

    private List<TaskOutDTO> getTaskInfo(Long userId, Integer pageCode) {
        List<Task> taskList = taskService.getTaskByUserIdAndTaskStatus(userId, pageCode);
        List<TaskOutDTO> taskOutDTOList = new ArrayList<>();

        for (Task task : taskList) {
            TaskOutDTO taskOutDTO = new TaskOutDTO();
            taskOutDTO.setId(task.getId());
            taskOutDTO.setUserId(task.getUserId());
            taskOutDTO.setName(task.getName());
            taskOutDTO.setStatus(task.getStatus());
            taskOutDTO.setPriority(task.getPriority());
            taskOutDTO.setCreatedAt(task.getCreatedAt());
            taskOutDTO.setUpdatedAt(task.getUpdatedAt());

            taskOutDTOList.add(taskOutDTO);
        }

        return taskOutDTOList;
    }
}
