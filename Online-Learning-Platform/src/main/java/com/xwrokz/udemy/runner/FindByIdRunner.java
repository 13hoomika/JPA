package com.xwrokz.udemy.runner;

import com.xwrokz.udemy.service.UdemyService;
import com.xwrokz.udemy.service.UdemyServiceImpl;

public class FindByIdRunner {
    private static UdemyService service = new UdemyServiceImpl();
    public static void main(String[] args) {
        service.getById(1);
    }
}
