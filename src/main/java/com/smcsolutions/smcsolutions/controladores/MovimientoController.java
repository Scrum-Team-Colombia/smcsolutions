package com.smcsolutions.smcsolutions.controladores;

import java.util.ArrayList;

import com.smcsolutions.smcsolutions.modelo.MovimientoDinero;
import com.smcsolutions.smcsolutions.services.MovimientoServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movimiento")
public class MovimientoController {
    
    @Autowired
    MovimientoServicio movimientoServicio;

    @GetMapping("/obtener")
    public ArrayList<MovimientoDinero> obtenerMovimientos(){
        return movimientoServicio.obtenerMovimientos();
    }
    
    @PostMapping("/guardar")
    public MovimientoDinero guardarMovimiento(@RequestBody MovimientoDinero movimientoDinero){
        return this.movimientoServicio.guardarMovimiento(movimientoDinero);
    }

    @PatchMapping("/actualizar")
    public MovimientoDinero actualizarMovimiento(@RequestBody MovimientoDinero movimientoDinero){
        return this.movimientoServicio.guardarMovimiento(movimientoDinero);
    }

    @DeleteMapping("/eliminar")
    public String eliminarMovimiento(@RequestBody MovimientoDinero movimientoDinero){
        boolean ok = this.movimientoServicio.eliminarMovimiento(movimientoDinero);
        if(ok){
            return "Se eliminó el movimiento con éxito";
        }else{
            return "No se pudo eliminar el movimiento";
        }
    }
}
