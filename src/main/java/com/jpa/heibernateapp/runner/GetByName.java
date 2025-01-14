package com.jpa.heibernateapp.runner;
import com.jpa.heibernateapp.entity.HotelEntity;
import javax.persistence.*;

public class GetByName {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("getByName");
        query.setParameter("name","1947");
        try {
            HotelEntity hotelEntity = (HotelEntity) query.getSingleResult();
            System.out.println(hotelEntity);
        } catch (NoResultException e) {
            System.out.println(e.getMessage());
        }
    }
}
