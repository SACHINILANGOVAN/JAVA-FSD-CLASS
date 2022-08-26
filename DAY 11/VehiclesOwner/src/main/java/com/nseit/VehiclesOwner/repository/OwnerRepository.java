package com.nseit.VehiclesOwner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository {
    public interface ownerRepository extends JpaRepository<OwnerRepository,Integer> {

    }
}
