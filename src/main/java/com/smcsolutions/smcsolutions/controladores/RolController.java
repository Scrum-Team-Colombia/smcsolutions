package com.smcsolutions.smcsolutions.controladores;

import java.util.ArrayList;

import javax.management.relation.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smcsolutions.smcsolutions.services.RolServicio;

@RestController
@RequestMapping("/rol")
public class RolController {
    
    @Autowired
    RolServicio rolServicio;

    @GetMapping("/obtener")
    public ArrayList<Role> obtenerRol(){
        return rolServicio.obtenerRol();
    }
    
    @PostMapping("/guardar")
    public Rol guardarRol(@RequestBody Rol rol){
        return this.rolServicio.guardarRol(rol);
    }

    @PatchMapping("/actualizar")
    public Rol actualizarRol(@RequestBody Rol rol){
        return this.rolServicio.guardarRol(rol);
    }

    @DeleteMapping("/eliminar")
    public String eliminarRol(@RequestBody Rol rol){
        boolean ok = this.rol.eliminarRol(rol);
        if(ok){
            return "Se eliminó el rol con éxito";
        }else{
            return "No se pudo eliminar el rol";
        }
    }
}
