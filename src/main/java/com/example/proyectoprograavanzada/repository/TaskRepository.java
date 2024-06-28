package com.example.proyectoprograavanzada.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.proyectoprograavanzada.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
