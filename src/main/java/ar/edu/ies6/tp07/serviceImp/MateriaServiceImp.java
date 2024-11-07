package ar.edu.ies6.tp07.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ar.edu.ies6.tp07.model.Materia;
import ar.edu.ies6.tp07.service.IMateriaService;
import ar.edu.ies6.tp07.util.AlmacenMateria;

@Service
@Qualifier("servicioMateriaArrayList")

public class MateriaServiceImp implements IMateriaService{

	@Override
	public void guardarMateria(Materia materia) {
		// TODO Auto-generated method stub
		//este guarda en el almacen de materia
		 //Aqui le digo como lo va a hacer
		AlmacenMateria.materia.add(materia);
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
		return AlmacenMateria.materia;
	}
	
	
	

}
