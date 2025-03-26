package com.spring.firstspring.app.controller.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String helloWorld(String name) {
        return "Hello World!!! Sou a classe Service, meu nome é HelloWorldService, nice to meet you "+ name;
    }
}
