package scrumteamcolombia.smcsolutions.controllers; //el paquete esta diferente, en el modelo esta bien

import java.util.ArrayList;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.smcsolutions.smcsolutions.modelo.Empresa;

@RestController
@RequestMapping("/empresa")
public class EmpresaControllers {

    @Autowired
    Empresa empresaService;
    
    @GetMapping()
    public ArrayList<Empresa> obtenerEmpresas(){
        return empresaService.obtenerEmpresas();
    }

    @PostMapping()
    public Empresa guardarEmpresa(@RequestBody Empresa empresa){
        return this.empresaService.guardarEmpresa(empresa);
    }

    @GetMapping( path = "/{id}")
    public Optional<Empresa> obtenerEmpresaPorId(@PathVariable("id") Long id) {
        return this.empresaService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public Optional<Empresa> obtenerEmpresaPorPrioridad(@RequestParam("prioridad") Integer prioridad){
        return this.empresaService.obtenerPorId(prioridad);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.empresaService.eliminarEmpresa(id);
        if (ok){
            return "Se eliminó la empresa con id " + id;
        }else{
            return "No pudo eliminar la empresa con id" + id;
        }
    }


}
