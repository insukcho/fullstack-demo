package com.chris.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WeclomeController {
    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

}
