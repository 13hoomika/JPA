package com.xworkz.ridingapp;

import com.xworkz.ridingapp.entity.RideEntity;
import com.xworkz.ridingapp.service.RideService;
import com.xworkz.ridingapp.service.RideServiceImpl;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class UpdateRunner {
    private static RideService service = new RideServiceImpl();

    public static void main(String[] args) {
        service.update(4,122.50);
    }
}
