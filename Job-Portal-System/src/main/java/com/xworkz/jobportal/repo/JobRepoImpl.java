package com.xworkz.jobportal.repo;

import com.xworkz.jobportal.entity.JobEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JobRepoImpl implements JobRepository{
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bcp");

    @Override
    public boolean save(JobEntity jobEntity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(jobEntity);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }finally {
            if (entityManager.getTransaction().isActive()){
                entityManager.close();
            }
        }
    }

    @Override
    public int updatebyTitle(String title,String jobType) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query findTitleQuery = entityManager.createNamedQuery("UpdateByTitle");
            findTitleQuery.setParameter("jTitle",title);
            findTitleQuery.setParameter("jType",jobType);
            int row = findTitleQuery.executeUpdate();
            entityManager.getTransaction().commit();

            Query findTypeQuery = entityManager.createNamedQuery("findByTitle");
            findTypeQuery.setParameter("jobTitle",title);
//            return (JobEntity) findTypeQuery.getSingleResult();
            return row;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            if (entityManager.getTransaction().isActive()){
                entityManager.getTransaction().rollback();
            }
            return 0;
        }finally {
            entityManager.close();
        }
    }
}
