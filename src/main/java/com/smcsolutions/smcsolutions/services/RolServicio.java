package com.smcsolutions.smcsolutions.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RolServicio {
    @Autowired
    RolServicio rol;

    public ArrayList<RolServicio> obtenerRol(){
        return (ArrayList<RolServicio>) rol. .findAll();
    }

    public RolServicio guardarRol(RolServicio rol){
        return rol.save(rol);
    }

    public boolean eliminarRol(RolServicio rol) {
        return rol.findById(rol.getId()).map(rol -> {
            rolRepositorio.delete(rol);
            return true;
        }).orElse(false);
    }

    public Optional<RolServicio> obtenerPorId(Long id) {
        return rol.findById(id);
    }

}
