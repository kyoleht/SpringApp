package com.dev.rafa.springapp.service;

import org.springframework.stereotype.Service;

@Service

public class HelloWorldService {
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
