package com.jpa.heibernateapp.runner;

import javax.persistence.*;

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
