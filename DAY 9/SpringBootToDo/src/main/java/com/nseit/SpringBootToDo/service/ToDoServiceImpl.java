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

    public void addTodo(ToDo toDo) {
        ArrayList<ToDo> toDos = toDoRepository.getToDos();
        toDos.add(toDo);
    }

    public void viewToDo() {
        for (ToDo toDo : toDoRepository.getToDos() ) {
            System.out.println(toDo.getId() + "." + toDo.getName() + "complete status :"
                    + (toDo.isCompleted() ? "YES" : "NO"));
        }
    }

    public void updateToDo(int id) {
        for (ToDo toDo : toDoRepository.getToDos()) {
            if (id == toDo.getId()) {
                toDo.setCompleted(true);
                break;
            }

        }
    }

    public void removeToDo(int id) {
        for (ToDo toDo: toDoRepository.getToDos()) {
            if (id == toDo.getId()) {
                toDoRepository.getToDos().remove(toDo);
            }

        }
    }

}

