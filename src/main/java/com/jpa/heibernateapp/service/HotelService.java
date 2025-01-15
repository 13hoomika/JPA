package com.jpa.heibernateapp.service;


import com.jpa.heibernateapp.entity.HotelEntity;

public interface HotelService {
    void save(HotelEntity hotelEntity);
    void getById(Integer id);
    void getByName(String name);
}
