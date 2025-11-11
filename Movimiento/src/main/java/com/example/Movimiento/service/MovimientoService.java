package com.example.Movimiento.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Movimiento.Exception.BadRequest;
import com.example.Movimiento.Exception.NotFound;
import com.example.Movimiento.dto.MovimientoDTO;
import com.example.Movimiento.mapper.MovimientoMapper;
import com.example.Movimiento.model.MovimientoModel;
import com.example.Movimiento.repository.IMovimientoRepository;

@Service
public class MovimientoService implements IMovimientoService {

    @Autowired
    MovimientoMapper movimientoMapper;
    @Autowired
    IMovimientoRepository movimientoRepository;

    @Override
    public MovimientoDTO actualizar(MovimientoDTO movimiento) {
        if (movimiento.getIdMovimiento()== null) {
            throw new BadRequest("El ID es obligatorio ");
        }

        Optional<MovimientoModel> movExistenteOpt = movimientoRepository.findById(movimiento.getIdMovimiento());
        if (movExistenteOpt.isEmpty()) {
            throw new NotFound("No se encontró movimiento con ID: " + movimiento.getIdMovimiento());
        }

        MovimientoModel movimientoExistente = movExistenteOpt.get();

        movimientoExistente.setEstado(movimiento.getEstado());

        MovimientoModel movimientoActualizado = movimientoRepository.save(movimientoExistente);

        return movimientoMapper.toMovDTO(movimientoActualizado);
    }

}
