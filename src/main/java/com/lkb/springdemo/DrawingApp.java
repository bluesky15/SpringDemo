package com.lkb.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DrawingApp {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Triangle triangle = factory.getBean(Triangle.class);
        triangle.draw();
    }
}
