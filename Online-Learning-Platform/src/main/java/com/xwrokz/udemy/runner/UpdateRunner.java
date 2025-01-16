package com.xwrokz.udemy.runner;

import com.xwrokz.udemy.service.UdemyService;
import com.xwrokz.udemy.service.UdemyServiceImpl;

public class UpdateRunner {
    private static UdemyService service = new UdemyServiceImpl();

    public static void main(String[] args) {

//        service.updateById(1,"Intern");
//        service.updateByName("Aisha","Advance");
        service.updateByNameReturnRow("Rajesh","Beginner");


    }
}
