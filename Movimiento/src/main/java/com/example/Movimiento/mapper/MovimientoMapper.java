package com.example.Movimiento.mapper;

import org.mapstruct.Mapper;

import com.example.Movimiento.dto.MovimientoDTO;
import com.example.Movimiento.model.MovimientoModel;

@Mapper(componentModel = "spring")
public interface MovimientoMapper {


    MovimientoDTO toMovDTO(MovimientoModel movimientoModel);

    MovimientoModel toEntity(MovimientoDTO movimientoDTO);
}
