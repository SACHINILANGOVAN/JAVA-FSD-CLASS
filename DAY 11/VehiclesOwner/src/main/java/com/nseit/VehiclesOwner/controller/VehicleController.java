package com.nseit.VehiclesOwner.controller;

import com.nseit.VehiclesOwner.model.Vehicle;
import com.nseit.VehiclesOwner.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    public void add(Vehicle vehicle) {
        vehicleService.add(vehicle);
    }

    public void update(Vehicle vehicle) {
        vehicleService.add(vehicle);

    }

    public List<VehicleService> view() {
        return vehicleService.view();

    }

    public void delete() {
        for (Vehicle vehicle : ){


        }


}
