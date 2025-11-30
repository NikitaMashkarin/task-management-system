package ru.dsacademy.taskmanager.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.dsacademy.taskmanager.model.User;

import java.time.LocalDateTime;

@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDto {
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private User createdBy;
}
