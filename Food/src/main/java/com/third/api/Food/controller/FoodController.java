package com.third.api.Food.controller;

import com.third.api.Food.exception.ResourceNotFoundException;
import com.third.api.Food.model.FoodItems;
import com.third.api.Food.repository.FoodRepo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food/view/foods")
public class FoodController {

    @Autowired
    public FoodRepo foodRepo;

    @GetMapping
    public List<FoodItems> getFoodList(){
        return foodRepo.findAll();
    }

    @PostMapping
    public FoodItems enterFoods(  @RequestBody FoodItems foodItems){
        return foodRepo.save(foodItems);
    }

    @GetMapping("{id}")
    public ResponseEntity<FoodItems> getFoodById(@PathVariable("id") Long id){
      FoodItems foodItems =  foodRepo.findById(id).orElseThrow(
                ()->new ResourceNotFoundException("FoodItem is available with this id :"+id));
      return  ResponseEntity.ok(foodItems);

    }
    @PutMapping("{id}")
    public ResponseEntity<FoodItems> updateFoodById(@PathVariable("id") Long id,@RequestBody FoodItems foodItems){
        FoodItems foodItems1= foodRepo.findById(id).orElseThrow(
                ()->new ResourceNotFoundException("Food is not exist with this id : "+id));

        foodItems1.setFoodName(foodItems1.getFoodName());
        foodItems1.setPrice(foodItems1.getPrice());
        foodRepo.save(foodItems1);
        return ResponseEntity.ok(foodItems1);

    }
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteFoodById(@PathVariable("id") Long id){
        FoodItems foodItems = foodRepo.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Food not exist with this id : "+id));
        foodRepo.deleteById(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }



}
