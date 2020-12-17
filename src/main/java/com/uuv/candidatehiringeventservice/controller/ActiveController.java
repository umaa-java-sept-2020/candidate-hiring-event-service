package com.uuv.candidatehiringeventservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ActiveController {

    @GetMapping("/active/")
    public String getActive()
    {
        return "I AM ACTIVE "+ new Date();
    }

}
