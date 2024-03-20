package com.example.tp2.dao.repositories;

import com.example.tp2.dao.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    public List<Product> findByPrice(Double price);
    public List<Product> findByDescription(String desc);

    public List<Product> findByQuantity(Double quantity);


}
