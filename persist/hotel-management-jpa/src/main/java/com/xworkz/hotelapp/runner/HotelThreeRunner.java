package com.xworkz.hotelapp.runner;

import com.xworkz.hotelapp.constant.HotelType;
import com.xworkz.hotelapp.entity.HotelThreeEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HotelThreeRunner {
    public static void main(String[] args) {
        HotelThreeEntity hotelThree = new HotelThreeEntity();
        hotelThree.setId(7);
        hotelThree.setHotelName("Narayana");
        hotelThree.setLocation("MRT Road");
        hotelThree.setRating(2.9);
        hotelThree.setContact(6678786878L);
        hotelThree.setHasParking(false);
        hotelThree.setAverageCostForTwo(400.00);
        hotelThree.setType(HotelType.veg);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bcp");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(hotelThree);
        entityManager.getTransaction().commit();
    }
}
