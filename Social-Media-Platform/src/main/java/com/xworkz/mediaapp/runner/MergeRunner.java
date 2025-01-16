package com.xworkz.mediaapp.runner;

import com.xworkz.mediaapp.entity.MediaEntity;
import com.xworkz.mediaapp.service.MediaService;
import com.xworkz.mediaapp.service.MediaServiceImpl;

import java.util.ArrayList;

public class MergeRunner {
   public static MediaService mediaService =  new MediaServiceImpl();
    public static void main(String[] args) {
        mediaService.mergeByUserName("chris_gamer",1000);
    }
}
