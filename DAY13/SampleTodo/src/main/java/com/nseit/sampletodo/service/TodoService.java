package com.nseit.sampletodo.service;

import com.nseit.sampletodo.model.Todo;
import com.nseit.sampletodo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public void add(Todo todo) {
        todoRepository.save(todo);
    }

    public void update(Todo todo) {
        todoRepository.save(todo);
    }

    public List<Todo> view() {
        return todoRepository.findAll();
    }

    public void delete(int id) {
        for (Todo todo : todoRepository.findAll()) {
            if (todo.getId() == id) {
                todoRepository.delete(todo);
            }

        }
    }

}
