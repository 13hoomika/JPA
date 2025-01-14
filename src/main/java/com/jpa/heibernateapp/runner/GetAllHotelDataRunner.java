package com.jpa.heibernateapp.runner;

import com.jpa.heibernateapp.entity.HotelEntity;

import javax.persistence.*;
import java.util.List;

public class GetAllHotelDataRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
        EntityManager em = emf.createEntityManager();
        Query getData = em.createNamedQuery("getAllData");
        List<HotelEntity> resultList = (List<HotelEntity>) getData.getResultList();
        for (HotelEntity hotelEntity : resultList)
            System.out.println(hotelEntity.getHName());//get specific field
    }
}
