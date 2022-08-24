package com.nseit.SpringBootToDo.service;

import com.nseit.SpringBootToDo.model.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nseit.SpringBootToDo.repository.ToDoRepository;

import java.util.ArrayList;

@Service

public class ToDoServiceImpl {
    @Autowired
    private ToDoRepository toDoRepository;
    private ArrayList<ToDo> toDos;

    public void addTodo(ToDo toDo) {
        ArrayList<ToDo> toDos = toDoRepository.getToDos();
        toDos.add(toDo);
    }

    public void viewToDo() {
        for (ToDo toDo1 : toDos) {
            System.out.println(toDo1.getId() + "." + toDo1.getName() + "complete status :"
                    + (toDo1.isCompleted() ? "YES" : "NO"));
        }
    }

    public void updateToDo(int id) {
        for (ToDo toDo2 : toDos) {
            if (id == toDo2.getId()) {
                toDo2.setCompleted(true);
                break;
            }

        }
    }

    public void removeToDo(int id) {
        for (ToDo toDo2 : toDoRepository.getToDos()) {
            if (id == toDo2.getId()) {
                toDoRepository.getToDos().remove(toDo2);
            }

        }
    }

}

