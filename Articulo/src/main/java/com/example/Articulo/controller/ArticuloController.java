package com.example.Articulo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Articulo.dto.ArticuloDTO;
import com.example.Articulo.routes.routes;
import com.example.Articulo.service.ArticulosService;

@RestController
@RequestMapping(routes.Art)
public class ArticuloController {

    @Autowired
    ArticulosService articuloService;

    @GetMapping(routes.AgregarArticulo)
    public ArticuloDTO crear(@RequestBody ArticuloDTO art) {
        return articuloService.crear(art);
    }

    


    
}
