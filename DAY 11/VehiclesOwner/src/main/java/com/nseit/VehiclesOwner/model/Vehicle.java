package com.nseit.VehiclesOwner.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Vehicle {
    private Vehicle vehicle;
    @Id
    @GeneratedValue
    private int id;
    private String vehicleName;
    private String vehicleModel;

    public static void add(Vehicle vehicle) {

    }
}
