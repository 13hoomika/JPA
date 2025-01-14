package com.jpa.heibernateapp.runner;

import com.jpa.heibernateapp.entity.HotelEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.ArrayList;

public class PersistListRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
        EntityManager em = emf.createEntityManager();

        ArrayList<HotelEntity> hotelList = new ArrayList<>();
        //hotelList.add(new HotelEntity(null,"Olive Garden",4.3,"Malleswaram 8th cross",560017,4562789098L,"veg"));
        //hotelList.add(new HotelEntity(null,"Halli Mane",4.6,"Malleswaram 8th cross",560017,4445566776L,"VEg-Nonveg"));

        em.getTransaction().begin();
        //persist
        for(HotelEntity hotelEntity : hotelList) {
            em.persist(hotelEntity);
        }
        em.getTransaction().commit();

    }
}
