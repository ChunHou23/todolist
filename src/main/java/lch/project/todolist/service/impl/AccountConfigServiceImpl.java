package lch.project.todolist.service.impl;

import lch.project.todolist.model.AccountConfig;
import lch.project.todolist.repository.AccountConfigRepository;
import lch.project.todolist.service.AccountConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountConfigServiceImpl implements AccountConfigService {
    @Autowired
    private AccountConfigRepository accountConfigRepository;

    @Override
    public List<AccountConfig> getAllAccountConfig() {
        return accountConfigRepository.findAll();
    }

    @Override
    public AccountConfig getAccountConfigById(Long accountConfigId) {
        return accountConfigRepository.findById(accountConfigId).orElse(null);
    }

    @Override
    public List<AccountConfig> getAccountConfigByNatureId(Long accountNatureId) {
        return accountConfigRepository.findByAccountNatureId(accountNatureId);
    }
}
