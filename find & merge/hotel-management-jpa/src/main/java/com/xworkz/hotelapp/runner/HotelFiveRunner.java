package com.xworkz.hotelapp.runner;

import com.xworkz.hotelapp.constant.HotelType;
import com.xworkz.hotelapp.entity.HotelFiveEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HotelFiveRunner {
    public static void main(String[] args) {

        HotelFiveEntity hotelFiveEntity = new HotelFiveEntity(3,4.6,"Mysore","good vides",56789098765L,HotelType.veg,400.00,true);
        HotelFiveEntity hotelFiveEntity1 = new HotelFiveEntity(4,3.6,"J P nagar","Hanumanthu",785549098765L,HotelType.nonveg,300.00,false);
        HotelFiveEntity hotelFiveEntity2 = new HotelFiveEntity(5,3.8,"Agrahara","kaveri",99089098765L,HotelType.veg,150.00,true);
        HotelFiveEntity hotelFiveEntity3 = new HotelFiveEntity(6,4.2,"Mysore","Mailary",4567876545675L,HotelType.veg,200.00,true);
        HotelFiveEntity hotelFiveEntity4 = new HotelFiveEntity(7,4.6,"Mysore","Udupi Darshini",89098329732L,HotelType.veg,450.00,true);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bcp");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(hotelFiveEntity4);
        entityManager.getTransaction().commit();
    }
}
