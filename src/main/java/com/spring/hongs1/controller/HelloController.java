package com.spring.hongs1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/helloHongs1")
    public String hello() {
        return "TEST";

    }

    @GetMapping("/helloIndex")
    public String hello2(){
        return "helloIndex";

    }
}
