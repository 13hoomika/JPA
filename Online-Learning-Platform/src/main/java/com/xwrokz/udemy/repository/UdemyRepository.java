package com.xwrokz.udemy.repository;

import com.xwrokz.udemy.entity.UdemyEntity;

import javax.persistence.criteria.CriteriaBuilder;

public interface UdemyRepository {
    Boolean save(UdemyEntity udemyEntity);
    UdemyEntity FindById(Integer id);
    UdemyEntity findByname(String name);
    UdemyEntity Update(Integer id,String level);
    UdemyEntity UpdateByName(String name,String level);
    int UpdateByNameReturnInt(String name,String level);

}
