package ar.edu.ies6.tp07.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ar.edu.ies6.tp07.model.Docente;
import ar.edu.ies6.tp07.repository.DocenteRepository;
import ar.edu.ies6.tp07.service.IDocenteService;
@Service
@Qualifier ("servicioDocenteBD")
public class DocenteServiceImpBD implements IDocenteService {

	@Autowired
	DocenteRepository docenteRepository;
	
	@Override
	public void guardarDocente(Docente docente) {
		// TODO Auto-generated method stub
		//guardar en la BD
		//nos dic q todos los docentes igresados se guardaran como activos por defecto
		docente.setEstado(true);
		docenteRepository.save(docente);
	}

	@Override
	public void eliminarDocente(String dni) {
		// TODO Auto-generated method stub
		Optional<Docente> docenteEncontrado = docenteRepository.findById(dni);
		docenteEncontrado.get().setEstado(false);
		docenteRepository.save(docenteEncontrado.get());
	}

	@Override
	public void modificarDocente(Docente modificarDocente) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public Docente consultarDocente(String dni) {
		// TODO Auto-generated method stub
		return docenteRepository.findById(dni).get();
	}

	@Override
	public List<Docente> listarTodosDocentes() {
		// TODO Auto-generated method stub
		return (List <Docente>) docenteRepository.findAll();
	}
	@Override
	public List<Docente> listarTodosDocentesActivos() {
		// TODO Auto-generated method stub
		return (List<Docente>) docenteRepository.findByEstado(true); //muestra todo los q estan activos
	}

}
