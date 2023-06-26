package com.example.demo.controllers;

import com.example.demo.entities.Food;
import com.example.demo.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    FoodRepository foodRepository;

    @GetMapping
    public ResponseEntity<Iterable<Food>> getAllFood() {
        return new ResponseEntity<>(foodRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Food> getFoodById(@PathVariable Long id) {
        Optional<Food> food = foodRepository.findById(id);

        if (food.isPresent()) {
            return new ResponseEntity<>(food.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
}
