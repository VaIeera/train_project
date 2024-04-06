package com.valeera.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Valeera
 * @date 2024/4/7
 */
@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello(){
        return "hello world!";
    }

}
