package com.xworkz.hotelapp.runner;

import com.xworkz.hotelapp.constant.HotelType;
import com.xworkz.hotelapp.entity.HotelTwoEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HotelTwoRunner {
    public static void main(String[] args) {
        HotelTwoEntity hotelTwoEntity = new HotelTwoEntity();
        hotelTwoEntity.setId(7);
        hotelTwoEntity.setHotelName("Machli");
        hotelTwoEntity.setLocation("Rajajinagar, Bangalore");
        hotelTwoEntity.setRating(3.8);
        hotelTwoEntity.setContact(809988778L);
        hotelTwoEntity.setHasParking(false);
        hotelTwoEntity.setAverageCostForTwo(1200.00);
        hotelTwoEntity.setType(HotelType.nonveg);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bcp");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(hotelTwoEntity);
        entityManager.getTransaction().commit();
    }
}
