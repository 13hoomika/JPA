package com.xworkx.foodapp.runner;

import com.xworkx.foodapp.entity.OrderItemEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class OrderItemRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
        EntityManager em = emf.createEntityManager();

        List<OrderItemEntity> entity = new ArrayList<>();
        entity.add(new OrderItemEntity(null,"Order1","Item1", 2,509.00));
        entity.add(new OrderItemEntity(null,"Order2","Item2", 1,250.00));
        entity.add(new OrderItemEntity(null,"Order3","Item3", 3,980.00));
        entity.add(new OrderItemEntity(null,"Order4","Item4", 4,1478.00));
        entity.add(new OrderItemEntity(null,"Order5","Item5", 5,870.00));

        for (OrderItemEntity list : entity){
            em.getTransaction().begin();
            em.persist(list);
            em.getTransaction().commit();
        }
    }
}
