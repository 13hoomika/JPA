package com.xworkz.hotelapp.findhotels;

import com.xworkz.hotelapp.entity.HotelFiveEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindHotel5 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
        EntityManager em = emf.createEntityManager();
        HotelFiveEntity gethotel = em.find(HotelFiveEntity.class,5);
        System.out.println(gethotel);
    }
}
