package com.xwrokz.udemy.runner;

import com.xwrokz.udemy.entity.UdemyEntity;
import com.xwrokz.udemy.service.UdemyService;
import com.xwrokz.udemy.service.UdemyServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SaveRunner {
    private static UdemyService service = new UdemyServiceImpl();
    public static void main(String[] args) {
//        UdemyEntity entity = new UdemyEntity(null,"JPA for Biginers","Harish","Biginners",4.7,299.00);
//        service.save(entity);

        List<UdemyEntity> entities = new ArrayList<>();

        entities.add(new UdemyEntity(null, "JPA for Beginners", "Harish", "Beginners", 4.7, 299.00));
        entities.add(new UdemyEntity(null, "Spring Boot Mastery", "Rajesh", "Intermediate", 4.8, 399.00));
        entities.add(new UdemyEntity(null, "Java Programming", "Sneha", "Advanced", 4.9, 499.00));
        entities.add(new UdemyEntity(null, "Angular Basics", "John", "Beginner", 4.5, 199.00));
        entities.add(new UdemyEntity(null, "React for Beginners", "Aisha", "Beginner", 4.6, 249.00));

        for (UdemyEntity entity : entities) {
            service.save(entity);
        }
    }
}
