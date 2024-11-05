package ar.edu.ies6.tp07.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import ar.edu.ies6.tp07.model.Docente;
public interface DocenteRepository extends CrudRepository <Docente, String> {
	
	//se creo un nuevo metodo
	List <Docente> findByEstado (Boolean estado);

}
