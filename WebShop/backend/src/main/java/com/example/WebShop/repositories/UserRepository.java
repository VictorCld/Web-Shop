package com.example.WebShop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.WebShop.entities.User.User;

public interface UserRepository extends JpaRepository<User, Long>{
    UserDetails findByLogin(String login);
} 
