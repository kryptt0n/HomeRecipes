package com.example.demo.repositories;

import com.example.demo.entities.Food;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public class FoodRepositoryImpl implements CustomizedFoodRepository{

    @Query(value = "SELECT dish_id FROM food_in_dish WHERE food_id = :food", nativeQuery = true)
    public List<Food> findFoodForDish(@Param("food") Food food) {
        return null;
    }

    @Override
    public List<Food> findFoodForDish() {
        return null;
    }
}
