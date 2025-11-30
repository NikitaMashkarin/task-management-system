package ru.dsacademy.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dsacademy.taskmanager.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
