package com.nseit.sample1.model;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    @ManyToOne(optional = false)
    @JoinColumn(name = "position_id", nullable = false,
                referencedColumnName = "p_id")
    private Position position;

    }
