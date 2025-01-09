package com.xworkz.hotelapp.findhotels;

import com.xworkz.hotelapp.entity.HotelFourEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindHotel4 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
        EntityManager em = emf.createEntityManager();
        HotelFourEntity gethotel = em.find(HotelFourEntity.class,4);
        System.out.println(gethotel);
    }
}
