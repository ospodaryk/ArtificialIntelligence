package com.example.lab2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String getHome() {
        return "home";
    }

    @GetMapping("/lab3")
    public String getlab3() {
        return "index";
    }
}
