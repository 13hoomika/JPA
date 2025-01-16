package com.xworkz.mediaapp.service;

import com.xworkz.mediaapp.entity.MediaEntity;
import com.xworkz.mediaapp.repo.MediaRepoImpl;
import com.xworkz.mediaapp.repo.MediaRepository;

public class MediaServiceImpl implements MediaService{
    private MediaRepository repository = new MediaRepoImpl();
    @Override
    public void insert(MediaEntity mediaEntity) {
        boolean insert = repository.insert(mediaEntity);
        if (insert)
            System.out.println("Data saved successfully");
        else System.out.println("Data not saved!! try again");
    }

    @Override
    public void mergeByUserName(String userName, int followers) {
        int row = repository.mergeByUserName(userName, followers);
        if (row != 0){
            System.out.println(row + " rows updated successfully");
        }else System.out.println(row + " rows updated");
    }
}
