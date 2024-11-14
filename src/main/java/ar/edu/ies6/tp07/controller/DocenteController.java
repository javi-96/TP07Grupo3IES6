package ar.edu.ies6.tp07.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.ies6.tp07.model.Docente;
import ar.edu.ies6.tp07.service.IDocenteService;
import ar.edu.ies6.tp07.service.imp.DocenteServiceImp;

@Controller
public class DocenteController {

//aqui lo primero que hace es instanciar por unica vez a docente.
	//esto es una inyeccion de dependencia
@Autowired
Docente unDocente; //unDocente es un objeto de la clase docente. docente es una clase java

@Qualifier ("servicioDocenteBD")
@Autowired
IDocenteService docenteService;

//recibe laa petidicion docent

@GetMapping("/docente") 
public ModelAndView getIndexWithDocente () {

ModelAndView transportador = new ModelAndView("Docente");
transportador.addObject("docente", unDocente);

return transportador;}

//luego que se cargan los datos viene por post
@PostMapping("/guardarDocente")
public ModelAndView guardarDocente (Docente docente) {
	//Este método devuelve un objeto ModelAndView, que combina la vista 
	//(la página que se mostrará) y el modelo (los datos que se van a 
	//mostrar en la vista).
	
	
	
	//aqui creamos el servi y mandamos a guardar perroo es un problema asi que creamos una
	//inyeccion de dependenci a
	//DocenteServiceImp docenteService = new DocenteServiceImp() ;
	docenteService.guardarDocente (docente);
	
	//aqui lista docente es la vista
	//listadoDocente es la lista
	ModelAndView transportador = new ModelAndView("listaDocentes");
	transportador.addObject("listadoDocentes", docenteService.listarTodosDocentesActivos()); //estamos llamando al almacen de docentes
	return transportador;

	}
//Eliminar docente
@GetMapping("/eliminarDocente/{dni}") 
public ModelAndView deleteDocente (@PathVariable String dni) {
docenteService.eliminarDocente(dni);

//muestra el nuevo listado
ModelAndView modelView = new ModelAndView("listaDocentes");
modelView.addObject("listadoDocentes", docenteService.listarTodosDocentesActivos());
return modelView;
}

//Modificar
@GetMapping("/modificarDocente/{dni}") 
public ModelAndView modificarDocente (@PathVariable String dni) {
	//el parametro ModelAndView es la vista html
	ModelAndView modelView = new ModelAndView("docente");
	
	modelView.addObject("docente", docenteService.consultarDocente(dni) );
	
	return modelView;
}

}
