package com.example.flywaydemo.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Business {

    @Autowired
    Test test;

    public String user(){
        return "TEST";
    }

    public String dd(){
        return "dd";
    }
}
