package com.example.JavaJenkinsDocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v2")
public class Controller {
    @GetMapping("/name")
    public String demo_localHost() {
        return "Welcome to the local host Everyone!!!!!!";
    }
}
