package com.Todo.DemoTodo.service;

import com.Todo.DemoTodo.exception.TaskNotFoundException;
import com.Todo.DemoTodo.model.Task;
import com.Todo.DemoTodo.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task create(Task task) {
        task.setId(null);
        task.setCompleted(false);
        return taskRepository.save(task);
    }

    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    public Task getById(Long id) {
        return taskRepository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException(id));
    }

    public Task update(Long id, Task updated) {
        Task existing = getById(id);
        existing.setTitle(updated.getTitle());
        existing.setDescription(updated.getDescription());
        return taskRepository.save(existing);
    }

    public Task markComplete(Long id) {
        Task task = getById(id);
        task.setCompleted(true);
        return taskRepository.save(task);
    }

    public void delete(Long id) {
        getById(id); // throws 404 if it doesn't exist
        taskRepository.deleteById(id);
    }
}