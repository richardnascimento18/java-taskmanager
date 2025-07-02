package br.com.taskmanager.taskmanager;

import br.com.taskmanager.taskmanager.config.EnvLoader;
import br.com.taskmanager.taskmanager.main.Main;
import br.com.taskmanager.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskmanagerApplication implements CommandLineRunner {
	@Autowired
	private TaskRepository taskRepository;

	public static void main(String[] args) {
		EnvLoader.load();
		SpringApplication.run(TaskmanagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main(taskRepository);
		main.DisplayOptions();
	}
}
