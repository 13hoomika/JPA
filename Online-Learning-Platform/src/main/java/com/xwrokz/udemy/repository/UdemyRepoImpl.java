package com.xwrokz.udemy.repository;

import com.xwrokz.udemy.entity.UdemyEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UdemyRepoImpl implements UdemyRepository{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");

    @Override
    public Boolean save(UdemyEntity udemyEntity) {
        EntityManager em = emf.createEntityManager();
        System.out.println("Repo " + udemyEntity);
        try {
            em.getTransaction().begin();
            em.persist(udemyEntity);
            em.getTransaction().commit();
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }finally {
            em.close();
        }
    }

    @Override
    public UdemyEntity FindById(Integer id) {
        EntityManager em = emf.createEntityManager();
//        return em.find(UdemyEntity.class,id);
        Query findId = em.createNamedQuery("findById");
        findId.setParameter("id",id);
        return (UdemyEntity) findId.getSingleResult();
    }

    @Override
    public UdemyEntity findByname(String name) {
        EntityManager em = emf.createEntityManager();
        try {
            Query findByNameQuery = em.createNamedQuery("findByName");
            findByNameQuery.setParameter("instructorName",name);
            return (UdemyEntity) findByNameQuery.getSingleResult();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }finally {
            em.close();
        }
    }

    //updating multiple data
    @Override
    public UdemyEntity Update(Integer id, String level) {
        EntityManager em = emf.createEntityManager();
        try {
            UdemyEntity udemyEntity = em.find(UdemyEntity.class,id);
            if (udemyEntity != null){
                System.out.println("Id Found");
                udemyEntity.setLevel(level);
                em.getTransaction().begin();
                //while updating multiple data use merge
                em.merge(udemyEntity);
                em.getTransaction().commit();
                em.close();
            }
            else System.out.println("Id '"+id+"' Not Found");
        } catch (Exception e) {
            if (em.getTransaction().isActive())
                em.getTransaction().rollback();
            System.out.println(e.getMessage());
        }
        return null;
    }

    // updating specific field
    @Override
    public UdemyEntity UpdateByName(String name, String level) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            //while updating a specific field use query for both the parameters
            Query query = em.createNamedQuery("updateByName");
            query.setParameter("name",name);
            query.setParameter("lev",level);
            query.executeUpdate();
            em.getTransaction().commit();

            Query findNameQuery = em.createNamedQuery("findByName");
            findNameQuery.setParameter("instructorName",name);
            return (UdemyEntity) findNameQuery.getSingleResult();
        }catch (Exception e) {
            if (em.getTransaction().isActive())
                em.getTransaction().rollback();
            System.out.println(e.getMessage());
            return null;
        }finally {
            em.close();
        }
    }

    @Override
    public int UpdateByNameReturnInt(String name, String level) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            //while updating a specific field use query for both the parameters
            Query query = em.createNamedQuery("updateByName");
            query.setParameter("name", name);
            query.setParameter("lev", level);
            int row = query.executeUpdate();
            em.getTransaction().commit();

            Query findNameQuery = em.createNamedQuery("findByName");
            findNameQuery.setParameter("instructorName", name);
            return row;
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.out.println(e.getMessage());
            return 0;
        } finally {
            em.close();
        }
    }


}
