package com.jpa.heibernateapp.repository;

import com.jpa.heibernateapp.entity.HotelEntity;

import javax.persistence.*;

public class HotelRepoImpl implements HotelRepository{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
    @Override
    public Boolean save(HotelEntity hotelEntity) {
        System.out.println("Repo hotel entity " + hotelEntity);
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(hotelEntity);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public HotelEntity getDataById(Integer id) {
        EntityManager entityManager = emf.createEntityManager();
        return entityManager.find(HotelEntity.class,id);
    }

    @Override
    public HotelEntity getDataByName(String hName) {
        EntityManager em = emf.createEntityManager();
        try {
            Query query = em.createNamedQuery("getByName");
            query.setParameter("name",hName);
            //HotelEntity hotelEntity = (HotelEntity) query.getSingleResult();
           return (HotelEntity) query.getSingleResult();
        }
        catch (NoResultException e) {
            System.out.println(e.getMessage());
            return null;
        }finally {
            em.close();
        }
    }
}
