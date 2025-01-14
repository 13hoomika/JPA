package com.jpa.heibernateapp.runner;

import com.jpa.heibernateapp.entity.HotelEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HotelPersistRunner {
    public static void main(String[] args) {
//        HotelEntity hotelEntity = new HotelEntity();
//        hotelEntity.setId(2);
//        hotelEntity.setHName("Shanti Sagar");
//        hotelEntity.setRating(4.0);
//        hotelEntity.setLocation("Rama Mandira");
//        hotelEntity.setContact(8899776563L);
//        hotelEntity.setPincode(560010);
//        hotelEntity.setHType("Veg");

        HotelEntity hotel = new HotelEntity(null,"Just BLR",4.3,"Brigade Rd",560025,8277996372L,"Veg-NonVeg");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bcp");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(hotel);
        entityManager.getTransaction().commit();
    }
}