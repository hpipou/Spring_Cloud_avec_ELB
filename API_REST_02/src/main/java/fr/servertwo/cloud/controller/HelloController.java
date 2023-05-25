package fr.servertwo.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloWelcome(){
        return "HELLO FROM SERVER 2";
    }
}
