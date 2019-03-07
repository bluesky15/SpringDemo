package com.lkb.springdemo;

public class HelloWorldBean {
    private String msg;
    public HelloWorldBean(String s) {
        this.msg = s;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return this.msg;
    }
}
