package com.smcsolutions.smcsolutions.repositorios;

import com.smcsolutions.smcsolutions.modelo.MovimientoDinero;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoRepositorio extends CrudRepository<MovimientoDinero, Long> {
    public abstract ArrayList<MovimientoDinero> findAllByEmpresa(String empresa);



}

