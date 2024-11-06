package ar.edu.ies6.tp07.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.ies6.tp07.model.Alumno;
@Service
public interface IAlumnoService {

	//crud
			//Metodos que resuelven un a tarea
			public void guardarAlummno( Alumno alumno);
			public void  eliminarAlumno(String dni );
			public void modificarAlumno(Alumno alumnoModificado); //o le podria poner modifica apellido
			public Alumno consultarAlumno(String dni);
			public List<Alumno> listarTodosAlumnos();
			public List<Alumno>listarTodosAlumnosActivos();
		}
	

