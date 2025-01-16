package com.xworkz.mediaapp.repo;

import com.xworkz.mediaapp.entity.MediaEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MediaRepoImpl implements MediaRepository{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");

    @Override
    public boolean insert(MediaEntity mediaEntity) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(mediaEntity);
            em.getTransaction().commit();
            return true;

        } catch (Exception e) {
            if (em.getTransaction().isActive())
                em.getTransaction().rollback();
            System.out.println(e.getMessage());
        }finally {
            em.close();
        }
        return false;
    }

    @Override
    public int mergeByUserName(String userName, int followers) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Query update = em.createNamedQuery("update");
            update.setParameter("user",userName);
            update.setParameter("followers",followers);
            int row = update.executeUpdate();
            em.getTransaction().commit();

            Query getUser = em.createNamedQuery("findUserName");
            getUser.setParameter("uName",userName);
            return row;
        } catch (Exception e) {
            if (em.getTransaction().isActive())
                em.getTransaction().rollback();
            System.out.println(e.getMessage());
            return 0;
        }finally {
            em.close();
        }
    }
}
