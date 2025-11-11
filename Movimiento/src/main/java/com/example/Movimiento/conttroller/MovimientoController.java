package com.example.Movimiento.conttroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Movimiento.dto.MovimientoDTO;
import com.example.Movimiento.routes.routes;
import com.example.Movimiento.service.MovimientoService;

@RestController
@RequestMapping(routes.Movimiento)
public class MovimientoController {
    
    @Autowired
    MovimientoService movimientoService;

    @PutMapping(routes.actualizarEstado)
    public MovimientoDTO actualizar(@RequestBody MovimientoDTO movimiento) {
        return movimientoService.actualizar(movimiento);
    }

}
