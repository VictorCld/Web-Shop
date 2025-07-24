package com.example.WebShop.mapper;

import java.util.List;

import org.mapstruct.*;

import com.example.WebShop.dto.produto.ProdutoRequestDto;
import com.example.WebShop.dto.produto.ProdutoResponseDto;
import com.example.WebShop.entities.Produto;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {
    
    ProdutoResponseDto toDto(Produto entity);

    Produto toEntity(ProdutoRequestDto dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDto(ProdutoRequestDto dto, @MappingTarget Produto entity);

    List<ProdutoResponseDto> toDtoList(List<Produto> entities);
    
}
