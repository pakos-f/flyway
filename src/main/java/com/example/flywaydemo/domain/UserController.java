package com.example.flywaydemo.domain;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @GetMapping
    String test() {

        Business business = new Business();
        return business.dd();
    }

}
