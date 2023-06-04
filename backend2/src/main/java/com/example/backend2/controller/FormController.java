package com.example.backend2.controller;

import com.example.backend2.db.Monument;
import com.example.backend2.model.FormData;
import com.example.backend2.repository.MonumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class FormController {
    private final MonumentRepository monumentRepository;

    @Autowired
    public FormController(MonumentRepository monumentRepository) {
        this.monumentRepository = monumentRepository;
    }
    @PostMapping("/tours")
    public ResponseEntity<List<Monument>> handleFormSubmission(@RequestBody FormData formData) {
        String location = formData.getLocation();
        String period = formData.getPeriod();
        int time = formData.getTime();
        int budget = formData.getBudget();
        System.out.println(location + period + time + budget);

        List<Monument> monumentList = monumentRepository.findByCommune(location);

        System.out.println(location + period + time + budget);

        return new ResponseEntity<>(monumentList, HttpStatus.OK);
    }
}