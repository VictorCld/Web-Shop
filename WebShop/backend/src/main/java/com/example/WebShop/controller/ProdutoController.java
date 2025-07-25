package com.example.WebShop.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.WebShop.dto.produto.ProdutoRequestDto;
import com.example.WebShop.dto.produto.ProdutoResponseDto;
import com.example.WebShop.service.ProdutoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping
public class ProdutoController {
    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService){
        this.produtoService = produtoService;
    }

    // ======================== GET =========================
    @GetMapping(value = "/produto")
    public ResponseEntity<List<ProdutoResponseDto>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(produtoService.findAll());
    }

    @GetMapping(value = "/produto/{produtoId}")
    public ResponseEntity<ProdutoResponseDto> findById(@PathVariable("produtoId") Long id){
        return ResponseEntity.status(HttpStatus.OK).body(produtoService.findById(id));
    }
    // ======================== POST ========================
    @PostMapping(value = "/produto")
    public ResponseEntity<ProdutoResponseDto> create(@RequestBody @Valid ProdutoRequestDto produto){
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.create(produto));
    }
    // ======================== PUT =========================

    // ======================= DELETE =======================
}
