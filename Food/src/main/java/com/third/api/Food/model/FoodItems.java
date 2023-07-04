package com.third.api.Food.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Foods")
public class FoodItems {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   @Column(name = "foodName")
    private String foodName;


   @Column(name = "price")
    private int price;
}
