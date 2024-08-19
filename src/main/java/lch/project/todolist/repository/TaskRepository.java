package lch.project.todolist.repository;

import lch.project.todolist.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    @Query("SELECT a FROM Task a WHERE a.userId = :userId")
    List<Task> findByUserId(@Param("userId") Long userId);

    @Query("SELECT a FROM Task a WHERE a.userId = :userId AND a.status = :taskStatus")
    List<Task> findByUserIdAndTaskStatus(@Param("userId") Long userId, @Param("taskStatus") Integer taskStatus);
}
