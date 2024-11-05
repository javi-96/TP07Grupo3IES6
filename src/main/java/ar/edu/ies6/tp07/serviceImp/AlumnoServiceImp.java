package ar.edu.ies6.tp07.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ar.edu.ies6.tp07.model.Alumno;
import ar.edu.ies6.tp07.util.AlmacenAlumno;
@Service
public class AlumnoServiceImp {


	@Qualifier("servicioAlumnoArrayList")
	
	public void eliminarAlumno(String dni){
		// TODO Auto-generated method stub
		
	}

	public void modificarAlumno(Alumno alumnoModificado){
		// TODO Auto-generated method stub
		
	}

	public Alumno consultarAlumno(String dni){
		// TODO Auto-generated method stub
		return null;
	}

	public List<Alumno> listarTodosAlumnos() {
		// TODO Auto-generated method stub

		return AlmacenAlumno.alumno;
	}

	public void guardarAlummno(Alumno alumno) {
		// TODO Auto-generated method stub
		
	}
}
