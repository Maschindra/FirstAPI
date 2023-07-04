package com.third.api.Food.repository;

import com.third.api.Food.model.FoodItems;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepo extends JpaRepository<FoodItems,Long> {



}
