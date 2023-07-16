package com.example.demo.repositories;

import com.example.demo.entities.Food;

import java.util.List;

public interface CustomizedFoodRepository {
    List<Food> findFoodForDish();
}
