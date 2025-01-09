package com.xworkz.hotelapp.updatehotels;

import com.xworkz.hotelapp.entity.HotelFiveEntity;
import com.xworkz.hotelapp.entity.HotelFourEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateHotel5 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try{
            HotelFiveEntity gethotel = em.find(HotelFiveEntity.class,5);
            if (gethotel != null){
                System.out.println("Data found");
                gethotel.setHotelName("Apporva");
                transaction.begin();
                em.merge(gethotel);
                System.out.println(gethotel);
                transaction.commit();
                em.close();
            }else System.out.println("data not found");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
