package com.yash.task.service;

import com.yash.task.domain.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    List<Task> findAll();

    Optional<Task> findById(Long taskId);

    Optional<Task> save(Task task);

    Task updateTask(Task task);

    boolean deleteTask(Long taskId);

    List<Task> findByUser(Long userId);
}
