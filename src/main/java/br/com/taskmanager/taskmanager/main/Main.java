package br.com.taskmanager.taskmanager.main;

import br.com.taskmanager.taskmanager.repository.TaskRepository;
import br.com.taskmanager.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class Main {
    private Scanner reader = new Scanner(System.in);
    private TaskService taskService;

    public Main(TaskRepository taskRepository) {
        this.taskService = new TaskService(taskRepository);
    }

    public void DisplayOptions() {
        int option = 0;

        System.out.println("Hello User! Please select an option:");

        while (option != 5) {
            System.out.println("1 - List Tasks");
            System.out.println("2 - Create Task");
            System.out.println("3 - Update Task");
            System.out.println("4 - Delete Task");
            System.out.println("5 - Exit");
            System.out.println("Please type your selected option: ");

            option = reader.nextInt();
            reader.nextLine();

            switch (option) {
                case 1:
                    taskService.listTasks();
                    break;
                case 2:
                    taskService.createTask(reader);
                    break;
            }
        }
    }
}
