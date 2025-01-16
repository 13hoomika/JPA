package com.xworkz.ridingapp.service;

import com.xworkz.ridingapp.entity.RideEntity;

public interface RideService {
    void persist(RideEntity rideEntity);
    void update(int id, Double fare);
}
