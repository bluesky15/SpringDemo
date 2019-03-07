package com.lkb.springdemo;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class ApiController {
    @GetMapping(path = "/hello-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello world-bean!");
    }

    @PostMapping(path="/hi/{name}")
    public HelloWorldBean greet(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hi %s",name));
    }
}
