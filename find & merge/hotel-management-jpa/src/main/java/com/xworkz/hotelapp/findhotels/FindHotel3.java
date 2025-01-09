package com.xworkz.hotelapp.findhotels;

import com.xworkz.hotelapp.entity.HotelThreeEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindHotel3 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
        EntityManager em = emf.createEntityManager();
        HotelThreeEntity gethotel = em.find(HotelThreeEntity.class,3);
        System.out.println(gethotel);
    }
}
