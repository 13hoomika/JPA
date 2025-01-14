package com.jpa.heibernateapp.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CountRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("bcp");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query countField = entityManager.createNamedQuery("countField");
        countField.setParameter("hotel_rating",4.3);
        Long singleResult = (Long)countField.getSingleResult();
        System.out.println(singleResult);
    }
}
