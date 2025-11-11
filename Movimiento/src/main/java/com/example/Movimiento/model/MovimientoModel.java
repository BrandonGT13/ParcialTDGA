package com.example.Movimiento.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "movimiento")
public class MovimientoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idmovimiento")
    private Integer idMovimiento;

    @Column(name = "idarticulo")
    private Integer idArticulo;
    @Column(name = "tipomovimiento")
    private String tipoMovimiento;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Column(name = "estado")
    private int estado;
    
}
