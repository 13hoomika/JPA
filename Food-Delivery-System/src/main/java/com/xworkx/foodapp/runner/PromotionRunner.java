package com.xworkx.foodapp.runner;

import com.xworkx.foodapp.entity.PromotionEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class PromotionRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
        EntityManager em = emf.createEntityManager();

        List<PromotionEntity> entity = new ArrayList<>();
        entity.add(new PromotionEntity(null,"PROMO10", "10% off on your first order", 10.0,"2025-01-31"));
        entity.add(new PromotionEntity(null,"PROMO20", "20% off on orders above 250Rs", 20.0,"2025-01-31"));
        entity.add(new PromotionEntity(null,"FREESHIP", "Free shipping on weekends", 0.0,"2025-01-21"));
        entity.add(new PromotionEntity(null,"FIRST50ORDER", "50% off for first 50 orders", 50.0,"2025-02-01"));
        entity.add(new PromotionEntity(null,"WINTER20", "50% off during winter sale", 20.0,"2025-02-28"));

        for (PromotionEntity list : entity){
            em.getTransaction().begin();
            em.persist(list);
            em.getTransaction().commit();
        }
    }
}
