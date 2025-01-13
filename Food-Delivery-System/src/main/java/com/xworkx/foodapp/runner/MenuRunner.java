package com.xworkx.foodapp.runner;

import com.xworkx.foodapp.entity.MenuEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class MenuRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
        EntityManager em = emf.createEntityManager();

        List<MenuEntity> entity = new ArrayList<>();
        entity.add(new MenuEntity(null,"biriyani","Panjabi tadka",3.4,150.00));
        entity.add(new MenuEntity(null,"Kofta","Udupi",4.8,250.00));
        entity.add(new MenuEntity(null,"Garlic Naan","Panchavati",4.2,40.00));
        entity.add(new MenuEntity(null,"Idli","Vasanthamma",3.4,10.00));
        entity.add(new MenuEntity(null,"Dosa","Kaveri",3.4,60.00));

        for (MenuEntity list : entity){
            em.getTransaction().begin();
            em.persist(list);
            em.getTransaction().commit();
        }
    }
}
