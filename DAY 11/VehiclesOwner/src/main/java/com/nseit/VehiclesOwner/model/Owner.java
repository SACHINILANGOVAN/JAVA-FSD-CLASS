package com.nseit.VehiclesOwner.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
@Data
@Entity
public class Owner {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String vehicleName;
    @OneToMany(mappedBy = "Owner")
    private List<Vehicle> vehicles;

    private Owner(Integer id, String name, String vehicleName) {

    }


}
