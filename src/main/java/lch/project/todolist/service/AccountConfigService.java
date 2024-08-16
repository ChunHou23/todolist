package lch.project.todolist.service;

import lch.project.todolist.model.AccountConfig;

import java.util.List;

public interface AccountConfigService {
    List<AccountConfig> getAllAccountConfig();
    AccountConfig getAccountConfigById(Long accountConfigId);
    List<AccountConfig> getAccountConfigByNatureId(Long accountNatureId);
}
