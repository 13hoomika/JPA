package com.xworkz.hotelapp.updatehotels;

import com.xworkz.hotelapp.entity.HotelFourEntity;
import com.xworkz.hotelapp.entity.HotelThreeEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateHotel4 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try{
            HotelFourEntity gethotel = em.find(HotelFourEntity.class,4);
            if (gethotel != null){
                System.out.println("Data found");
                gethotel.setLocation("Lashkar Mohalla");
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
