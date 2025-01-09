package com.xworkz.hotelapp.runner;

import com.xworkz.hotelapp.constant.HotelType;
import com.xworkz.hotelapp.entity.NalandaEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NalandaRunner {
    public static void main(String[] args) {
        NalandaEntity nalandaEntity = new NalandaEntity();
        nalandaEntity.setId(7);
        nalandaEntity.setHotelName("Garden Heights");
        nalandaEntity.setLocation("Koramangala, Bangalore");
        nalandaEntity.setRating(4.4);
        nalandaEntity.setContact(8060066778L);
        nalandaEntity.setHasParking(true);
        nalandaEntity.setAverageCostForTwo(5000.00);
        nalandaEntity.setType(HotelType.nonveg);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bcp");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(nalandaEntity);
        entityManager.getTransaction().commit();
    }
}
