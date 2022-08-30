package com.nseit.sampletodo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "todo")

public class Todo {
    @Id
    @GeneratedValue
    private int id;
    private String itemName;
    private boolean isCompleted;
}
