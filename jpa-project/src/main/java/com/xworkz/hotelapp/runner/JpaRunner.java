package com.xworkz.hotelapp.runner;

import com.xworkz.hotelapp.entity.HotelEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaRunner {
    public static void main(String[] args) {
//        HotelEntity hotelEntity = new HotelEntity();
//        hotelEntity.setId(2);
//        hotelEntity.setHName("Shanti Sagar");
//        hotelEntity.setRating(4.0);
//        hotelEntity.setLocation("Rama Mandira");
//        hotelEntity.setContact(8899776563L);
//        hotelEntity.setPincode(560010);
//        hotelEntity.setHType("Veg");

        HotelEntity hotel = new HotelEntity(3,"1947",4.3,"Malleswaram 15th cross",560015,45627890987L,"veg");


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bcp");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
//        entityManager.persist(hotelEntity);
        entityManager.persist(hotel);
        entityManager.getTransaction().commit();
    }
}