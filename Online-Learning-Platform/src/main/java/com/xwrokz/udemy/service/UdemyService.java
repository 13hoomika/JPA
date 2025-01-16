package com.xwrokz.udemy.service;

import com.xwrokz.udemy.entity.UdemyEntity;

public interface UdemyService {
    void save(UdemyEntity udemyEntity);
    void getById(Integer id);
    void getByName(String name);
    void updateById(Integer id, String level);
    void updateByName(String name, String level);
    void updateByNameReturnRow(String name, String level);
}
