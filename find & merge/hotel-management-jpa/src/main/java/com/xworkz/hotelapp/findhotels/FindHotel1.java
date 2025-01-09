package com.xworkz.hotelapp.findhotels;

import com.xworkz.hotelapp.entity.HotelOneEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindHotel1 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
        EntityManager em = emf.createEntityManager();
        HotelOneEntity gethotel = em.find(HotelOneEntity.class,1);
        System.out.println(gethotel);
    }
}
