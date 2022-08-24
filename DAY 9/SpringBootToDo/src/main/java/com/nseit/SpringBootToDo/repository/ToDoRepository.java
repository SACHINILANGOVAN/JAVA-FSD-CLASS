package com.nseit.SpringBootToDo.repository;

import com.nseit.SpringBootToDo.model.ToDo;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Getter
@Repository


public class ToDoRepository {
    private ArrayList<ToDo> toDos = new ArrayList<>();
}
