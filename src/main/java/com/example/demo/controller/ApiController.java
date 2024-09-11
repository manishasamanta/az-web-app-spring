package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class ApiController {

    Logger logger= LoggerFactory.getLogger(ApiController.class);
    @GetMapping("/health")
    public String health(){
        System.out.println("called API");
        logger.warn("warning - health api is called ");
        return "health API";
    }

}
