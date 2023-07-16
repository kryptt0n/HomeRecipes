package com.example.demo;

import com.example.demo.entities.Food;
import com.example.demo.repositories.FoodRepository;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class ControllersTest {

    @Test
    public void shouldGetAllItems() {
        get("/food/302").then().body("id", is(12));
    }
}
