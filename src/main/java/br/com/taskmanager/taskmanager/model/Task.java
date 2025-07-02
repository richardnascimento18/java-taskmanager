package br.com.taskmanager.taskmanager.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {
    @Id()
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String title;
    private String description;
    private String status;
    private String dueDate;

    public Task() {}

    public Task(String title, String description, String status, String dueDate) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return String.format(
            "Task (id='%s') - title='%s' - status='%s' - dueDate='%s': \ndescription='%s'",
            id, title, status, dueDate, description
        );
    }
}