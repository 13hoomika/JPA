package com.xworkz.hotelapp.runner;

import com.xworkz.hotelapp.constant.HotelType;
import com.xworkz.hotelapp.entity.HotelOneEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NalandaRunner {
    public static void main(String[] args) {
        HotelOneEntity hotelOneEntity = new HotelOneEntity();
        hotelOneEntity.setId(7);
        hotelOneEntity.setHotelName("Garden Heights");
        hotelOneEntity.setLocation("Koramangala, Bangalore");
        hotelOneEntity.setRating(4.4);
        hotelOneEntity.setContact(8060066778L);
        hotelOneEntity.setHasParking(true);
        hotelOneEntity.setAverageCostForTwo(5000.00);
        hotelOneEntity.setType(HotelType.nonveg);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bcp");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(hotelOneEntity);
        entityManager.getTransaction().commit();
    }
}
