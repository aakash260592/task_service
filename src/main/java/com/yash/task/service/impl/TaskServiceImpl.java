package com.yash.task.service.impl;

import com.yash.task.domain.Task;
import com.yash.task.dto.UserDto;
import com.yash.task.external.service.UserService;
import com.yash.task.repository.TaskRepository;
import com.yash.task.service.TaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private UserService userService;

    @Override
    public List<Task> findAll() {
        List<Task> tasks = taskRepository.findAll();
        return taskRepository.findAll();
    }

    @Override
    public Optional<Task> findById(Long taskId) {
        return taskRepository.findById(taskId);
    }

    @Override
    public Optional<Task> save(Task task) {
        boolean isUserExist = Optional.ofNullable(userService.findById(task.getUser()).getBody()).isPresent();
        return isUserExist?Optional.ofNullable(taskRepository.save(task)):Optional.empty();
    }
    @Override
    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public boolean deleteTask(Long taskId) {
        Optional<Task> task = findById(taskId);
        taskRepository.delete(task.get());
        return true;
    }

    @Override
    public List<Task> findByUser(Long userId) {
        return taskRepository.findByUser(userId);
    }

}
