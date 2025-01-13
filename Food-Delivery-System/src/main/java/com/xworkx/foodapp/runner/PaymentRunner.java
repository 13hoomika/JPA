package com.xworkx.foodapp.runner;

import com.xworkx.foodapp.entity.PaymentsEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class PaymentRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
        EntityManager em = emf.createEntityManager();

        List<PaymentsEntity> entity = new ArrayList<>();
        entity.add(new PaymentsEntity(null,"Order1", "Credit Card", "Completed",159.00));
        entity.add(new PaymentsEntity(null,"Order2", "PayPal", "Pending",250.00));
        entity.add(new PaymentsEntity(null,"Order3", "Debit Card", "Failed",300.00));
        entity.add(new PaymentsEntity(null,"Order4", "UPI", "Completed",400.00));
        entity.add(new PaymentsEntity(null,"Order5", "UPI", "Completed",150.00));

        for (PaymentsEntity list : entity){
            em.getTransaction().begin();
            em.persist(list);
            em.getTransaction().commit();
        }
    }
}
