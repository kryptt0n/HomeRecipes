package com.example.demo.repositories;

import com.example.demo.entities.Dish;
import com.example.demo.entities.Food;
import com.example.demo.entities.FoodInDish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DishRepository extends JpaRepository<Dish, Integer> {

    @Query(value = "SELECT f FROM FoodInDish f WHERE f.dish = :dish")
    List<FoodInDish> findFoodForDish(@Param("dish") Dish dish);
}
