package com.xworkz.mediaapp.repo;

import com.xworkz.mediaapp.entity.MediaEntity;

public interface MediaRepository {
    boolean insert(MediaEntity mediaEntity);
    int mergeByUserName(String userName,int followers);
}
