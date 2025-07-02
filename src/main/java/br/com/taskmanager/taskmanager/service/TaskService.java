package br.com.taskmanager.taskmanager.service;

import br.com.taskmanager.taskmanager.model.Task;
import br.com.taskmanager.taskmanager.repository.TaskRepository;

import java.util.Scanner;

public class TaskService {
    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void listTasks() {
        var tasks = taskRepository.findAll();
        tasks.forEach(System.out::println);
    }

    public void createTask(Scanner reader) {
        var status = "to-do";

        System.out.println("Please type the task title: ");
        var title = reader.nextLine();

        System.out.println("Please type the task description: ");
        var description = reader.nextLine();


        System.out.println("Please type the task due date: ");
        var dueDate = reader.nextLine();

        taskRepository.save(new Task(title, description, status, dueDate));
        System.out.println("Task created successfully!");
    }
}
