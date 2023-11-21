package com.example.user.controllerFood;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class PizzaController {
    @GetMapping
    public String Pizza(){
        return "pizza";
    }
}
