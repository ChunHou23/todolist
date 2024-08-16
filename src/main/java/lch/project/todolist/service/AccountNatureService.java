package lch.project.todolist.service;

import lch.project.todolist.model.AccountNature;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountNatureService {
    List<AccountNature> getAllAccountNature();
    AccountNature getAccountNatureById(Long accountNatureId);
}
