package com.example.WebShop.dto.produto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ProdutoResponseDto(
    Long id,
    String nome,
    String descricao,
    BigDecimal preco,
    Integer quantidadeEstoque,
    String categoria,
    String marca,
    Boolean ativo,
    LocalDateTime dataCriacao,
    LocalDateTime dataAtualizacao 
) {   
}
