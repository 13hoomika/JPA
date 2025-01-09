package com.xworkz.hotelapp.updatehotels;

import com.xworkz.hotelapp.constant.HotelType;
import com.xworkz.hotelapp.entity.HotelThreeEntity;
import com.xworkz.hotelapp.entity.HotelTwoEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateHotel3 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try{
            HotelThreeEntity gethotel = em.find(HotelThreeEntity.class,3);
            if (gethotel != null){
                System.out.println("Data found");
                gethotel.setLocation("Kaikamba, Managalore");
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
