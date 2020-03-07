package com.example.projectwebservicejpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectwebservicejpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
