package com.xworkx.foodapp.runner;

import com.xworkx.foodapp.entity.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class UserRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
        EntityManager em = emf.createEntityManager();

        List<UserEntity> entity = new ArrayList<>();
        entity.add(new UserEntity(null,"Bhoomika","bhoomika@gmail.com",12345678L,"Mysore"));
        entity.add(new UserEntity(null,"Indira","indira@gmail.com",23456778789L,"Mysore"));
        entity.add(new UserEntity(null,"Pooja","pooja@gmail.com",5678769876L,"Mysore"));
        entity.add(new UserEntity(null,"Shambabi","shambavi@gmail.com",23456788765L,"Mysore"));
        entity.add(new UserEntity(null,"Keerthi","keerthi@gmail.com",15763528784L,"Mysore"));

        for (UserEntity list : entity){
            em.getTransaction().begin();
            em.persist(list);
            em.getTransaction().commit();
        }
    }
}
