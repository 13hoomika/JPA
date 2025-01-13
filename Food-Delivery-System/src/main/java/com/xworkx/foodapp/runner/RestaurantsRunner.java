package com.xworkx.foodapp.runner;

import com.xworkx.foodapp.entity.RestaurantsEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class RestaurantsRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
        EntityManager em = emf.createEntityManager();

        List<RestaurantsEntity> entity = new ArrayList<>();
        entity.add(new RestaurantsEntity(null,"Enpire","Bangalore",4.6,"Italian"));
        entity.add(new RestaurantsEntity(null,"Kara valli","Bangalore",4.4,"Indian"));
        entity.add(new RestaurantsEntity(null,"Malvalli","Bangalore",4.6,"Indian"));
        entity.add(new RestaurantsEntity(null,"Rajadani","Bangalore",4.3,"Indian"));
        entity.add(new RestaurantsEntity(null,"Koshish","Bangalore",4.2,"North Indian"));

        for (RestaurantsEntity list : entity){
            em.getTransaction().begin();
            em.persist(list);
            em.getTransaction().commit();
        }
    }
}
