package com.jpa.heibernateapp.runner;

import com.jpa.heibernateapp.entity.HotelEntity;

import javax.persistence.*;
public class UpdateRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            HotelEntity hotelEntity = em.find(HotelEntity.class, 2);
            if (hotelEntity != null) {
                System.out.println("Data Found");
                hotelEntity.setHName("RRR");
                transaction.begin();
                em.merge(hotelEntity);
                transaction.commit();
                em.close();
            } else
                System.out.println("Data not found");
        } catch (Exception e) {
            transaction.rollback();
            System.out.println(e.getMessage());
        }
    }
}