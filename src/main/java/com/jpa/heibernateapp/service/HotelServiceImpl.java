package com.jpa.heibernateapp.service;

import com.jpa.heibernateapp.entity.HotelEntity;
import com.jpa.heibernateapp.repository.HotelRepoImpl;
import com.jpa.heibernateapp.repository.HotelRepository;


public class HotelServiceImpl implements HotelService{
    HotelRepository repository = new HotelRepoImpl();
    @Override
    public void save(HotelEntity hotelEntity) {
        Boolean save = repository.save(hotelEntity);
        if (save){
            System.out.println("Data saved");
        }else System.out.println("Data not saved");

    }

    @Override
    public void getById(Integer id) {
        if (id == null || id <= 0) {
            System.out.println("Invalid ID!! ID must be a positive number.");
//            return null;
        }
        HotelEntity hotel = repository.getDataById(id);
        if (hotel != null)
            System.out.println("Hotel id found\n" + hotel);
        else System.out.println("Hotel id not found");
    }

    @Override
    public void getByName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Invalid hotel name!! Name cannot be null or empty.");
//            return null;
        }
        HotelEntity hotel = repository.getDataByName(name);
        if (hotel != null) {
            System.out.println("Hotel found\n" + hotel);
        } else {
            System.out.println("No hotel found with the name: " + name);
        }
    }

}
