package ru.dsacademy.taskmanager.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ru.dsacademy.taskmanager.model.User;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateProjectDto {
    private String name;
    private String description;
    private User createdBy;
}
