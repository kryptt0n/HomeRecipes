package com.example.demo.repositories;

import com.example.demo.entities.Dish;
import com.example.demo.entities.ProductInDish;

import java.util.List;

public interface CustomizedDishRepository {
    List<ProductInDish> findFoodForDish(Dish dish);
}
