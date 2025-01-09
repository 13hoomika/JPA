package com.xworkz.hotelapp.runner;

import com.xworkz.hotelapp.entity.HotelEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
        EntityManager em = emf.createEntityManager();
        HotelEntity hotelEntity = em.find(HotelEntity.class,1);
        System.out.println(hotelEntity);
    }
}
