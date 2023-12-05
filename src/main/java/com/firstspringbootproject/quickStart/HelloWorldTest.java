package com.firstspringbootproject.quickStart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldTest {

    @GetMapping(path = "/hello")
    public String helloWorld(){
        return "Hello World!";
    }
}
