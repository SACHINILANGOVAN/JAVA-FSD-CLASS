package com.nseit.VehiclesOwner.service;

import com.nseit.VehiclesOwner.model.Vehicle;
import com.nseit.VehiclesOwner.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;

    public void add(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }

    public void update(Vehicle vehicle) {
        vehicleRepository.s(vehicle);

    }

    public List<VehicleService> view() {
        return vehicleRepository.view();

    }

    public void delete() {
        List<VehicleService> vehicleServices = vehicleService.find
        for (Vehicle vehicle :


        }

    }
}
