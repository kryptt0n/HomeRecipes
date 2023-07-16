package com.example.demo.repositories;

import com.example.demo.entities.Dish;
import com.example.demo.entities.Food;
import com.example.demo.entities.FoodInDish;

import java.util.List;

public interface CustomizedDishRepository {
    List<FoodInDish> findFoodForDish(Dish dish);
}
