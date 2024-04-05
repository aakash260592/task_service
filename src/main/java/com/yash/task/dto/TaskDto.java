package com.yash.task.dto;

import com.yash.task.domain.TaskPriority;
import com.yash.task.domain.TaskStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskDto {
    private Long id;
    private String title;
    private String description;
    private Date dueDate;
    private TaskStatus status;
    private TaskPriority priority;
    private User user;
}
