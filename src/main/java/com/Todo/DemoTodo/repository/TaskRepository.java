package com.Todo.DemoTodo.repository;

import com.Todo.DemoTodo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}