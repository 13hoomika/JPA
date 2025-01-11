package com.xworkz.hotelapp.runner.restrorunner;

import com.xworkz.hotelapp.entity.RestroEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class RestroListRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bcp");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        List<RestroEntity> restroRunnerList = new ArrayList<>();
        restroRunnerList.add(new RestroEntity(null,"Souparnika",false,3.9,"Sagara"));
        restroRunnerList.add(new RestroEntity(null,"Shanthi sagar",false,4.5,"Mysore"));
        restroRunnerList.add(new RestroEntity(null,"Khan Chacha",true,4.3,"Bangalore"));

        for(RestroEntity restro : restroRunnerList){
            entityManager.getTransaction().begin();
            entityManager.persist(restro);
            entityManager.getTransaction().commit();
        }

        System.out.println(entityManager.find(RestroEntity.class,2));
    }
}
