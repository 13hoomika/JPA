package com.xworkx.foodapp.runner;

import com.xworkx.foodapp.entity.OrdersEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class OrdersRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
        EntityManager em = emf.createEntityManager();

        List<OrdersEntity> entity = new ArrayList<>();
        entity.add(new OrdersEntity(null,1,3, "2025-01-02",159.00));
        entity.add(new OrdersEntity(null,4,4, "2025-01-08",159.00));
        entity.add(new OrdersEntity(null,3,2, "2025-01-09",489.00));
        entity.add(new OrdersEntity(null,2,5, "2025-01-05",333.00));
        entity.add(new OrdersEntity(null,5,1, "2025-01-10",149.00));

        for (OrdersEntity list : entity){
            em.getTransaction().begin();
            em.persist(list);
            em.getTransaction().commit();
        }
    }
}
