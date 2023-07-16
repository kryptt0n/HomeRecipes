package com.example.demo.repositories;

import com.example.demo.entities.Dish;
import com.example.demo.entities.Food;
import com.example.demo.entities.FoodInDish;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//public class DishRepositoryImpl implements CustomizedDishRepository{
//
//    @Autowired
//    EntityManager manager;
////
////    @Override
////    public List<Food> findFoodForDish(Dish dish) {
////        Query test = manager.createNamedQuery("SELECT test FROM FoodInDish test WHERE");
////        return null;
////    }
//}
