package com.xworkz.hotelapp.updatehotels;

import com.xworkz.hotelapp.entity.HotelOneEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateHotel1 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try{
            HotelOneEntity gethotel = em.find(HotelOneEntity.class,1);
            if (gethotel != null){
                System.out.println("Data found");
                gethotel.setRating(3.8);
                transaction.begin();
                em.merge(gethotel);
                transaction.commit();
                em.close();
            }else System.out.println("data not found");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
