package com.nseit.VehiclesOwner.service;

import com.nseit.VehiclesOwner.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
    @Autowired
    private VehicleService vehicleService;

    public static void add(Vehicle vehicle) {
        Vehicle.add(vehicle);
    }

    public void update(Vehicle vehicle) {
        Vehicle.add(vehicle);

    }

    public List<VehicleService> view() {
        return Vehicle.

    }

    public void delete() {

    }
}
