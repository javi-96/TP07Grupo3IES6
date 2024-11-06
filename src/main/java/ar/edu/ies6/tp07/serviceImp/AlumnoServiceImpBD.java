package ar.edu.ies6.tp07.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ar.edu.ies6.tp07.model.Alumno;
import ar.edu.ies6.tp07.repository.AlumnoRepository;
import ar.edu.ies6.tp07.service.IAlumnoService;

@Service
@Qualifier("servicioAlumnoBD")
public class AlumnoServiceImpBD implements IAlumnoService {
     @Autowired 
	AlumnoRepository alumnoRepository;
	@Override
	public void guardarAlummno(Alumno alumno) {
		// TODO Auto-generated method stub
		alumno.setEstado(true);
		
		 alumnoRepository.save(alumno);
	}

	@Override
	public void eliminarAlumno(String dni) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarAlumno(Alumno alumnoModificado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Alumno consultarAlumno(String dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Alumno> listarTodosAlumnos() {
		
		// TODO Auto-generated method stub
	
		return (List<Alumno>) alumnoRepository.findAll();// el iterable se convierte en una lista de alumnos y la devuelve
	}

	

	@Override
	public List<Alumno> listarTodosAlumnosActivos() {
		// TODO Auto-generated method stub
	
		return (List<Alumno>) alumnoRepository.findByEstado(true); //muestra todo los q estan activos
		}
}

