package com.xworkz.hotelapp.runner.restrorunner;

import com.xworkz.hotelapp.entity.RestroEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class FetchAllRestroDataRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
        EntityManager em = emf.createEntityManager();
        Query getAllData = em.createNamedQuery("fetchAllData");
        List<RestroEntity> resultList = (List<RestroEntity>) getAllData.getResultList();
        for (RestroEntity restroEntity : resultList){
            System.out.println(restroEntity.getRestroName());//get specific field
        }
    }
}
