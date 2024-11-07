package ar.edu.ies6.tp07.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.ies6.tp07.model.Materia;

@Service

public interface IMateriaService {

	//Metodos que resuelven una tarea
	//solo le digo lo que va a hacer
	public void guardarMateria(Materia materia);
	public void eliminarMateria(String codigo);
	public void modificarMateria(Materia materiaModificada);
	public Materia consultarMateria(String codigo);
	public List<Materia> listarTodasMaterias();
	
}
