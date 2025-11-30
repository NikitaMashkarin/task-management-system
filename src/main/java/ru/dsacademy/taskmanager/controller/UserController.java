package ru.dsacademy.taskmanager.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.dsacademy.taskmanager.dto.request.UserDto;
import ru.dsacademy.taskmanager.dto.response.NewUserDto;
import ru.dsacademy.taskmanager.model.Task;
import ru.dsacademy.taskmanager.service.UserService;

import java.util.List;

@RestController("/api/users")
@RequiredArgsConstructor
@RequestMapping
@Validated
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<UserDto> getAllUsers() {

    }

    @GetMapping("/{id}")
    public List<UserDto> getUserById(@PathVariable @Positive Long id) {

    }

    @GetMapping("/{id}/tasks")
    public List<Task> getTasksByUserId(@PathVariable @Positive Long id) {

    }

    @PostMapping
    public UserDto createUser(@RequestBody @Valid NewUserDto newUserDto){

    }
}
