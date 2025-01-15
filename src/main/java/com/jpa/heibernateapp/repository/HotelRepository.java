package com.jpa.heibernateapp.repository;

import com.jpa.heibernateapp.entity.HotelEntity;

public interface HotelRepository {
    Boolean save(HotelEntity hotelEntity);
    HotelEntity getDataById(Integer id);
    HotelEntity getDataByName(String name);
}
