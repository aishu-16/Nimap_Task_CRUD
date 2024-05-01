package com.example.nimaptask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.nimaptask.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
