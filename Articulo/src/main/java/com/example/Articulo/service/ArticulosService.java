package com.example.Articulo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Articulo.dto.ArticuloDTO;
import com.example.Articulo.mapper.ArticuloMapper;
import com.example.Articulo.model.ArticuloModel;
import com.example.Articulo.repository.IArticuloRepository;

@Service
public class ArticulosService implements IArticuloService {

    @Autowired
    ArticuloMapper articuloMapper;
    @Autowired
    IArticuloRepository articuloRepository;

    @Override
    public ArticuloDTO crear(ArticuloDTO art) {
        ArticuloModel model = articuloMapper.toEntity(art);
        ArticuloModel agregado = articuloRepository.save(model);

        return articuloMapper.toArtDTO(agregado);   
    }
    
    
}
