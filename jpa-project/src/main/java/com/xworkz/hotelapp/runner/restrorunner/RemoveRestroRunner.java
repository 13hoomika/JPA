package com.xworkz.hotelapp.runner.restrorunner;

import com.xworkz.hotelapp.entity.HotelEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RemoveRestroRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
        EntityManager em = emf.createEntityManager();
        HotelEntity restroEntity = em.find(HotelEntity.class,2);
        em.getTransaction().begin();
        em.remove(restroEntity);
        em.getTransaction().commit();
    }
}
