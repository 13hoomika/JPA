package com.xworkx.foodapp.runner;

import com.xworkx.foodapp.entity.DeliveryEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class DeliveryRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
        EntityManager em = emf.createEntityManager();

        List<DeliveryEntity> entity = new ArrayList<>();
        entity.add(new DeliveryEntity(null,1, 2, "Delivered","2025-01-10 12:30:00"));
        entity.add(new DeliveryEntity(null,3, 3, "Pending","2025-01-10 15:00:00"));
        entity.add(new DeliveryEntity(null,4, 4, "In Transit","2025-01-10 14:15:00"));
        entity.add(new DeliveryEntity(null,5, 1, "Cancelled","22025-01-10 11:45:00"));
        entity.add(new DeliveryEntity(null,2, 5, "Delivered","2025-01-10 16:10:00"));

        for (DeliveryEntity list : entity){
            em.getTransaction().begin();
            em.persist(list);
            em.getTransaction().commit();
        }
    }
}
