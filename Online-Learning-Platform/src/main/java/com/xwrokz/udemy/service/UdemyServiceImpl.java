package com.xwrokz.udemy.service;

import com.xwrokz.udemy.entity.UdemyEntity;
import com.xwrokz.udemy.repository.UdemyRepoImpl;
import com.xwrokz.udemy.repository.UdemyRepository;

public class UdemyServiceImpl implements UdemyService{
    UdemyRepository udemyRepository = new UdemyRepoImpl();
    @Override
    public void save(UdemyEntity udemyEntity) {
        Boolean insert = udemyRepository.save(udemyEntity);
        if (insert)
            System.out.println("data saved");
        else System.out.println("data not saved");
    }

    @Override
    public void getById(Integer id) {
        if (id == null || id <= 0){
            System.out.println("Invalid Id!!");
//            return null;
        }
        UdemyEntity udemyEntity = udemyRepository.FindById(id);
        if (udemyEntity != null )
            System.out.println("Id found\n" + udemyEntity);
        else System.out.println("Id not found");
//        return udemyEntity;
    }

    @Override
    public void getByName(String name) {
        if (name.isEmpty()) {
            System.out.println("Invalid name!!");
//            return null;
        }
        UdemyEntity udemy = udemyRepository.findByname(name);
        if (udemy != null)
            System.out.println("Name found\n" + udemy);
        else System.out.println("No '"+name +"' found");
//        return udemy;
    }

    @Override
    public void updateById(Integer id, String level) {
        if (id == null || id <= 0 || level.isEmpty()) {
            System.out.println("Invalid id!!");
        }
        UdemyEntity updatedEntity = udemyRepository.Update(id,level);
        if (updatedEntity == null)
            System.out.println("updated");
        else System.out.println("not updated");
    }

    @Override
    public void updateByName(String name, String level) {
        UdemyEntity updatedEntity = udemyRepository.UpdateByName(name,level);
        if (updatedEntity != null) {
            System.out.println("level updated");
        }
        else System.out.println("level not updated");
    }

    @Override
    public void updateByNameReturnRow(String name, String level) {
        int rows = udemyRepository.UpdateByNameReturnInt(name,level);
        if (rows == 0)
            System.out.println("not updated any rows");
        else System.out.println(rows + " row Updated");

    }
}
