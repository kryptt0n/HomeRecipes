package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "product_in_dish")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ProductInDish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @OneToOne(targetEntity = Dish.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "dish")
    Dish dish;

    @OneToOne(targetEntity = Product.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "product")
    Food food;

    public ProductInDish(Integer id, Dish dish, Food food) {
        this.id = id;
        this.dish = dish;
        this.food = food;
    }

    public ProductInDish() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "FoodInDish{" +
                "dish=" + dish +
                ", food=" + food +
                '}';
    }
}
