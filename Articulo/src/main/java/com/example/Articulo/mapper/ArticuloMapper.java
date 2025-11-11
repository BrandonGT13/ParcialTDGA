package com.example.Articulo.mapper;

import org.mapstruct.Mapper;

import com.example.Articulo.dto.ArticuloDTO;
import com.example.Articulo.model.ArticuloModel;

@Mapper(componentModel = "spring")
public interface ArticuloMapper {

    ArticuloDTO toArtDTO(ArticuloModel artModel);

    ArticuloModel toEntity(ArticuloDTO artDTO);

}
