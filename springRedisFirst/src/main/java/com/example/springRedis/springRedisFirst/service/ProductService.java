package com.example.springRedis.springRedisFirst.service;

import com.example.springRedis.springRedisFirst.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class ProductService {


  public static final String HASH_KEY="Product";
    @Autowired
    public RedisTemplate temp;

    public Product save(Product product){
        temp.opsForHash().put(HASH_KEY,product.getId(),product);
        return product;
    }

    public List<Product> findAllProduct(){
      return temp.opsForHash().values(HASH_KEY);

    }
    public Product findById(int id){
        return (Product)temp.opsForHash().get(HASH_KEY,id);
    }

    public String deleteById(int id){
        temp.opsForHash().delete(HASH_KEY,id);
        return "Product is deleted";
    }
}
