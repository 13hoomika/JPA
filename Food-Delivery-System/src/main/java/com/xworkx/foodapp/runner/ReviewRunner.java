package com.xworkx.foodapp.runner;

import com.xworkx.foodapp.entity.ReviewEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class ReviewRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
        EntityManager em = emf.createEntityManager();

        List<ReviewEntity> entity = new ArrayList<>();
        entity.add(new ReviewEntity(null, 1, 1, 4.5, "Great service!"));
        entity.add(new ReviewEntity(null, 3, 3, 5.0, "Absolutely loved it! Highly recommend"));
        entity.add(new ReviewEntity(null, 2, 5, 2.5, "Not worth the price. Disappointing experience."));
        entity.add(new ReviewEntity(null, 5, 4, 4.1, "Great place for family dining. Will visit again."));
        entity.add(new ReviewEntity(null, 4, 2, 3.7, "Good food, but the service could be better"));

        for (ReviewEntity list : entity){
            em.getTransaction().begin();
            em.persist(list);
            em.getTransaction().commit();
        }
    }
}
