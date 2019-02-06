package com.lkb.springdemo;

public class Triangle {
    private String type;

    public Triangle(String type) {
        this.type = type;
    }

    public void draw() {
        System.out.println(getType() + " Triangle drawn");
    }

    public String getType() {
        return type;
    }
}
