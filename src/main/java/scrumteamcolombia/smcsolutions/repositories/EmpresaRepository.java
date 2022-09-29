package scrumteamcolombia.smcsolutions.repositories; //el paquete esta diferente en el modelo esta bien

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.smcsolutions.smcsolutions.modelo.Empresa;

@Repository
public interface EmpresaRepository extends CrudRepository<Empresa, Long> {
    public abstract ArrayList<Empresa>findByPrioridad(Integer prioridad);
}
