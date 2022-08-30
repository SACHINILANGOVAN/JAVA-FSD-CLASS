package com.nseit.sample1.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Data
@Entity
@Table(name = "position")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int p_id;
    private String p_name;
    @OneToMany(mappedBy = "position", cascade = CascadeType.ALL)
    private List<Employee> employee;
    }

