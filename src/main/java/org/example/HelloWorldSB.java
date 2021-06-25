package org.example;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class HelloWorldSB {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "Mike") String name) {
        return String.format("Hello %s!", name);
    }


    public static void main(String[] args) throws Exception {

        SpringApplication.run(HelloWorldSB.class, args);
    }

}