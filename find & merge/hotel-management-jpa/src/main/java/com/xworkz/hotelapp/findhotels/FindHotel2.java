package com.xworkz.hotelapp.findhotels;

import com.xworkz.hotelapp.entity.HotelTwoEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindHotel2 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
        EntityManager em = emf.createEntityManager();
        HotelTwoEntity gethotel = em.find(HotelTwoEntity.class,2);
        System.out.println(gethotel);
    }
}
