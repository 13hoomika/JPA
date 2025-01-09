package com.xworkz.hotelapp.updatehotels;

import com.xworkz.hotelapp.constant.HotelType;
import com.xworkz.hotelapp.entity.HotelOneEntity;
import com.xworkz.hotelapp.entity.HotelTwoEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateHotel2 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try{
            HotelTwoEntity gethotel = em.find(HotelTwoEntity.class,2);
            if (gethotel != null){
                System.out.println("Data found");
                gethotel.setType(HotelType.veg);
                gethotel.setAverageCostForTwo(2400.00);
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
