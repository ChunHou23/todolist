package lch.project.todolist.service;

import lch.project.todolist.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User getUserById(Long userId);
}
