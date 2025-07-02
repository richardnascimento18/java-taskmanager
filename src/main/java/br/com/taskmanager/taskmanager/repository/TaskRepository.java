package br.com.taskmanager.taskmanager.repository;

import br.com.taskmanager.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, String> {}
