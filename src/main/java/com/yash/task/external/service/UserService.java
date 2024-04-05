package com.yash.task.external.service;

import com.yash.task.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "USER-SERVICE")
public interface UserService {
    @GetMapping(value = "/user/{userId}")
    public ResponseEntity<UserDto> findById(@PathVariable Long userId);
}
