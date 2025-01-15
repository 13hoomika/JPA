package com.jpa.heibernateapp.runner.servicerunner;

import com.jpa.heibernateapp.entity.HotelEntity;
import com.jpa.heibernateapp.service.HotelService;
import com.jpa.heibernateapp.service.HotelServiceImpl;

public class ServiceRunner {
    public static void main(String[] args) {
        HotelService service = new HotelServiceImpl();
        HotelEntity entity = new HotelEntity(null,"Nayaz",4.6,"Belagavi",53008,287787866L,"Non-Veg");
        service.save(entity);

        System.out.println("------ getById ------");
        service.getById(10);

        System.out.println("\n------ getByName ------");
        service.getByName("Olive Garden");

    }
}
