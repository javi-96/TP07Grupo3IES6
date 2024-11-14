package ar.edu.ies6.tp07.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ar.edu.ies6.tp07.model.Materia;
import ar.edu.ies6.tp07.repository.MateriaRepository;
import ar.edu.ies6.tp07.service.IMateriaService;

@Service
@Qualifier("servicioMateriaBD")

public class MateriaServiceImpBD implements IMateriaService {
	
	// Inyeccion de dependencia
	//creamos una instancia de la clase una sola vez que va a hacer reutilizado
	
	@Autowired
	MateriaRepository materiaRepository;
	

	@Override
	public void guardarMateria(Materia materia) {
		// TODO Auto-generated method stub
		// guardar en la BD
		materiaRepository.save(materia);
		
	}

	@Override
	public void eliminarMateria(String codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarMateria(Materia materiaModificada) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Materia consultarMateria(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Materia> listarTodasMaterias() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
