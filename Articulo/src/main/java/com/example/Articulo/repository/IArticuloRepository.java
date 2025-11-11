package com.example.Articulo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Articulo.model.ArticuloModel;

public interface IArticuloRepository extends JpaRepository<ArticuloModel, Integer>{

}
