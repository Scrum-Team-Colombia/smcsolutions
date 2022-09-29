package com.smcsolutions.smcsolutions.controladores;

import java.util.ArrayList;

import com.smcsolutions.smcsolutions.modelo.Empleado;
import com.smcsolutions.smcsolutions.services.EmpleadoServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    
    @Autowired
    EmpleadoServicio empleadoServicio;

    @GetMapping("/obtener")
    public ArrayList<Empleado> obtenerEmpleados(){ 
        return empleadoServicio.obtenerEmpleados();
    }
    
    @PostMapping("/guardar")
    public Empleado guardarEmpleado(@RequestBody Empleado empleado){
        return this.empleadoServicio.guardarEmpleado(empleado);
    }

    @PatchMapping("/actualizar")
    public Empleado actualizarEmpleado(@RequestBody Empleado empleado){
        return this.empleadoServicio.guardarEmpleado(empleado);
    }

    @DeleteMapping("/eliminar")
    public String eliminarMovimiento(@RequestBody Empleado empleado){
        boolean ok = this.empleadoServicio.eliminarEmpleado(empleado);
        if(ok){
            return "Se eliminó el empleado con éxito";
        }else{
            return "No se pudo eliminar el empleado";
        }
    }
}
