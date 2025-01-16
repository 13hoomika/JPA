package com.xworkz.ridingapp.repository;

import com.xworkz.ridingapp.entity.RideEntity;

public interface RideRepository {
    boolean persist(RideEntity rideEntity);
    int update(int id,Double fare);
}
