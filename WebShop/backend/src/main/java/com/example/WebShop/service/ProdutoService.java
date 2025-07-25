package com.example.WebShop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.WebShop.dto.produto.ProdutoRequestDto;
import com.example.WebShop.dto.produto.ProdutoResponseDto;
import com.example.WebShop.entities.Produto;
import com.example.WebShop.mapper.ProdutoMapper;
import com.example.WebShop.repositories.ProdutoRepository;
import com.example.WebShop.service.exception.NotFoundException;

@Service
public class ProdutoService {

    private ProdutoMapper produtoMapper;

    private ProdutoRepository produtoRepository;

    public ProdutoService (ProdutoMapper produtoMapper, ProdutoRepository produtoRepository){
        this.produtoMapper = produtoMapper;
        this.produtoRepository = produtoRepository;
    }

    // ======================== GET =========================
    public List<ProdutoResponseDto> findAll(){
        List<Produto> produtoList = produtoRepository.findAll();

        return produtoMapper.toDtoList(produtoList);
    }

    public ProdutoResponseDto findById(Long id){
        Produto produto = produtoRepository.findById(id).orElseThrow(() -> new NotFoundException("Produto não encontrado."));

        return produtoMapper.toDto(produto);
    }
    // ======================== POST ========================
    public ProdutoResponseDto create(ProdutoRequestDto produtoRequestDto){
        Produto produto = produtoMapper.toEntity(produtoRequestDto);
        Produto produtoSaved = produtoRepository.save(produto);
        
        return produtoMapper.toDto(produtoSaved);
    }
    // ======================== PUT =========================

    // ======================= DELETE =======================

}
