package com.xworkz.ridingapp.repository;

import com.xworkz.ridingapp.entity.RideEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class RideRepoImpl implements RideRepository{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
    @Override
    public boolean persist(RideEntity rideEntity) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(rideEntity);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            if (em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
        }finally {
            em.close();
        }
        return false;
    }

    @Override
    public int update(int id, Double fare) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Query udateQuery = em.createNamedQuery("update");
            udateQuery.setParameter("id",id);
            udateQuery.setParameter("fare",fare);
            int row = udateQuery.executeUpdate();
            em.getTransaction().commit();

            em.find(RideEntity.class,id);
            return row;
        }
        catch (Exception e) {
            if (em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            System.out.println(e.getMessage());
            return 0;
        }finally {
            em.close();
        }
    }
}
