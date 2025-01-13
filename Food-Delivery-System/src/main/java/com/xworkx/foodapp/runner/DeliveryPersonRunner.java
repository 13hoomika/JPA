package com.xworkx.foodapp.runner;

import com.xworkx.foodapp.entity.DeliveryPersonEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class DeliveryPersonRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
        EntityManager em = emf.createEntityManager();

        List<DeliveryPersonEntity> entity = new ArrayList<>();
        entity.add(new DeliveryPersonEntity(null,"Ajay",123456789L,"Bike",true));
        entity.add(new DeliveryPersonEntity(null,"Abi",123456789L,"EV bike",true));
        entity.add(new DeliveryPersonEntity(null,"Arun",123456789L,"Scooty",false));
        entity.add(new DeliveryPersonEntity(null,"Indira",123456789L,"Bicycle",true));
        entity.add(new DeliveryPersonEntity(null,"Sumith",123456789L,"Bike",false));

        for (DeliveryPersonEntity list : entity){
            em.getTransaction().begin();
            em.persist(list);
            em.getTransaction().commit();
        }
    }
}
