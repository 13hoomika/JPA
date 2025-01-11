package com.xworkz.hotelapp.runner.hotelRunner;

import com.xworkz.hotelapp.entity.HotelEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class GetAllHotelDataRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
        EntityManager em = emf.createEntityManager();
        Query getData = em.createNamedQuery("getAllData");
        List<HotelEntity> resultList = (List<HotelEntity>) getData.getResultList();
        for (HotelEntity hotelEntity : resultList){
            System.out.println(hotelEntity.getHName());//get specific field
        }
    }
}
