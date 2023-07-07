package com.example.springRedis.springRedisFirst.controller;

import com.example.springRedis.springRedisFirst.entity.Product;
import com.example.springRedis.springRedisFirst.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    public ProductService service;

    @PostMapping
    public Product savePro(@RequestBody Product product){
       return service.save(product);
    }
    @GetMapping
    public List<Product> getAll(){
        return service.findAllProduct();
    }
    @GetMapping("/{id}")
    public Product getByIdPro(@PathVariable  int id){
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteByIdPro(@PathVariable int id){
        return service.deleteById(id);
    }

}
