package ru.dsacademy.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dsacademy.taskmanager.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
