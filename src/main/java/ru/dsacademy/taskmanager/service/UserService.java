package ru.dsacademy.taskmanager.service;

import org.springframework.stereotype.Service;
import ru.dsacademy.taskmanager.dto.request.TaskDto;
import ru.dsacademy.taskmanager.dto.request.UserDto;
import ru.dsacademy.taskmanager.dto.response.NewUserDto;

import java.util.List;

@Service
public interface UserService {
    UserDto createUser(NewUserDto newUserDto);

    UserDto getUserById(Long id);

    List<UserDto> getAllUsers();

    List<TaskDto> getTasksByUserId(Long id);
}
