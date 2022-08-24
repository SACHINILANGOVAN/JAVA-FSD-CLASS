package com.nseit.SpringBootToDo;

import com.nseit.SpringBootToDo.model.ToDo;
import com.nseit.SpringBootToDo.service.ToDoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootToDoApplication implements CommandLineRunner {
    @Autowired
    private ToDoServiceImpl toDoService;

    public static void main(String[] args) {

        SpringApplication.run(SpringBootToDoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ToDo toDo = new ToDo(1, "aaa", false);
        ToDo toDo1 = new ToDo(2, "bbb", false);
        ToDo toDo2 = new ToDo(3, "ccc", false);
        toDoService.addTodo(toDo);
        toDoService.addTodo(toDo1);
        toDoService.addTodo(toDo2);

        toDoService.viewToDo();

        toDoService.updateToDo(1);
        toDoService.removeToDo(2);
        toDoService.viewToDo();
    }
}
