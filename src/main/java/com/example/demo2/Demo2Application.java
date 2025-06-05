package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
        try {
            Thread.currentThread().join();
            System.out.println("demo2");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }

}
