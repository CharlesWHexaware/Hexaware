package com.example.demo;


import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/employee")
public class Controller {

    @GetMapping("/")
        public String home(){
            return "Hello World!";

        }

    @PostMapping
    public String createEmployee(@Valid @RequestBody Employee employee) {
        return "“Status” : “VALID”";
    }

}
