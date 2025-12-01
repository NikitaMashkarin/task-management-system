package ru.dsacademy.taskmanager.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import ru.dsacademy.taskmanager.dto.request.UserDto;
import ru.dsacademy.taskmanager.dto.response.NewUserDto;
import ru.dsacademy.taskmanager.model.User;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {
    UserDto toUserDto(User user);

    User toUser(UserDto userDto);

    User toUser(NewUserDto newUserDto);

}
