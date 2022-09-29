package scrumteamcolombia.smcsolutions.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smcsolutions.smcsolutions.modelo.Empresa;

import scrumteamcolombia.smcsolutions.repositories.EmpresaRepository;      //el proyecto esta diferente, en el modelo esta bien


@Service
public class EmpresaService {
    @Autowired
    EmpresaRepository empresaRepository;

    public ArrayList<Empresa> obtenerEmpresas(){
        return (ArrayList<Empresa>) empresaRepository.findAll();
    }

    public Empresa guardarEmpresa(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public Optional<Empresa> obtenerPorId(Long id){
        return empresaRepository.findById(id);
    }

    public ArrayList<Empresa>  obtenerPorPrioridad(Integer prioridad) {
        return empresaRepository.findByPrioridad(prioridad);
    }

    public boolean eliminarEmpresa(Long id) {
        try{
            empresaRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }


}
