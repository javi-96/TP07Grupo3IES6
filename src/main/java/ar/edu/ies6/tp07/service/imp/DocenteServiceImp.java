package ar.edu.ies6.tp07.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ar.edu.ies6.tp07.model.Docente;
import ar.edu.ies6.tp07.service.IDocenteService;
import ar.edu.ies6.tp07.util.AlmacenDocente;

@Service
@Qualifier ("ServicioDocenteArrayList ")
public class DocenteServiceImp implements IDocenteService{
	
	//Y AQUI COMO LO HACE

	@Override
	public void guardarDocente(Docente docente) {
		// TODO Auto-generated method stub
		AlmacenDocente.docentes.add(docente);
		System.out.println(AlmacenDocente.docentes.get(0).getDni());
		
	}

	@Override
	public void eliminarDocente(String dni) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarDocente(Docente modificarDocente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Docente> listarTodosDocentes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Docente> listarTodosDocentesActivos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Docente consultarDocente(String dni) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	// 
	
	//aqui en docente service solo contiene la lógica de 
	//negocio para manejar objetos Docente

	
	

	
}