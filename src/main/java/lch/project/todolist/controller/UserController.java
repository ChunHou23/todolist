package lch.project.todolist.controller;

import lch.project.todolist.model.Dto.Out.UserOutDTO;
import lch.project.todolist.model.User;
import lch.project.todolist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<UserOutDTO> getAllUser() {
        List<User> userList = userService.getAllUser();

        List<UserOutDTO> userOutDTOList = new ArrayList<>();
        for (User user : userList) {
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

            userOutDTOList.add(userOutDTO);
        }

        return userOutDTOList;
    }

    @GetMapping("/{id}")
    public UserOutDTO getUserById(@RequestParam Long id) {
        User user = userService.getUserById(id);

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
}
