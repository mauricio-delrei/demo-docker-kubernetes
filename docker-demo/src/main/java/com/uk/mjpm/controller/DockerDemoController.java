package com.uk.mjpm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerDemoController {

    @GetMapping("/test")
    public String getData(){
        return "Docker Tutorial Project";
    }
}
