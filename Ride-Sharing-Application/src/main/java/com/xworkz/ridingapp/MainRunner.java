package com.xworkz.ridingapp;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bcp");
    }
}
