package com.example.nimaptask.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.nimaptask.entity.Category;

public interface CategoryRepository extends JpaRepository<com.example.nimaptask.entity.Category, Long> {
}
