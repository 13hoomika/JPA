package com.xworkz.ridingapp.runner;

import com.xworkz.ridingapp.service.RideService;
import com.xworkz.ridingapp.service.RideServiceImpl;

public class UpdateRunner {
    private static RideService service = new RideServiceImpl();

    public static void main(String[] args) {
        service.update(4,122.50);
    }
}
