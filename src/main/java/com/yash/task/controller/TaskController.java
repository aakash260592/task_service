package com.yash.task.controller;

import com.yash.task.domain.Task;
import com.yash.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/all")
    ResponseEntity<List<Task>> findAll() {
        return ResponseEntity.ok(taskService.findAll());
    }

    @GetMapping("/{taskId}")
    ResponseEntity<Task> findById(@PathVariable Long taskId) {
        return ResponseEntity.ok(taskService.findById(taskId).get());
    }

    @PostMapping("/save")
    ResponseEntity<Task> save(@RequestBody Task task) {
        return ResponseEntity.ok(taskService.save(task).get());
    }

    @PutMapping("/update")
    ResponseEntity<Task> updateTask(@RequestBody Task task) {
        return ResponseEntity.ok(taskService.updateTask(task));
    }

    @DeleteMapping("/{taskId}")
    ResponseEntity<Boolean> deleteTask(@PathVariable Long taskId) {
        return ResponseEntity.ok(taskService.deleteTask(taskId));
    }

    @GetMapping("/user/{userId}")
    ResponseEntity<List<Task>> findByUser(@PathVariable Long userId) {
        return ResponseEntity.ok(taskService.findByUser(userId));
    }

}
