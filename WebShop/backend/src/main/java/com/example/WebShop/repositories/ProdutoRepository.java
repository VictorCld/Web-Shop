package com.example.WebShop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.WebShop.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
}
