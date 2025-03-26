package com.spring.firstspring.app.controller;

import com.spring.firstspring.app.controller.service.HelloWorldService;
import com.spring.firstspring.app.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
    @Autowired
    private  HelloWorldService helloWorldService;

    @GetMapping
    public String helloWorld(){
        return helloWorldService.helloWorld("Deyvisson");
    }

    @PostMapping()
    public String helloWorldPost(@RequestBody User body) {
        return "Hello World " + body.getName();
    }
}
