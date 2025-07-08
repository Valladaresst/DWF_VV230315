package com.example.todolist.VV230315_API.repository;

import com.example.todolist.VV230315_API.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByTitleContainingIgnoreCase(String keyword);
}