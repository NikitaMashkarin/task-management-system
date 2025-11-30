package ru.dsacademy.taskmanager.dto.response;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import ru.dsacademy.taskmanager.model.Role;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class NewUserDto {
    @NotBlank
    private String email;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    private Role role;
}
