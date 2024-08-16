package lch.project.todolist.service.impl;

import lch.project.todolist.model.AccountNature;
import lch.project.todolist.repository.AccountNatureRepository;
import lch.project.todolist.service.AccountNatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountNatureServiceImpl implements AccountNatureService {
    @Autowired
    private AccountNatureRepository accountNatureRepository;

    @Override
    public List<AccountNature> getAllAccountNature() {
        return accountNatureRepository.findAll();
    }

    @Override
    public AccountNature getAccountNatureById(Long accountNatureId) {
        return accountNatureRepository.findById(accountNatureId).orElse(null);
    }
}
