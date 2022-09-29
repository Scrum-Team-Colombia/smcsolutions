package com.smcsolutions.smcsolutions.services;


import java.util.ArrayList;
import java.util.Optional;

import com.smcsolutions.smcsolutions.modelo.MovimientoDinero;
import com.smcsolutions.smcsolutions.repositorios.MovimientoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MovimientoServicio {
    @Autowired
    MovimientoRepositorio movimientoRepositorio;

    public ArrayList<MovimientoDinero> obtenerMovimientos(){
        return (ArrayList<MovimientoDinero>) movimientoRepositorio.findAll();
    }

    public MovimientoDinero guardarMovimiento(MovimientoDinero movimientoDinero){
        return movimientoRepositorio.save(movimientoDinero);
    }

    public boolean eliminarMovimiento(MovimientoDinero movimientoDinero) {
        return movimientoRepositorio.findById(movimientoDinero.getId()).map(movimiento -> {
            movimientoRepositorio.delete(movimiento);
            return true;
        }).orElse(false);
    }

    public Optional<MovimientoDinero> obtenerPorId(Long id) {
        return movimientoRepositorio.findById(id);
    }

}