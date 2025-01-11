package com.xworkz.hotelapp.runner.restrorunner;

import com.xworkz.hotelapp.entity.HotelEntity;

import javax.persistence.*;

public class CountRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
        EntityManager em = emf.createEntityManager();
        Query count = em.createNamedQuery("count");
        count.setParameter("location","Mysore");
        Long singleResult = (Long) count.getSingleResult();
        System.out.println(singleResult);
    }
}
