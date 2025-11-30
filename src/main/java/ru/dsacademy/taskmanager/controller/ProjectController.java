package ru.dsacademy.taskmanager.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.dsacademy.taskmanager.dto.request.ProjectDto;
import ru.dsacademy.taskmanager.dto.response.UpdateProjectDto;
import ru.dsacademy.taskmanager.model.Task;
import ru.dsacademy.taskmanager.service.ProjectService;

import java.awt.print.Pageable;
import java.util.List;

@RestController("/api/projects")
@RequiredArgsConstructor
@RequestMapping
@Validated
public class ProjectController {
    private final ProjectService projectService;

    @GetMapping
    public List<ProjectDto> getProjects(Pageable pageable) {

    }

    @GetMapping("/{id}")
    public ProjectDto getProjectById(@PathVariable @Positive Long id) {

    }

    @PutMapping("/{id}")
    public ProjectDto updateProject(@PathVariable @Positive Long id,
                                    @RequestBody @Valid UpdateProjectDto updateProjectDto) {

    }

    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable @Positive Long id) {

    }

    @GetMapping("/{id}/tasks")
    public List<Task> getTasksByProjectId(@PathVariable @Positive Long id) {

    }
}
