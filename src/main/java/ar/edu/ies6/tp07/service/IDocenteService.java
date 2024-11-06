package ar.edu.ies6.tp07.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.ies6.tp07.model.Docente;

@Service
public interface IDocenteService {

	//AQUI DICE QUE HACE
	
	//defines los métodos que serán implementados por una clase 
	//de servicio (como DocenteServiceImp) para realizar operaciones
	//relacionadas con el objeto Docente
	
	

	//metodos que resuelven una tarea
	public void guardarDocente(Docente docente);
	public void eliminarDocente(String dni);
	public void modificarDocente(Docente modificarDocente);
	public Docente consultarDocente(String dni);
	// esto es la logica en la que tiene que trabajar caada metodo
	List<Docente> listarTodosDocentes();
	List<Docente> listarTodosDocentesActivos();
	
}