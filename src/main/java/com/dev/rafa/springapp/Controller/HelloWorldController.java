package com.dev.rafa.springapp.Controller;

import com.dev.rafa.springapp.service.HelloWorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("get-started")

public class HelloWorldController {

    private final HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping
    public String HelloWorld() {
        return helloWorldService.sayHello("Rafael");
    }
}
