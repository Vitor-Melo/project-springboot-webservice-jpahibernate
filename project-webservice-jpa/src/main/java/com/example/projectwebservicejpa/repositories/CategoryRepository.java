package com.example.projectwebservicejpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectwebservicejpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
