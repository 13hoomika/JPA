package com.xworkz.mediaapp.service;

import com.xworkz.mediaapp.entity.MediaEntity;

public interface MediaService {
    void insert(MediaEntity mediaEntity);
    void mergeByUserName(String userName,int followers);
}
