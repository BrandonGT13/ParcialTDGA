package com.example.Movimiento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Movimiento.model.MovimientoModel;

public interface IMovimientoRepository extends JpaRepository<MovimientoModel,Integer> {

}
