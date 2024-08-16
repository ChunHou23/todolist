package lch.project.todolist.repository;

import lch.project.todolist.model.AccountNature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountNatureRepository extends JpaRepository<AccountNature, Long> {
}
