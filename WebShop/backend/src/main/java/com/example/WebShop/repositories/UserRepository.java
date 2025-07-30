package com.example.WebShop.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.WebShop.entities.User.User;

public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findByLogin(String login);
} 
