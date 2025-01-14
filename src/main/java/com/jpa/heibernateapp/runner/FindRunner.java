package com.jpa.heibernateapp.runner;

import com.jpa.heibernateapp.entity.HotelEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
        EntityManager em = emf.createEntityManager();
        HotelEntity hotelEntity = em.find(HotelEntity.class,1);
        System.out.println("Id 1: "+hotelEntity);

    }
}
