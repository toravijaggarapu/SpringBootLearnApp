package com.webapp.WebAppSample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/login")
    public String greeting() {
        return "Hello Mr. Ravi Kiran...!";
    }

    @RequestMapping("/about")
    public String aboutRavi() {
        return "Mr. Ravi Kiran Now became a Full Stack Developer.";
    }
}
