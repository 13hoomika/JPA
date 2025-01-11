package com.xworkz.hotelapp.runner.restrorunner;

import com.xworkz.hotelapp.entity.RestroEntity;

import javax.persistence.*;
import java.util.List;

public class FetchByName {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("fetchByName");
        query.setParameter("name","Udupi");
        try {
            RestroEntity restroEntity = (RestroEntity) query.getSingleResult();
            System.out.println(restroEntity);
        } catch (NoResultException e) {
            System.out.println(e.getMessage());
        }

    }
}
