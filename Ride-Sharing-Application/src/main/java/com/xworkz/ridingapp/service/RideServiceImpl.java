package com.xworkz.ridingapp.service;

import com.xworkz.ridingapp.entity.RideEntity;
import com.xworkz.ridingapp.repository.RideRepoImpl;
import com.xworkz.ridingapp.repository.RideRepository;

public class RideServiceImpl implements RideService{
    private static RideRepository rideRepository = new RideRepoImpl();
    @Override
    public void persist(RideEntity rideEntity) {
        Boolean saved = rideRepository.persist(rideEntity);
        if (saved){
            System.out.println("Data save successfully");
        }else
        System.out.println("Data not saved!! tru again");
    }

    @Override
    public void update(int id, Double fare) {
        int row = rideRepository.update(id, fare);
        if (row != 0){
            System.out.println(row + " rows updated");
        }else System.out.println(row + " row effected");
    }
}
