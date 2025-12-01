package ru.dsacademy.taskmanager.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.dsacademy.taskmanager.dto.request.TaskDto;
import ru.dsacademy.taskmanager.dto.request.UserDto;
import ru.dsacademy.taskmanager.dto.response.NewUserDto;
import ru.dsacademy.taskmanager.exception.NotFoundException;
import ru.dsacademy.taskmanager.mappers.UserMapper;
import ru.dsacademy.taskmanager.model.User;
import ru.dsacademy.taskmanager.repository.UserRepository;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private UserMapper userMapper;

    @Override
    @Transactional
    public UserDto createUser(NewUserDto newUserDto) {
        User user = userMapper.toUser(newUserDto);
        return userMapper.toUserDto(userRepository.save(user));
    }

    @Override
    public UserDto getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Пользователь с id: " + id + " не найден"));
        return userMapper.toUserDto(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(userMapper::toUserDto)
                .toList();
    }

    //дописать когда будет TaskDto
    @Override
    public List<TaskDto> getTasksByUserId(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Пользователь с id: " + id + " не найден"));

        return user.getTasks()
                .stream()
                .map()
                .toList();
    }
}
