package com.spring.hongs1.service;

import com.spring.hongs1.domain.Member;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService{
    @Override
    public Member getMember() {
        String id = "";
        String name = "";
        int age = 14;

        return new Member(id, name, age);
    }
}
