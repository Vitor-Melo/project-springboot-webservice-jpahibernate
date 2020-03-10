package com.example.projectwebservicejpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectwebservicejpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
