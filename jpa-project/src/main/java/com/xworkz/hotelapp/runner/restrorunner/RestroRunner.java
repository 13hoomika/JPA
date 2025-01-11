package com.xworkz.hotelapp.runner.restrorunner;

import com.xworkz.hotelapp.entity.RestroEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RestroRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bcp");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(new RestroEntity(null,"Apoorva",true,4.8,"Nanjumalige"));
        entityManager.getTransaction().commit();
    }
}
