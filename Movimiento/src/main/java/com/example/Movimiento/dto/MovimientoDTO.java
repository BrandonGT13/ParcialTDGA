package com.example.Movimiento.dto;

import lombok.Data;

@Data
public class MovimientoDTO {

    private Integer idMovimiento;
    private Integer idArticulo;
    private String tipoMovimiento;
    private Integer cantidad;
    private int estado;
    
}
