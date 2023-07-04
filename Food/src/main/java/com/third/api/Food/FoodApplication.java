package com.third.api.Food;

import com.third.api.Food.model.FoodItems;
import com.third.api.Food.repository.FoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoodApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FoodApplication.class, args);
	}

	@Autowired
	public FoodRepo foodRepo;

	@Override
	public void run(String... args) throws Exception {
		FoodItems foodItems = new FoodItems();
		foodItems.setFoodName("Idli");
		foodItems.setPrice(50);
        foodRepo.save(foodItems);

		FoodItems foodItems1 = new FoodItems();
		foodItems1.setFoodName("Puri");
		foodItems1.setPrice(40);
		foodRepo.save(foodItems1);

		FoodItems foodItems2 = new FoodItems();
		foodItems2.setFoodName("Dosa");
		foodItems2.setPrice(60);
		foodRepo.save(foodItems2);

	}
}
