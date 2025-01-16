package com.xworkz.mediaapp.runner;

import com.xworkz.mediaapp.entity.MediaEntity;
import com.xworkz.mediaapp.service.MediaService;
import com.xworkz.mediaapp.service.MediaServiceImpl;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;

public class InsertRunner {
    public static MediaService mediaService =  new MediaServiceImpl();
    public static void main(String[] args) {
        ArrayList<MediaEntity> midiaList = new ArrayList<>();
        midiaList.add(new MediaEntity(null,"jane_smith","X",2500,300));
        midiaList.add(new MediaEntity(null,"alex_tech","LinkedIn",800,45));
        midiaList.add(new MediaEntity(null,"emma_art","Pinterest",3200,500));
        midiaList.add(new MediaEntity(null,"chris_gamer","threads",500,30));

        for (MediaEntity insert: midiaList){
            mediaService.insert(insert);
        }
    }
}
