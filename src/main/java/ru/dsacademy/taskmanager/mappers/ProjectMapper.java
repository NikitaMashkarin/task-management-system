package ru.dsacademy.taskmanager.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import ru.dsacademy.taskmanager.dto.request.ProjectDto;
import ru.dsacademy.taskmanager.dto.response.UpdateProjectDto;
import ru.dsacademy.taskmanager.model.Project;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProjectMapper {
    ProjectDto toProjectDto(Project project);

    Project toProject(ProjectDto projectDto);

    Project toProject(UpdateProjectDto updateProjectDto);
}
