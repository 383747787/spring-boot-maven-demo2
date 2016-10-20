package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kevinwu on 2016-10-19.
 */

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Das Boot3, reporting for duty!";
    }
}
