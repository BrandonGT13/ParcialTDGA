package com.example.Articulo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "articulo")
public class ArticuloModel {

    @Id
    @Column(name = "idarticulo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idArticulo;
    @Column(name = "nombre")
    private String nombre;
     @Column(name = "precio")
    private double precio;
    
}
