package com.xworkz.hotelapp.runner;

import com.xworkz.hotelapp.constant.HotelType;
import com.xworkz.hotelapp.entity.HotelFourEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HotelFourRunner {
    public static void main(String[] args) {
        HotelFourEntity hotelFour = new HotelFourEntity();
        hotelFour.setId(7);
        hotelFour.setHotelName("Hotel RRR");
        hotelFour.setLocation("MG Road");
        hotelFour.setRating(4.8);
        hotelFour.setContact(7883232423L);
        hotelFour.setHasParking(false);
        hotelFour.setAverageCostForTwo(300.00);
        hotelFour.setType(HotelType.veg);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bcp");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(hotelFour);
        entityManager.getTransaction().commit();
    }
}
