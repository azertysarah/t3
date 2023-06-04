package com.example.backend2.controller;

import com.example.backend2.model.FormData;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class FormController {
    @PostMapping("/tours")
    public void handleFormSubmission(@RequestBody FormData formData) {
        String location = formData.getLocation();
        String period = formData.getPeriod();
        int time = formData.getTime();
        int budget = formData.getBudget();
        System.out.println(location + period + time + budget);
    }
}