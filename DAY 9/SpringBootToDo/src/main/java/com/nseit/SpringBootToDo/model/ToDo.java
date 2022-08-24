package com.nseit.SpringBootToDo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ToDo {
    private  int id;
    private String name;
    private boolean isCompleted;

}
