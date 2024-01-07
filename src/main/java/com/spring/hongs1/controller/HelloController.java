package com.spring.hongs1.controller;


import com.spring.hongs1.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/helloHongs1")
    public int hello() {
        return helloService.getMember().getAge();

    }

    @GetMapping("/index")
    public String hello2() {
        return "index";

    }

    @GetMapping("/hello3")
    public String hello3(){
        return "hello";
    }

}
