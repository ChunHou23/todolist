package lch.project.todolist.repository;

import lch.project.todolist.model.AccountConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountConfigRepository extends JpaRepository<AccountConfig, Long> {
    @Query("SELECT a FROM AccountConfig a WHERE a.accountNatureId = :accountNatureId")
    List<AccountConfig> findByAccountNatureId(@Param("accountNatureId") Long accountNatureId);
}
