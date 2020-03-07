package com.example.projectwebservicejpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectwebservicejpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
