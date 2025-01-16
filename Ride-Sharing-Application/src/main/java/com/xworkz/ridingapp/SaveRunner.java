package com.xworkz.ridingapp;

import com.xworkz.ridingapp.entity.RideEntity;
import com.xworkz.ridingapp.service.RideService;
import com.xworkz.ridingapp.service.RideServiceImpl;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class SaveRunner {
    private static RideService rideService = new RideServiceImpl();

    public static void main(String[] args) {
        ArrayList<RideEntity> rideEntities = new ArrayList<>();
        rideEntities.add(new RideEntity(null,"Bashyam circle","Rajajinagar Metro station", LocalDateTime.now(),65.90));
        rideEntities.add(new RideEntity(null,"KSR Railway Station","Chikka pete", LocalDateTime.of(2025, 1, 3, 10, 30),35.70));
        rideEntities.add(new RideEntity(null,"Basaweshwara nagara","malleshwaram 15th cross", LocalDateTime.of(2025, 1, 13, 17, 24),53.02));
        rideEntities.add(new RideEntity(null,"Malleshwaram 8th cross","KSR Railway Station", LocalDateTime.now(),96.77));

        for (RideEntity saveRide : rideEntities){
            rideService.persist(saveRide);
        }
    }
}
